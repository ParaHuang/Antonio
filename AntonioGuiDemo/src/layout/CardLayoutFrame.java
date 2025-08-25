package layout;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class CardLayoutFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutFrame frame = new CardLayoutFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private CardLayout layout;
	private JPanel box;
	public CardLayoutFrame() {
		setTitle("School Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton studentBtn = new JButton("Student");
		studentBtn.setBounds(23, 54, 145, 55);
		contentPane.add(studentBtn);
		
		JButton teacherBtn = new JButton("Teacher");
		teacherBtn.setBounds(23, 142, 145, 55);
		contentPane.add(teacherBtn);
		
		JButton subjectBtn = new JButton("Subjects");
		subjectBtn.setBounds(23, 235, 145, 55);
		contentPane.add(subjectBtn);
		
		
		/*
		box
		|
		-----------------------------------------
		|				|						|
		stuPanel 		teacherPanel			subjectPnl
		|
		.......
		
		 */
		
//		JPanel stuPanel = new JPanel();
//		stuPanel.setLayout(null);
//		
//		JLabel lbl = new JLabel("Welcome to Student Module");
//		lbl.setBounds(10, 100, 400, 300);
//		stuPanel.add(lbl);

		box = new JPanel();
		box.setBounds(216, 6, 409, 390);
		contentPane.add(box);
		layout = new CardLayout();
		box.setLayout(layout);
		
		StudentPanel stuPanel = new StudentPanel();
		box.add("stu",stuPanel);//add a component with a name
		

		TeacherPanel teaPanel = new TeacherPanel();
		box.add("tea",teaPanel);

		SubjectPanel subPanel = new SubjectPanel();
		box.add("sub",subPanel);
		

		studentBtn.setActionCommand("stu");
		teacherBtn.setActionCommand("tea");
		subjectBtn.setActionCommand("sub");

		studentBtn.addActionListener(this);
		teacherBtn.addActionListener(this);
		subjectBtn.addActionListener(this);
		
		
//		studentBtn.addActionListener(e->{
//			layout.show(box, "stu");//cardlayout to show a certain card
//		});
//		
//		teacherBtn.addActionListener(e->{
////			layout.show(where, whichOne);
//			layout.show(box, "tea");
//		});
//		subjectBtn.addActionListener(e->{
//			layout.show(box, "sub");
//		});
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		layout.show(box, e.getActionCommand());
	}
}
