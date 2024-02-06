package day1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		//8   basic type:
		//int long short      double float      boolean     char      byte
		int x = 10;
		double y = 42.3;
		//Objective type
		String z = "hello";
		
		//define a variable in Java, and assign value
//		type name = value;
		//create a scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please input a year");
		
		//scan what you will input
		//enter a number, and save it in the variable year
		int year = scan.nextInt();
		
		
		//priority : && > ||
		//leap year
		//1.can be divided by 400
		//     year % 400 == 0
		//2.can be divided by 4 , but not by 100
		//     year % 4 == 0    &&     year % 100 != 0
		if(year % 400 == 0  || year % 4 == 0 && year % 100 != 0) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is common year");
		}
	}

}

