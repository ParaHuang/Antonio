package day24_thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//multiple threads compete for the same resource 
//the version fixed problem
public class Main5 {

	public static void main(String[] args) {
		
		Drawing d = new Drawing();
			
		Thread box1 = new Thread(d,"A");
		Thread box2 = new Thread(d,"B");
		
		box1.start();
		box2.start();
		
	}

}

//synchronized:wait in a queue
//asynchronized:happen at the same time	

class Drawing implements Runnable{
	private Random random = new Random();
	private int[] ary = {100,20,5,5,10,200,500,50,10,8};
	private List<Integer> list = new ArrayList<Integer>();
	
	public Drawing() {
		for(int a:ary) {
			list.add(a);
		}
	}
	
	@Override
	public void run() {
		for(int i=1 ; i<=5 ; i++) {
			getPrize();
		}
	}
	
	public synchronized void getPrize() {
		//generate a position/index
		int index = random.nextInt(list.size());
		
		//show the prize under that position
		System.out.println("Box "+Thread.currentThread().getName()+" just draw lottery,the prize is:"+list.get(index));
		
		//remove it from pool
		list.remove(index);
	}
}





























