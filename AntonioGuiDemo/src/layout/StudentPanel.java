package layout;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudentPanel extends JPanel{
	public StudentPanel() {
		setBackground(Color.pink);
		setLayout(null);
		
		JLabel lbl = new JLabel("Welcome to Student Module");
		lbl.setBounds(10, 100, 400, 300);
		lbl.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		add(lbl);
	}
}
