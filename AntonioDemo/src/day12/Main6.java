package day12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main6 {

	public static void main(String[] args) {
		//keep input numbers, save them in a collection
		//eventually in this collection we only need 5 different element
		Set<Integer> set = new HashSet<Integer>();
		//11 11 33 44 55   66
		Scanner scanner = new Scanner(System.in);
		
		while(set.size()<5) {
			System.out.println("please eneter a number:");
			int x = scanner.nextInt();
			set.add(x);
		}
		
		System.out.println(set);
	}

}

