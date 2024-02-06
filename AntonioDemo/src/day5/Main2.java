package day5;
//OOP--> Object Oriented Programing
public class Main2 {

	public static void main(String[] args) {
		//  Array : a thing to union several variables in the same type
		//campus dorm 
		//1. define an Array
		//type[] aryName = new type[length];
		int[] ary = new int[5];	//defined an array, it's going to save 5 values 
		//2. operate Array
		//	a. assign a balue
		//   aryName[index] = value;   //index:0~ length-1
//		ary[0] = 11*1;	
//		ary[1] = 11*2;
//		ary[2] = 11*3;
//		ary[3] = 11*4;
//		ary[4] = 11*5;
		//ary[5] = 66;		//wrong: index out of bounds
		
//		for(int x=0 ; x<ary.length ; x++) {
//			ary[x] = 11*(x+1);
//		}

		for(int i=0 ; i<ary.length ; i++) {
			ary[i] = 11*(i+1);
			System.out.println(ary[i]);
		}
		
		
//		System.out.println(ary[0]);
//		System.out.println(ary[1]);
//		System.out.println(ary[2]);
//		System.out.println(ary[3]);
//		System.out.println(ary[4]);
//		
//		
//		int a = 11;	//11*1
//		int b = 22;
//		int c = 33;
//		int d = 44;
//		int e = 55;
//
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//
//		a+=1;
//		b+=1;
//		c+=1;
//		d+=1;
//		e+=1;
//
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
	
		
		
	}

}

