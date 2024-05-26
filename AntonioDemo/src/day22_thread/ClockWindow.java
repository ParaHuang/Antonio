package day22_thread;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockWindow extends JFrame{
	public ClockWindow() {
		setTitle("Calendar");
		setSize(500, 400);
		setLocation(500, 300);
		//set close the window, then exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel lbl = new JLabel("original text");
		Font f = new Font("Comic Sans MS", Font.BOLD, 30);
		lbl.setFont(f);
		add(lbl);
		
		//use main thread to control time change
		//then this window can't do anything else
		//so we need to use a different thread to control time
		Thread t = new Thread() {
			@Override
			public void run() {
				//counting
				int i=1;	
				while(true) {
					lbl.setText(i+"");
					i++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		t.start();
		
		//exercise: Calendar
	}

}














