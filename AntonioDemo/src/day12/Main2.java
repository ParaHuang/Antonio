package day12;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<E>  : generic, a data type restriction for Collection
		//   generic has to be objective type
		List<String> list = new ArrayList<>();
		
		//1.add element
		list.add("hello");
		list.add("world");
		list.add("hola");
		list.add("mucho gusto");
		list.add("soy");
		list.add("adios");
		list.add("world");

		//2.get element
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
		
		//3.remove an element
		//a.remove by index,return the element you just removed.be careful:index out of bounds
		String value = list.remove(2);
		System.out.println("the data you just remove:"+value);
		//b.remove the element directly, it returns a boolean data to represent that if you remove successfully
		//only remove the first exist one
		boolean flag = list.remove("world");
		System.out.println(flag);
		System.out.println();

		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println(list.contains("soy"));
	}

}









