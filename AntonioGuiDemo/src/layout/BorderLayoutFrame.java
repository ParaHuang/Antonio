package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BorderLayoutFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayoutFrame frame = new BorderLayoutFrame();
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
	public BorderLayoutFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//
//		setContentPane(contentPane);
		
		
		//get the original contentPane,default layout is BorderLayout
		contentPane = (JPanel) getContentPane();
//		contentPane.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("Center button ");
		contentPane.add(btn1);	//default position:center

		JButton btn2 = new JButton("North button ");
		contentPane.add(btn2,BorderLayout.NORTH);

		JButton btn3 = new JButton("South button ");
		contentPane.add(btn3,BorderLayout.SOUTH);

		JButton btn4 = new JButton("East button ");
		contentPane.add(btn4,BorderLayout.EAST);

		JButton btn5 = new JButton("West button ");
		contentPane.add(btn5,BorderLayout.WEST);
			
		
	}

}
