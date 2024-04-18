package day17_regex;

public class Main3 {

	public static void main(String[] args) {
		String str1 = "Tom";
		String regex1 = "Jack|Mike|Tom";
		System.out.println(str1.matches(regex1));
		
//		[Mike] 1 character out of M i k e
		
		String str2 = "Mike";
		String regex2 = "Ja(ck|Mi)ke";
		System.out.println(str2.matches(regex2));
		
		//
		String month = "10";
		String monthRegex = "[1-9]|1[0-2]";  //1 2 3 8 9   or    10 11 12 
		System.out.println(month.matches(monthRegex));
		
		String date = "32";
		String dateRegex = "[1-9]|[12]\\d|3[01]"; //1-31
		System.out.println(date.matches(dateRegex));
		
		//4 digit palindromic number
		String str3 = "1881"; 
		System.out.println(str3);
		String regex3 = "([1-9])(\\d)\\2\\1";
		System.out.println(str3.matches(regex3));
		
		
	}

}










