package day22_thread;

public class Main1 {

	public static void main(String[] args) {
		
//		for(int i=1 ; i<=10 ; i++) {
//			System.out.println("AA"+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		for(int i=1 ; i<=10 ; i++) {
//			System.out.println("BB"+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		
		//1.create a Thread object directly
		Thread t1 = new Thread() {
			@Override
			public void run() {
				//whatever program you want it run automatically, write it here
				for(int i=1 ; i<=10 ; i++) {
					System.out.println("AA"+i);
					try {
						Thread.sleep(1000);
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
				//whatever program you want it run automatically, write it here
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
		
		//2.start it
		t1.start();
		t2.start();
		
		
	}

}

