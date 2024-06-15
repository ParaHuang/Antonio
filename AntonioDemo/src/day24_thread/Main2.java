package day24_thread;

//multiple threads cooperate 
//2. interrupt Thread 
public class Main2 {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Thread 1 just finshed something, now it's gonna sleep");
				try {
					Thread.sleep(Integer.MAX_VALUE);
				} catch (InterruptedException e) {
					//e.printStackTrace();
					System.out.println("after t2 finished, keep going to do the rest stuffs");
				}
				//xxxxxx
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=10 ; i++) {
					System.out.println("AA"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				t1.interrupt();//wake up t1 manually
				//xxxxxx
			}
		};
		
		
		t1.start();
		t2.start();
		
		
		
	}

}
