package day23_thread;

import javax.swing.JButton;

//second way: define our own Thread class
public class MonsterThread extends Thread{

	private JButton btn;
	public MonsterThread(JButton btn) {
		this.btn = btn;
	}
	
	@Override
	public void run() {
		int y = btn.getY();
		int step = 10;
		while(true) {
			int x = btn.getX();
			if(x>=520 || x<=0) {
				step *= -1;
			}
			x+=step;
			btn.setLocation(x, y);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
