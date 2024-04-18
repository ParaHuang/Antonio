package day17_regex;

public class Main1 {

	public static void main(String[] args) {
		// Jack, Jane,Jonny, Jenny,Jimmy,Mike
		// J_n______
		//1.start with J
		//2.3rd character is n
		
		//regulation expression:create a general rule, to vertify some string
		
		String str = "hello";
		
		String regex1 = "hello";
		System.out.println(str.matches(regex1));		//true, exactly same
		
		String regex2 = "hell";
		System.out.println(str.matches(regex2));		//false, not same
		
		//hello__     _ is a number
		String str3 = "hello97";
		String regex3 = "hello\\d\\d";			//in string, \d has to be written as \\d , \\ -> \
		System.out.println(str3.matches(regex3));
		
		//Invalid escape sequence (valid ones are  \b			 \t  	\n  	\f  \r  \"  \'  \\ )
		//                                     backspace		tab		newline			"	'	\
		
//		String x = " she say: \"I'm Lina\"  \nthat's ok ";
//		System.out.println(x);
		String str4 = "hello!";
		String regex4 = "hello\\D";
		System.out.println(str4.matches(regex4));
		
		String str5 = "he_llo";
		String regex5 = "he\\wllo";		// \w:  0-9  a-z  A-Z  _
		System.out.println(str5.matches(regex5));
		
		String str6 = "he llo";
		String regex6 = "he\\Wllo";
		System.out.println(str6.matches(regex6));
		
		String str7 = "he8llo";
		String regex7 = "he.llo";		//\s:    space, \t , \n    
		System.out.println(str7.matches(regex7));
		
		
	}

}













