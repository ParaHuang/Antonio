package day1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
//		Random
//		define a variable, which is Random type
//		type name = value;				//suits to basic type and String
//		Type name = new Type();     	//suits to other type
		Random random = new Random();
		//create a random number
//		int num = random.nextInt();	//generate a int number, we can't control the range
//		int num = random.nextInt(3);//0~2
//		int num = random.nextInt(a, b);//a~b-1
		int num = random.nextInt(1, 5);
		
		
		System.out.println(num);
	}

}

