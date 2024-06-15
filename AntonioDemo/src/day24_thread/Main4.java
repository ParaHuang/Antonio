package day24_thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//multiple threads compete for the same resource 
//the version with problem
public class Main4 {

	public static void main(String[] args) {
		Random random = new Random();
		//lottery pool : {100,20,5,5,10,200,500,50,10,8}

		//prize box 1:20,200,50,100,10
		//prize box 2:5,10,8,5,500
		
		int[] ary = {100,20,5,5,10,200,500,50,10,8};
		List<Integer> list = new ArrayList<Integer>();
		for(int a:ary) {
			list.add(a);
		}
			
		Thread box1 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=5 ; i++) {
					//generate a position/index
					int index = random.nextInt(list.size());
					
					//show the prize under that position
					System.out.println("Box 1 just draw lottery "+i+",the prize is:"+list.get(index));
					
					//remove it from pool
					list.remove(index);
				}
			}
		};

		
		Thread box2 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=5 ; i++) {
					//generate a position/index
					int index = random.nextInt(list.size());
					
					//show the prize under that position
					System.out.println("Box x just draw lottery "+i+",the prize is:"+list.get(index));
					
					//remove it from pool
					list.remove(index);
				}
			}
		};
		
		box1.start();
		box2.start();
		
	}

}








