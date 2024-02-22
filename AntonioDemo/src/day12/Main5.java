package day12;

import java.util.HashSet;
import java.util.Set;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<Integer> set = new HashSet<Integer>();
		Set<Integer> set = new HashSet<>();
		//add element
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(22);
		set.add(44);
		set.add(11);
		
		set.remove(22);
		System.out.println(set.size());
		
		for(int e:set) {
			System.out.println(e);
		}
		
	}

}













