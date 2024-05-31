package day23_thread;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameFrame_3rdWay extends JFrame{
	public GameFrame_3rdWay() {
//		setSize(600, 500);
//		setLocation(300, 300);
		setBounds(300, 300, 600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();//create a panel
		setContentPane(contentPane);//set it as the ContentPane of this window
		contentPane.setBackground(Color.RED);
		contentPane.setLayout(null); //layout:a way to put component,default:FlowLayout
		
		JLabel lbl = new JLabel("Hello");
		lbl.setBounds(10, 10, 100, 30);
		contentPane.add(lbl);
		
		Monster btn1 = new Monster("btn1");
		btn1.setBounds(100, 100, 80, 80);
		Monster btn2 = new Monster("btn2");
		btn2.setBounds(400, 300, 80, 80);
		Monster btn3 = new Monster("btn3");
		btn3.setBounds(310, 400, 80, 80);
		
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);
		

	}
}
