package layout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class GirdLayoutFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirdLayoutFrame frame = new GirdLayoutFrame();
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
	JButton[] btns = new JButton[100];
	public GirdLayoutFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
//										   rows  columns	rgap  cgap
		contentPane.setLayout(new GridLayout(10, 10        , 2 , 2));
		
		try {
		    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		//Functional Interface
//		ActionListener listener = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(btn.getBackground() == Color.PINK) {
//					btn.setBackground(Color.BLUE);
//				}else{
//					btn.setBackground(Color.PINK);
//				}
//			}
//		};
		//lambda
		ActionListener listener = (e)->{
			//method body
			String command = e.getActionCommand();//nickname
//			System.out.println(command);
			int i = Integer.parseInt(command);
			//current button
			changeColor(i);
			//up
			changeColor(i-10);
			//down
			changeColor(i+10);
			//left
			changeColor(i-1);
			//right
			changeColor(i+1);
		};
		
		
		
		for(int i=0 ; i<100 ; i++) {
			btns[i] = new JButton();
			btns[i].setBackground(Color.PINK);
			btns[i].setActionCommand(i+"");//set up nickname for every button
			contentPane.add(btns[i]);
			btns[i].addActionListener(listener);
			
		}
		
	}

	public void changeColor(int index) {
		if(btns[index].getBackground() == Color.PINK) {
			btns[index].setBackground(Color.BLUE);
		}else{
			btns[index].setBackground(Color.PINK);
		}
	}
}
