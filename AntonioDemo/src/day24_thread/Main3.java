package day24_thread;

//multiple threads cooperate 
//3. one thread join the other one
public class Main3 {

	public static void main(String[] args) {
		Thread downloadingPic = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=100 ; i++) {
					System.out.println("downing picture:"+i+"%");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread watchingPic = new Thread() {
			@Override
			public void run() {
				System.out.println("I want to watch a picture");//don't have it yet
				for(int i=1 ; i<=5 ; i++) {
					System.out.println("AA"+i);
				}
				try {
					downloadingPic.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("I watched it, good picture");//have it
			}
		};
			
		downloadingPic.start();
		watchingPic.start();
		
		
		
	}

}
