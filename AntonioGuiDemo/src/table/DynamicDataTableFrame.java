package table;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import table.tools.UneditableTableModel;

public class DynamicDataTableFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DynamicDataTableFrame frame = new DynamicDataTableFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DynamicDataTableFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 33, 376, 207);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		try {
			setData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon?useSSL=false",
                "root","a123");

        String sql = "select * from userTable";
        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs =  ps.executeQuery();
        
        //move cursor to the last row
        rs.last();
        //get the row number of last row
        int rows = rs.getRow();
        //recover cursor
        rs.beforeFirst();
        
        //define 2D array
        Object[][] data = new Object[rows][5];
        int i=0;//to record current row
        while (rs.next()){
        	data[i][0] = rs.getString(1);
        	data[i][1] = rs.getString(2);
        	data[i][2] = rs.getString(3);
        	data[i][3] = rs.getString(4);
        	data[i][4] = rs.getString(5);
        	i++;
        }
        
        

		Object[] titles = {"username","password","nickname","registerDate","introduction"};
		UneditableTableModel model = new UneditableTableModel(data, titles);
		table.setModel(model);
		
		rs.close();
		ps.close();
		conn.close();
	}
}










