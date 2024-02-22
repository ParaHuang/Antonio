package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		//keep input numbers, save them in a collection
		//eventually in this collection we only need 5 different element
		
		//list.contains(value)  to check if this list contains the value
		List<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(list.size()<5) {
			System.out.println("please enter a number:");
			int x = scanner.nextInt();
			//check if x exist in list
			//if not, add it into list
			if(!list.contains(x)) {
				list.add(x);
			}
			
		}
		
		System.out.println(list);
	}

}

