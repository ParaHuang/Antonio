package day18_thread;

public class Main1 {

	public static void main(String[] args) throws InterruptedException  {
		//Thread
		//1. a program contains many task, each task is maintained by a thread
		//2. each program at least has one thread, and we call it main thread
		//3. inside of the same thread, code has to be execute by flow
		//4. if you want multi task run at the same time , then you need multi thread to manage those task
		

		for(int i=1 ; i<=10 ; i++) {
			System.out.println("AA"+i);
			Thread.sleep(300);
		}
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("BB"+i);
			Thread.sleep(300);
		}
		
		
		
		
	}

}

