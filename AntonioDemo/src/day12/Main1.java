package day12;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		/*
//		int[] ary = {11,22,33,55,2,89};
		int[] ary = new int[6];
		ary[0] = 11;
		ary[1] = 22;
		ary[2] = 33;
		ary[3] = 44;
		ary[4] = 55;
		ary[5] = 66;
//		ary[6] = 77;  //wrong,index out of bounds
		
		System.out.println(ary[0]);
		System.out.println(ary[1]);
		System.out.println(ary[2]);
		System.out.println(ary[3]);
		System.out.println(ary[4]);
		System.out.println(ary[5]);
		*/
		//Collection:like a container to save a lot of data
		//List
		//1.instantiate
		ArrayList list = new ArrayList();
//		List list = new ArrayList();
		//2.add data into list
		list.add(11);
		list.add(3.14);
		list.add("hello");
		list.add("true");
		list.add('w');
		//3.get data out of list by index
		Object o1 = list.get(0);
		System.out.println(o1);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
	}

}














