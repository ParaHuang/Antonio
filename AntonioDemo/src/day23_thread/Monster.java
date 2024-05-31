package day23_thread;

import javax.swing.JButton;

public class Monster extends JButton implements Runnable{
	public Monster(String name) {
//		super(name);//set the name as text of this button
		setText(name);
		Thread t = new Thread(this);
//		t.start();
	}
	
	@Override
	public void run() {
		int y = this.getY();
		int step = 10;
		while(true) {
			int x = getX();
			if(x>=520 || x<=0) {
				step *= -1;
			}
			x+=step;
			setLocation(x, y);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
