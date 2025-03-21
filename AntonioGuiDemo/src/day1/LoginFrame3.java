package day1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame3 extends JFrame{

	public static void main(String[] args) {
		LoginFrame3 frame = new LoginFrame3();
		frame.setVisible(true);
	}
	
	public LoginFrame3() {
		setSize(500, 400);
		setTitle("welcome to login");
		setLocationRelativeTo(this);
		
//		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//shut down the program when you close the window

		JPanel contentPnl = new JPanel();					
		setContentPane(contentPnl);
		contentPnl.setLayout(null);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(100, 200, 120, 30);
		contentPnl.add(loginBtn);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.setBounds(240, 200, 120, 30);
		contentPnl.add(registerBtn);
		
		//JTextField:input box
		JTextField accountFiled = new JTextField();
		accountFiled.setBounds(140, 80, 230, 30);
		contentPnl.add(accountFiled);	
		
		JPasswordField passwordFiled = new JPasswordField();
		passwordFiled.setBounds(140, 130, 230, 30);
		contentPnl.add(passwordFiled);
		
		//JLabel
		JLabel accountLabel = new JLabel("Account:");
		accountLabel.setBounds(60, 80, 120, 30);
		contentPnl.add(accountLabel);
		
		//change the variable with same name all at once
		//shift + alt + R
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(60, 130, 120, 30);
		contentPnl.add(passwordLabel);
		
		
		//callback
		//listener
		loginBtn.addActionListener(new ActionListener() {
			//anytime if you click on this button, then the thing you defined in this method will happen immediately
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("hello");
				//admin,123
				//1.get the text in input box
				String account = accountFiled.getText();
				String password = passwordFiled.getText();
				//2.judge
				if(account.equals("admin") && password.equals("123")) {
//					System.out.println("welcome");
					//open a different Window
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					//close the current window
					dispose();
				}else {
//					System.out.println("invalid account or password");
					JOptionPane.showMessageDialog(null, "invalid account or password");
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
	}	

}
