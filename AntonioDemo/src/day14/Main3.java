package day14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main3 {

	public static void main(String[] args) {
		/*
//		Set<String> set = new HashSet<>();//no order
//		Set<String> set = new TreeSet<>();//character order:number<Capital<lower case
		Set<String> set = new LinkedHashSet<>();//saving order
		set.add("Hello");
		set.add("Hola");
		set.add("Alex");
		set.add("Mike");
		set.add("Zoe");
		set.add("Alex");
		set.add("1Alex");
		
		for(String s:set) {
			System.out.println(s);
		}
		*/

//		Map<String, Object> map = new HashMap<String, Object>();
//		Map<String, Object> map = new TreeMap<String, Object>();
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		//save
//		map.put("key you want to identify the value", value);
		map.put("no", 1);
		map.put("name", "Jack");
		map.put("age", 18);
		map.put("gender", "male");
		
		Set<String> set = map.keySet();
		for(String key:set) {
			System.out.println(key+"--"+map.get(key));
		}
	}

}

