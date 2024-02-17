package day11;

public class Main1 {

	public static void main(String[] args) {
		GameMahine ps5 = new PS5();
		Nintendo nintendo = new Nintendo();
		XBox xbox = new XBox();		
		
		YoungPeople Antonio = new YoungPeople();
		Antonio.haveFun(ps5);
		System.out.println();
		Antonio.haveFun(nintendo);
		System.out.println();
		Antonio.haveFun(xbox);
		System.out.println();
		System.out.println();
		
		Polariod polariod = new Polariod();
		GoPro goPro = new GoPro();
		DigitalCamera digital = new DigitalCamera();
		Antonio.recordGoodMemory(polariod);
		System.out.println();
		Antonio.recordGoodMemory(goPro);
		System.out.println();
		Antonio.recordGoodMemory(digital);
		System.out.println();
		
		Cellphone cellphone = new Cellphone();
		Antonio.haveFun(cellphone);//cellphone is also a GameMachine
		Antonio.recordGoodMemory(cellphone);//cellphone is also a Camera
	}

}

class YoungPeople{
	public void haveFun(GameMahine machine) { 
		System.out.println("time to have fun");
		machine.playGames();
	}
	
	public void recordGoodMemory(Camera c) {
		System.out.println("it's fun, let's record it");
		c.takePicture();
	}
}

interface GameMahine{
	void playGames();
}
//1.if inside of an abstract class, there are only abstract methods, 
//  then we can make this abstract class into interface
//2.interface should be implements , not extends
//3.inside of an interface, methods are all abstract and public 
//4.a class can implements many different interface
interface Camera{
	void takePicture();
}

class PS5 implements GameMahine{
	@Override
	public void playGames() {
		System.out.println("PS5:buy a game CD，connect with TV，there we go!");
	}
}

class Nintendo implements GameMahine{
	@Override
	public void playGames() {
		System.out.println("Nintendo:turn it on，choose a game，playing alone，so nice");
	}
}

class XBox implements GameMahine{
	@Override
	public void playGames() {
		System.out.println("XBox:connect with TV,choose a game from game store, then play");
	}
}

class Polariod implements Camera{
	@Override
	public void takePicture() {
		System.out.println("press the shutter, get an instant photo");
	}
}

class GoPro implements Camera{
	@Override
	public void takePicture() {
		System.out.println("diving into ocean,let's memorize this beautiful world");
	}
}

class DigitalCamera implements Camera{
	@Override
	public void takePicture() {
		System.out.println("press the shutter,get an digital picture");
	}
}

//how should I define Cellphone?
class Cellphone implements GameMahine,Camera{
	@Override
	public void takePicture() {
		System.out.println("take my phone out, take a picture that I can watch it everyday");
	}

	@Override
	public void playGames() {
		System.out.println("take my phone out, login, play some online games with my teammates");
	}
	
}

class A{}
class B{}
//can C extends both A and B?  NO -- 
//single extends. every class can only have one directly super clas
class C extends A{}

//F can implements more than one interface
//multiple implements
interface D{}
interface E{}
interface G{}
class F extends A implements D,E,G{}












