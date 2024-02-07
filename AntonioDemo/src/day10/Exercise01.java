package day10;

import javax.swing.JOptionPane;

/*Vehicle
start()
stop()--"stop, I arrived"

Car
start()--"Refuel, then speed up"
stop()--"stop, I arrived"

Bicycle
start()--"keep rotating pedals, that's how you ride"
stop()--"stop, I arrived"

Bus
start()--"put 1 dollar into box"
stop()--"stop, I arrived"

Human
goHome(???)--"time to go home"->start()->"stop, I arrived"->"arrived home"
*/

public class Exercise01 {
	public static final double PI = 3.1415926;//const name is all capital
	public static void main(String[] args) {
//		PI = 3.14;//wrong , because PI is const, it's not allowed to revalue
//		double x = Math.PI;
		Human h1 = new Human();
		Bicycle bicycle = new Bicycle();
		Bus bus = new Bus();
		Car car = new Car();
		h1.goHome(bicycle);
		System.out.println("====================");
		h1.goHome(bus);
		System.out.println("====================");
		h1.goHome(car);
		System.out.println("====================");
		
	}
	
}



class Human {
	public void goHome (Vehicle v) {
		System.out.println("time to go home");
		v.start();
		v.stop();
		System.out.println("arrived home");
	}
}

abstract class Vehicle {
	//1.override method is essential for polymorphism
	//2.the method body of start in Vehicle hasn't been used yet
	
	
	//1.if a method is important, but how we write it is not important
	//then we can delete this method body
	//2.if a method has no body, then this an abstract method
	//3.if a class has abstract method, then this class is also abstract
	//4.all the Subclass are forced to override those abstract method in SuperClass
	public abstract void start();
	public void stop() {
		System.out.println("stop, I arrived");
	}
}


class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println("Refuel, then speed up");
	}
	
}

class Bicycle extends Vehicle {
	public void start() {
		System.out.println("keep rotating pedals, that's how you ride");
	}
}

class Bus extends Vehicle {
	public void start() {
		System.out.println("put 1 dollar into box");
	}
}