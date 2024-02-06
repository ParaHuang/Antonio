package day3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		/*
		//limit times of loop
		//1.certain times of loop   (3 essential thing：abc)
		int i = 1;	//a.initial values
		while(i<=100) {//b.condition
			System.out.println("hello");
			i++;//c.increment
		}
		*/
		//2.limit times of loop but without knowing how many times exactly
		//you want to open a pet store
		//now you need to buy pets(puppy and cat)
		//stop buying if you have 5 puppies 
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int total = 0;
		while(true) {
			System.out.println("do you want to buy 1.puppy or 2.cat:");
			int option = scan.nextInt();
			total++;
			
			if(option==1) {
				//puppy
				count++;
			}

			if(count==5) {
				break; //stop the loop
			}
		}
		
		System.out.println("finished. we have "+total+" pets, including "+count+" puppies");
		
	}

}

