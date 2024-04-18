package day17_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Pattern patter = Pattern.compile("ab\\w");			//define a rule
		Matcher matcher = patter.matcher("the string to test:hello abd abw abx abh abs ldkf");		//use this rule to test a string
		System.out.println(matcher.matches());	//1.to see if the string is completely correct for rule
		
		/*
		//use what kind of way to test
		boolean f = matcher.find();	//2.to see if the string can find the rule
		System.out.println(f);
		System.out.println(matcher.group());	//get the content we found
		
		boolean f2 = matcher.find();
		System.out.println(f2);
		System.out.println(matcher.group());
		*/
//		while(true) {
//			boolean f2 = matcher.find();//looking for the content after last position
//			if(!f2) {
//				break;
//			}
//			System.out.println(f2);
//			System.out.println(matcher.group());
//		}
		
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		
	}

}









