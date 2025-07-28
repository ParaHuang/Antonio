package day1;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class RegisterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField accountField;//global variable
	private JTextField passwordField;
	private JTextField confirmField;
	private JLabel lblGender;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFrame frame = new RegisterFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegisterFrame() {//local variable
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 100, 450, 695);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Welcome to Sign Up");
		lbl1.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lbl1.setBounds(87, 64, 310, 41);
		contentPane.add(lbl1);
		
//							font family       style      size
		Font font = new Font("Lucida Grande", Font.PLAIN, 20);
		
		accountField = new JTextField();
		accountField.setFont(font);
		accountField.setBounds(164, 147, 259, 41);
		contentPane.add(accountField);
		accountField.setColumns(10);
		
		JLabel lbl2 = new JLabel("Account:");
		lbl2.setFont(font);
		lbl2.setBounds(58, 153, 102, 29);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("Password:");
		lbl3.setFont(font);
		lbl3.setBounds(58, 214, 102, 29);
		contentPane.add(lbl3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(font);
		passwordField.setColumns(10);
		passwordField.setBounds(164, 208, 259, 41);
		contentPane.add(passwordField);
		
		JLabel lbl4 = new JLabel("Confirm Password:");
		lbl4.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lbl4.setBounds(6, 275, 158, 29);
		contentPane.add(lbl4);
		
		confirmField = new JPasswordField();
		confirmField.setFont(font);
		confirmField.setColumns(10);
		confirmField.setBounds(164, 267, 259, 41);
		contentPane.add(confirmField);
		
		lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblGender.setBounds(58, 333, 102, 29);
		contentPane.add(lblGender);
		
		
		JRadioButton maleBtn = new JRadioButton("Male");
		maleBtn.setSelected(true);//set male is selected by default
		maleBtn.setBounds(161, 338, 83, 23);
		contentPane.add(maleBtn);
		
		JRadioButton femaleBtn = new JRadioButton("Female");
		femaleBtn.setBounds(257, 338, 141, 23);
		contentPane.add(femaleBtn);
		//to keep 2 radio buttons in the same category
		ButtonGroup group = new ButtonGroup();
		group.add(maleBtn);
		group.add(femaleBtn);
		

		JLabel lblHobby = new JLabel("Hobby:");
		lblHobby.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblHobby.setBounds(58, 392, 102, 29);
		contentPane.add(lblHobby);
		
		JCheckBox singCheck = new JCheckBox("Sing");
		singCheck.setSelected(true);
		singCheck.setBounds(159, 397, 72, 23);
		contentPane.add(singCheck);
		
		JCheckBox swimCheck = new JCheckBox("Swiming");
		swimCheck.setBounds(235, 397, 94, 23);
		contentPane.add(swimCheck);
		
		JCheckBox danceCheck = new JCheckBox("Dance");
		danceCheck.setBounds(335, 397, 72, 23);
		contentPane.add(danceCheck);
		
		List<JCheckBox> checks = List.of(singCheck,swimCheck,danceCheck);
		
		JLabel lblDescrible = new JLabel("Describle:");
		lblDescrible.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblDescrible.setBounds(58, 433, 102, 29);
		contentPane.add(lblDescrible);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(164, 444, 250, 109);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		

		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCountry.setBounds(58, 564, 102, 29);
		contentPane.add(lblCountry);
		
		String[] ary = {"USA","UK","China","Spain"};
		JComboBox comboBox = new JComboBox(ary);
		comboBox.setBounds(161, 565, 207, 29);
		contentPane.add(comboBox);
		
		
		JButton registerBtn = new JButton("Register");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//normally, inside of inner class,we are not allowed to use local variable unless it's final
				//therefore, if you already used a local variable here, that's because the jvm would take those local variable as final naturally				
				System.out.println(accountField.getText());
				System.out.println(passwordField.getText());
				System.out.println(confirmField.getText());
				System.out.println(maleBtn.isSelected()?"male":"female");
				String hobbyStr = "";
				for(JCheckBox box:checks) {
					if(box.isSelected()) {
						hobbyStr += box.getText()+" ";
					}
				}
				
				System.out.println(hobbyStr);
				System.out.println(textArea.getText());
				String country = comboBox.getSelectedItem().toString();
				
				//find out the index of the item selected
//				int index = comboBox.getSelectedIndex();
				
				
				System.out.println(country);
			}
		});
		registerBtn.setBounds(164, 621, 117, 29);
		contentPane.add(registerBtn);
		
		
		//		String hobbyStr = "";
		//		for(JCheckBox box:checks) {
		//			if(box.isSelected()) {
		//				hobbyStr += box.getText()+" - ";
		//			}
		//		}
		//		System.out.println(hobbyStr);
		
				
		
		
	}
	
	public void checkValid() {
		
	}
}
