package day14;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {11,22,33,44,77,55};
		int index = -4;
//		printElement(ary, index);
//		fun();
	
		try {
			fun4();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("the end of programe");
	}
	
	public static void printElement(int[] ary, int index) {
		if(index<0 || index>=ary.length) {
			System.out.println("index out of bounds");
		}else {
			System.out.println(ary[index]);
		}
	}
	
	public static void fun() {
		//compiler only detect syntax error
		//find the Class object by the path
		try {
			Class.forName("hello");//leaves me a compile error
		} catch (ClassNotFoundException e) {
			System.out.println("invalid class path");
//			e.printStackTrace();
		}
		System.out.println("the end of program");
	}
	public static void fun4() throws ClassNotFoundException {
		fun3();
	}
	
	public static void fun3() throws ClassNotFoundException {
		fun2();
	}
	
	//1.when you are defining a method with some code has exception
	//2.and this method is called with other codes with exception
	public static void fun2() throws ClassNotFoundException {
		Class.forName("java.lag.String");
	}

}

