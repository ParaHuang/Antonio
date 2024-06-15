package day24_thread;

//multiple threads cooperate 
//1. the running time of one Thread decides by others
public class Main1 {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("Thread 1 is running");
					try {
						Thread.sleep(500);
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
				for(int i=1 ; i<=10 ; i++) {
					System.out.println("AA"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
//				t1.stop();
			}
		};
		Thread t3 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=10 ; i++) {
					System.out.println("BB"+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		t1.setDaemon(true);//this thread will be dead after every other thread finished
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
