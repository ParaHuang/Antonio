package day12;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		//8 primitive type:  short  int  long      double float       char       boolean      byte
		//objective type:  String    Scanner   Random  List ArrayList   Human  Chinese
		//Wrapper class: it's the objective type for primitive type 
		
		List<Integer> list = new ArrayList<>();
		//int<->Integer
		
//		int x = 8;
//		Integer y = x;
//		int z = y;
		
		int a = (int) 3.14;
		
		list.add(88);
		list.add(22);
		list.add(11);
		list.add(66);
		list.add(77);
		list.add(9);
		
		//remove
		Integer data = list.remove(2);
		System.out.println("the data just removed is:"+data);
		//cast
		boolean flag = list.remove((Integer)66);
		System.out.println(flag);
		
		System.out.println();
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
	}

}

