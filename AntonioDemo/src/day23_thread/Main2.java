package day23_thread;

//3rd way:define a different class to deal with run method
public class Main2 {

	public static void main(String[] args) {
		
		DealWithRun r1 = new DealWithRun();
		Thread t = new Thread(r1);
		t.start();
	}

}

class DealWithRun implements Runnable{

	@Override
	public void run() {
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
	
}
