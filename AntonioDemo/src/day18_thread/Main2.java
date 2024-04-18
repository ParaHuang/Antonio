package day18_thread;

public class Main2 {

	public static void main(String[] args) {
		// 1.create a thread object,
		// meanwhile define the task of this thread by override the run method
		Thread t1 = new Thread() { 
			//whatever you want thread do, write it in run method
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("AA" + i);
					try {
						Thread.sleep(100);
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
				for (int i = 1; i <= 10; i++) {
					System.out.println("BB" + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		};

		// 2.start the thread
		t1.start();
		t2.start();

	}
}






