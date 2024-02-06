package day4;

public class Main4 {

	public static void main(String[] args) {
//		System.out.print("a");
//		System.out.print("b");
//		System.out.print("c");
//		//abc
//		//a
//		//b
//		//c
//		System.out.println();
//		
//		System.out.println("a");
//		System.out.println("b");
//		System.out.println("c");
		
//		ln:  line
		
		for(int i=1 ; i<=10 ; i++) {//use outside loop  to control rows
			for(int j=1; j<=i ; j++) {//use inside loop to control columns
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();

		for(int i=10 ; i>=1 ; i--) {
			for(int j=1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}



