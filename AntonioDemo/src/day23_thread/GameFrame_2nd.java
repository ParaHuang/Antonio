package day23_thread;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameFrame_2nd extends JFrame{
	public GameFrame_2nd() {
//		setSize(600, 500);
//		setLocation(300, 300);
		setBounds(300, 300, 600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		JPanel contentPane = new JPanel();//create a panel
//		setContentPane(contentPane);//set it as the ContentPane of this window
		JPanel contentPane = (JPanel) getContentPane();
		contentPane.setBackground(Color.RED);
		contentPane.setLayout(null); //layout:a way to put component,default:FlowLayout
		
		JLabel lbl = new JLabel("Hello");
		lbl.setBounds(10, 10, 100, 30);
		contentPane.add(lbl);
		
		JButton btn1 = new JButton("btn1");
		btn1.setBounds(100, 100, 80, 80);
		JButton btn2 = new JButton("btn2");
		btn2.setBounds(400, 300, 80, 80);
		JButton btn3 = new JButton("btn3");
		btn3.setBounds(310, 400, 80, 80);
		
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);

		MonsterThread t1 = new MonsterThread(btn1);
		MonsterThread t2 = new MonsterThread(btn2);
		MonsterThread t3 = new MonsterThread(btn3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
