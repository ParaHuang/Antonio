package day20_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main3 {
	//operating file content
	//read 	, write
	//Reader, Writer
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("text2.txt");
		char[] ary = new char[20];
		String str = "";
		
		while(true) {
			int length = reader.read(ary);//reading content into ary,return the exact length 
			System.out.println(length);
			if(length==-1) {
				break;
			}
			//create a String with  what   from   to
			String msg = new String(ary,   0,     length);
			str += msg;
			
		}
		System.out.print(str);
		/*
		reader.read(ary);
//		String msg = new String(ary);
//		System.out.println(msg);
		System.out.print(ary);
		reader.read(ary);
		System.out.print(ary);
		reader.read(ary);
		System.out.print(ary);
		reader.read(ary);
		System.out.print(ary);
		reader.read(ary);
		System.out.print(ary);
		int len1 = reader.read(ary);
		System.out.print(ary);
		int len2 = reader.read(ary);
		System.out.print(ary);
		int len3 = reader.read(ary);
		System.out.print(ary);
		System.out.println(len1+","+len2+","+len3);
		*/
		
	}

}








