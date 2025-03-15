package day1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{

	public static void main(String[] args) {
		LoginFrame frame = new LoginFrame();
		frame.setVisible(true);
	}
	
	public LoginFrame() {
		//design the frame
		setSize(500, 400);
		setTitle("welcome to login");
		setLocationRelativeTo(this);				//set the window in the middle of the scrren
		//shut down the program when you close the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//content panel
		//1.get/set the content Panel
		JPanel contentPnl = (JPanel) getContentPane();
		//2.layout:a way to orginaze(BorderLayout)
		contentPnl.setLayout(null);
		
		// add component into panel
		JButton btn1 = new JButton("Login");
//		btn1.setBounds(x, y, width, height);
		btn1.setBounds(100, 200, 120, 30);
		contentPnl.add(btn1);
		
		JButton btn2 = new JButton("Register");
		btn2.setBounds(240, 200, 120, 30);
		contentPnl.add(btn2);
		
		//JTextField:input box
		JTextField accountFiled = new JTextField();
		accountFiled.setBounds(140, 80, 230, 30);
		contentPnl.add(accountFiled);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
