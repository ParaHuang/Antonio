package table;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import table.tools.UneditableTableModel;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class StaticDataTableFrame2 extends JFrame {

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
					StaticDataTableFrame2 frame = new StaticDataTableFrame2();
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
	public StaticDataTableFrame2() {
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
		
		Vector<Object> titles = new Vector<Object>();
		titles.add("number");
		titles.add("name");
		titles.add("age");
		titles.add("gender");
		
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		
		Vector<Object> row1 = new Vector<Object>();
		row1.add(1001);
		row1.add("Jack");
		row1.add(18);
		row1.add("male");
		data.add(row1);
		
		Vector<Object> row2 = new Vector<Object>();
		row2.add(1002);
		row2.add("Tom");
		row2.add(18);
		row2.add("male");
		data.add(row2);
		
		Vector<Object> row3 = new Vector<Object>();
		row3.add(1003);
		row3.add("Lucy");
		row3.add(18);
		row3.add("female");
		data.add(row3);

		TableModel model = new DefaultTableModel(data,titles);
//		TableModel model = new UneditableTableModel(data,titles);
		
		table.setModel(model);
		
		
		
		
	}
}
