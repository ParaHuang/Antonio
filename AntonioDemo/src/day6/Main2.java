package day6;

import java.util.Random;

//the entrance of program
public class Main2 {

	public static void main(String[] args) {
		//1.instantiate(create an object of a class)
		// Type objectName = new Type();	//new:create
		Human h1 = new Human();//create a real Human object, and save it in h1
		int a;
		
		a = 10;//assign a value to a variable
		System.out.println(a);//get the value of this variable
		
		//2.use
		// objectName.attribute = value;     //.     :     's    /   of
//		h1.name = "Para";
		h1.setName("Para");
//		h1.age = -33;
		h1.setAge(33);
//		h1.gender = "female";
//		h1.country = "China";
		
		// objectName.method();
		h1.eat();
		h1.sleep();
		
		System.out.println("==============");
		
		Human h2 = new Human();
//		h2.name = "Antonio";
		h2.setName("Antonio");
//		h2.age = 25;
		h2.setAge(25);
//		h2.gender = "male";
//		h2.country = "Spain";
		
		h2.eat();
		h2.sleep();
		
//		Random rand = new Random();
//		rand.nextInt()
	}

}

