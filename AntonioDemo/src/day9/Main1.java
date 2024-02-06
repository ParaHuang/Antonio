package day9;

//in a Java file, there is only one class has the same name as file name
//and this class has to be public 
public class Main1 {

	public static void main(String[] args) {
		/*
		Human c = new Chinese();
		c.eat();
		c.sleep();
//		c.kungFu();	//error. right now, we take Chinese object as Human, and Human doesn't know kungFu
		
		System.out.println("------------");
		
		Human s = new Spanish();
		s.eat();
		s.sleep();
		
		System.out.println("------------");
		
		Human a = new American();
		a.eat();
		a.sleep();
		*/
		
		Chinese c = new Chinese();
		c.kungFu();
		American a = new American();
		Human s = new Spanish();
		
		Company company = new Company();
		company.party(c);
		company.party(c);
		System.out.println("=============");
		company.party(a);
		company.party(a);
		System.out.println("=============");
		company.party(s);
		company.party(s);
		
		//polimorphism:one thing shows in different form
	}

}

//there is a company class, it has a party method
//rule: Only Human can join the party
//process:"party time"->people eat->"party's over,go home"->people sleep
class Company{
	public void party(Human h) {  //Human h<- Chinese c = new Chiese();
//								h.kungFu();//X		c.kungFun();//correct
		 //							Human h<- Human s = new Spanish();
		System.out.println("party time");
		h.eat();
		System.out.println("party's over,go home");
		h.sleep();
	}
//	public void party(American c) {
//		System.out.println("party time");
//		c.eat();
//		System.out.println("party's over,go home");
//		c.sleep();
//	}
}



//other classes have no modifier
class Human{
	public void eat() {
		System.out.println("time to eat");
	}
	
	public void sleep() {
		System.out.println("it's dark, close eyes, and sleep");
	}
}

class Chinese extends Human{
	@Override
	public void eat() {
		System.out.println("Chinese eat with chopsticks");
	}
	
	public void kungFu() {
		System.out.println("Chinese knows kungFu");
	}
}

class American extends Human{
	@Override
	public void eat() {
		System.out.println("American like pizzas");
	}
}

class Spanish extends Human{
	@Override
	public void eat() {
		System.out.println("Spanish like tapas");
	}
}



















