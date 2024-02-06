package day1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
//		System.out.println(88/10);//8   in Java, int operates with int , the result is still int, 
		//we just get rid of decimal part directly
		//5.enter an integer number in the range of 1 to 100，
		//print if this numbe has relationship with 7 
		//(if this number contians 7 or it's multiples of 7, 
		//then we consider it as having relationship with 7 )
		Scanner scan = new Scanner(System.in);
		System.out.println("please input a number which is from 1 to 100");
		
		int num = scan.nextInt();	
		//7  17   27  37  47 ....   second way :   
		//70  71  72   73 。。。  79
		
		//7  14   21   28   35  。。。。
		//  multiple    digital       tens
		if(num%7==0 || num%10==7 || num/10==7) {
			System.out.println(num+" has having relationship with 7");
		}else {
			System.out.println("no relationship");
		}
	}

}

