package day7;

public class Main1 {

	public static void main(String[] args) {
		//ClassName objectName = new ClassName();
		Human h1 = new Human();//new is calling the constructor
		
		h1.setName("Jack");
		h1.setAge(18);
		h1.setGender("male");
		h1.setCountry("UK");
		
		h1.eat();
		h1.sleep();

		String n = h1.getName();
		System.out.println("the name of this person is "+n);
		int a = h1.getAge();
		System.out.println("the age of this person is "+a);
		String g = h1.getGender();
		System.out.println("the gender of this person is "+g);
//		String c = h1.getCountry();
		System.out.println("the country of this person is "+h1.getCountry());
		
		System.out.println("================");
		Human h2 = new Human();
		h2.setName("Lucy");
		h2.setAge(160);
		h2.setGender("female");
		h2.setCountry("USA");
		h2.eat();
		h2.sleep();
		
//		Random rand = new Random();
//		int x = rand.nextInt(1,6);
		
		
		
		
		
		
		
		
		
		
	}

}

