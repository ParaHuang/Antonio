package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main1 {
	private static final int NUM_REM = 5;
	public static void main(String[] args) {
		Random random = new Random();
		/*
		List<String> list = new LinkedList<>();
		list.add("John");
		list.add("Jack");
		list.add("Alex");
		list.add("Helan");
		list.add("Cecilia");
		list.add("Mia");
		list.add("Sonia");
		list.add("Tomas");
		list.add("Tyler");
		list.add("Chris");
		
		for (int i=0 ; i<NUM_REM; i++) {
			String name = list.remove(random.nextInt(list.size()));
			System.out.println(name);
		}
		
		System.out.println(list);
		*/
		
		/*
		String[] ary = {"Jhon","Jack","Alex","Helan","Cecilia","Mia","Sonia","Tomas","Tyler","Chris"};
		Set<String> set = new HashSet<>();
		while(set.size()<5) {
			int index = random.nextInt(ary.length);
			System.out.println(ary[index]);
			set.add(ary[index]);
		}
		System.out.println(set);
		*/
		
//		Arrays: the tool of Array in java		
		List<String> list = Arrays.asList("Jhon","Jack","Alex","Helan","Cecilia","Mia","Sonia","Tomas","Tyler","Chris");
	
		//Collections:the tool of Collection in java		
		Collections.shuffle(list);
		for(int i=0 ; i<5 ; i++) {
			System.out.println(list.get(i));
		}
		
	}

}










