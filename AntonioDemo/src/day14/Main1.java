package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		//exception: syntax are correct, but error happens when you are running it
		//if you don't deal with exception, then it will interrupt the program
		Scanner scanner = new Scanner(System.in);
		try {
			int x = scanner.nextInt();
//			System.out.println(1);
			int y = scanner.nextInt();
//			System.out.println(2);
			int z = x/y;
//			System.out.println(3);
			System.out.println("the result is "+z);
//			System.out.println(4);
		}catch (Exception e) {//crime
			System.out.println("something goes wrong");
		}finally {//the important thing that you have to execute no matter there is exception or not
			System.out.println("finally block");
		}
		
//		catch (ArithmeticException e) {//stealing
////			System.out.println("a number cannot divide by 0");
//			e.printStackTrace();//print the exception information
//		}catch (InputMismatchException e) {//robbing
//			System.out.println("you need to input integer number");
//		}
		System.out.println("the end of program");
	}

}

