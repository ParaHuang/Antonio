package day17_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main5 {

	public static void main(String[] args) {
		//post some article
		//replace the cursing word with f*****g
		String article = "today I stepped on a SHIT, holy molly,such a bad luck, what a FUCKING day....";
//		article.replace(noramrOldContent, normalNewContent);
//		article.replaceAll(regex, newContent);
//		article = article.replaceAll("(?i)shit|fucking|fuck|ass", "***");
//		System.out.println(article);
		
		
//		//define a rule
		Pattern p = Pattern.compile("shit|fucking|fuck|ass",Pattern.CASE_INSENSITIVE);
//		
//		//match the rule with article
		Matcher matcher = p.matcher(article);
//		
//		//find all cursing words
		while(matcher.find()) {
			String cursing = matcher.group();
//			System.out.println(cursing);
			//replace them by keeping the front and end character, but change the middle characters as *
			String part1 = cursing.substring(0,1);
			int len = cursing.substring(1,cursing.length()-1).length();
			String part2 = "";
			for(int i=0 ; i<len ; i++) {
				part2 += "*";
			}
			String part3 = cursing.substring(cursing.length()-1);
			String newContent = part1+part2+part3;
			
			article = article.replace(cursing, newContent);
		
			System.out.println(article);
		}
		
		
		
		
	}

}







