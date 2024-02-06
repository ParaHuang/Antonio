package day7;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human("Jack",18,"male","Spain");	
		
//		h1.setName("Jack");
//		h1.setAge(18);
//		h1.setGender("male");
//		h1.setCountry("Spain");
		
		h1.eat();
		h1.sleep();
		
		System.out.println("=======================");
		
		//Alex 17 female UK
		Human h2 = new Human("Alex",17,"female","UK");
//		
		h2.eat();
		h2.eat("burger");
		h2.sleep();
		
		Random rand = new Random();
		int x = rand.nextInt();
		int y = rand.nextInt(5);
		int z = rand.nextInt(10,15);

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
				
				
				
				
				
				
				
				
	}

}

