package day8;

public class Main1 {

	public static void main(String[] args) {
		Human h = new Human();
		h.eat();
		h.sleep();
		
		System.out.println("---------------");
		
		Chinese c = new Chinese();
		c.eat();
		c.sleep();
		
		System.out.println("---------------");
		
		Spanish s = new Spanish();
		s.eat();
		s.sleep();
	}

}

