package day17_regex;

public class Main2 {

	public static void main(String[] args) {
		String str1 = "hello7784908";
		String regex1 = "hello\\d{2,6}";
		System.out.println(str1.matches(regex1));
		
		//email:
//		a.    contains @ and .　
//		b.    only contains @ and . for once               
//		c.    @ and . can't be in the begining or it the end     
//		d.    . can't be in front of or next to @      
		String email = "@163.com";
//		String emailRegex = "\\w{1,}@\\w{1,}\\.\\w{1,}";
		String emailRegex = "\\w+@\\w+[.]\\w+";
		System.out.println(email.matches(emailRegex));
		
		String str2 = "abc+";//abc+
		String regex2 = "abc[+]";//abc  abcc abccc   
		System.out.println(str2.matches(regex2));
	}

}







