package day5;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		//enter 5 integer number,after finished entering, print them out one by one, like
		// number x :  xxxxx   
		//(x:1~5)
		//calculate the average number of them
		
		Scanner scan = new Scanner(System.in);
		int[] ary = new int[5];
		double sum = 0;
		
		System.out.println("please eneter 5 integer number:");
		for(int i=0 ; i<ary.length ; i++) {
			ary[i] = scan.nextInt();
		}
		System.out.println("those numbers are:");

		for(int i=0 ; i<ary.length ; i++) {
			System.out.println("number "+(i+1)+" : "+ary[i]);
			sum += ary[i];   //ary[0] =11 sum+=11;   sum=11->11.0
		}
		
		double average = sum/5;
		System.out.println("the average of them is "+average);
		
	}
}


//44 -> 44		-> 44/5 = 8
//44 -> 44.0	-> 44.0/5 = 8.8





