package day12;

import java.util.LinkedList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<Integer>();

		list.add(11);
		list.add(33);
		list.add(55);
		list.add(44);
		list.add(33);
		list.add(11);
		
		
		
//		list.remove(0);
//		list.remove((Integer)55);
//		System.out.println(list.size());
		
		
		
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		//foreach(the loop without index)
		/*
		for(Type e:list/ary/set) {
			e would the element in list/ary/set one by one
		}
		*/
		System.out.println();
		for(int e:list) {
			System.out.println(e);
		}
	}

}











