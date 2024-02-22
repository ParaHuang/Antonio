package day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main8 {

	public static void main(String[] args) {
		//remove:  LinkedList
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> lList = new LinkedList<Integer>();
		
		for(int i=0 ; i<1000000 ; i++) {  //100000 elements, all values are 258
			aList.add(258);
			lList.add(258);
		}
		
		//how much time they will use to remove all elements?
		long t1 = System.currentTimeMillis();
		for(int i=0 ; i<1000000 ; i++) { 
			lList.remove(0);
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}

}

