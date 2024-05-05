package day19_file;

public class Recursion {

	public static void main(String[] args) {
//		fun1();
		fun2(9);
	}
	
	//1.inside of a method, you call that method itself
	//2.set a condition for exit
	static int x = 5;
	public static void fun1() {
		if(x==0) {
			return;
		}
		System.out.println("hello"+x--);
		fun1();
	}
	
	public static void fun2(int x) {
		if(x==0) {
			return;
		}
		System.out.println("hello"+x);
		x--;
		fun2(x);
	}

}









