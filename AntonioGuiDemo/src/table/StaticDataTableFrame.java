package table;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import table.tools.UneditableTableModel;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class StaticDataTableFrame extends JFrame {

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
					StaticDataTableFrame frame = new StaticDataTableFrame();
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
	public StaticDataTableFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 45, 341, 142);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		Object[] titles = {"number","name","age","gender"};
		Object[][] data = {
				{1001,"Jack",18,"male"},
				{1002,"Alex",18,"female"},
				{1003,"Lucy",18,"female"}
		};
		//define data
//		TableModel model = new DefaultTableModel( data-2DArray,titles-1DArray);
//		TableModel model = new DefaultTableModel(data,titles) {
//			@Override
//			public boolean isCellEditable(int row, int column) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//		};
		
		TableModel model = new UneditableTableModel(data,titles);
		
		table.setModel(model);
		
		
		
		
		
		
		
		
		
	}
}
