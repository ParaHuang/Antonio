package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		//no name age gender
		//1, Jack, 18,male --  different type, different meaning
		//OOP   class Student{ }
		
		//List
//		List list = new ArrayList();
//		list.add(1);
//		list.add(18);
//		list.add("male");
//		list.add("Jack");
		
//		System.out.println(list.get(1));
		
		//key-value pair 
		Map<String, Object> map = new HashMap<String, Object>();
		//save
//		map.put("key you want to identify the value", value);
		map.put("no", 1);
		map.put("name", "Jack");
		map.put("age", 18);
		map.put("gender", "male");
		map.put("name", "Mia");//replace the old value
		
		
		//get the value out
		System.out.println(map.get("no"));
		System.out.println(map.get("gender"));
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		
		Object age = map.get("age");
		System.out.println(age);
		
		System.out.println();
		
		//returns a set of keys
		Set<String> set = map.keySet();
		System.out.println(set);
		for(String key:set) {
			System.out.println(key+"--"+map.get(key));
		}
	}

}














