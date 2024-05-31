package day23_thread;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//GUI：graphic user interface
public class GameFrame extends JFrame{
	public GameFrame() {
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
		
		JButton btn1 = new JButton("btn1");
		btn1.setBounds(100, 100, 80, 80);
		JButton btn2 = new JButton("btn2");
		btn2.setBounds(400, 300, 80, 80);
		JButton btn3 = new JButton("btn3");
		btn3.setBounds(310, 400, 80, 80);
		
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);

		Thread t1 = new Thread() {
			@Override
			public void run() {
				int y = btn1.getY();
				boolean direction = true;
				while(true) {
					int x = btn1.getX();
					if(direction) {
						x+=10;
						if(x>=520) {
							direction=false;
						}
					}else {
						x-=10;
						if(x<=0) {
							direction=true;
						}
					}
					btn1.setLocation(x, y);
					try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				int y = btn2.getY();
				int step = 10;
				while(true) {
					int x = btn2.getX();
					if(x>=520 || x<=0) {
						step *= -1;
					}
					x+=step;
					btn2.setLocation(x, y);
					try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread t3 = new Thread() {
			@Override
			public void run() {
				int y = btn3.getY();
				int step = 10;
				while(true) {
					int x = btn3.getX();
					if(x>=520 || x<=0) {
						step *= -1;
					}
					x+=step;
					btn3.setLocation(x, y);
					try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
	}
}
