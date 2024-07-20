package day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> lList = new LinkedList<Integer>();
		
		//remove/insert:LinkedList is better than ArrayList
//		long t1 = System.currentTimeMillis();
//		for(int i=1 ; i<=100000 ; i++) {
//			aList.add(0, i);
//		}
//		long t2 = System.currentTimeMillis();
//		System.out.println(t2-t1+"--insert into ArrayList");
//		
//
//		long t3 = System.currentTimeMillis();
//		for(int i=1 ; i<=100000 ; i++) {
//			lList.add(0, i);
//		}
//		long t4 = System.currentTimeMillis();
//		System.out.println(t4-t3+"--insert into LinkedList");
		
		//query:LinkedList < ArrayList
		for(int i=1 ; i<=100000 ; i++) {
			aList.add(i);
			lList.add(i);
		}
		String str;
		
		long t1 = System.currentTimeMillis();
		for(int i=0 ; i<100000 ; i++) {
			aList.get(i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1+"--query ArrayList");
		

		long t3 = System.currentTimeMillis();
		for(int i=0 ; i<100000 ; i++) {
			lList.get(i);
		}
		long t4 = System.currentTimeMillis();
		System.out.println(t4-t3+"--query LinkedList");
		
	}

}







