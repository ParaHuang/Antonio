package day5;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prime number:is only divided by 1 or itself
		//2 3 5 7 11 13 17 19....
		
		//enter an integer number, say if xxx is a prime number or not
//		int num = 361;	//17*19	
//		
//		num%2 == 0 ?
//		num%3 == 0 ?
//		num%4 == 0 ?
//				. . .
//		num%17 == 0 ?      correct  --> 323 is not prime number, stop the %
//		. . .
//		num%(num-1) == 0?
//		
//		loop, start from 2, until ??? - i
//			to see if num is divisible by i
//				yes - this num is not prime number, stop the loop
		
		int x = 127;
		for(int i=2 ; i<Math.sqrt(x) ; i++) {
			System.out.println(x+"%"+i);
			if(x%i==0) {
				System.out.println(x+" is not prime number");
				return;
			}
		}
		System.out.println(x+" is prime number");
	}

}






