package day4;

public class Main5 {

	public static void main(String[] args) {
/*
					i			j-* 		k-space
    *				1			1				4		
   ***				2			3				3
  *****				3			5				2
 *******			4			7				1
*********			5			9				0	
					i			??				5-i
*/
		for(int i=1 ; i<=5 ; i++) {
			//print spaces
			for(int k=1 ; k<=5-i ; k++) {
				System.out.print(" ");
			}
//			System.out.print("@");
			//print stars
//			for(????) {
//				System.out.print("*");
//			}
			
			System.out.println();
		}
			
			
			
	}

}

