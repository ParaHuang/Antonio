package day19_file;

import java.io.File;
import java.io.IOException;

public class Main3_File {
	//file:  file  +  directory/folder
	public static void main(String[] args) throws IOException {
		//     Users/parahuang/Desktop/conference.sql
		
		//1.create an instance of File
//		File f1 = new File("/Users/parahuang/Desktop/conference.sql");//absolute path
		File f1 = new File("abc.txt");//relative path
		
		//2.get the name
		System.out.println(f1.getName());
		//3.get the full path
		System.out.println(f1.getAbsolutePath());
		//4.delete this file
//		f1.delete();
		//5.create a file
//		f1.createNewFile();
		//6.check if file exist
//		System.out.println(f1.exists());
		//if exists, delete it, otherwise create it
		/*
		if(f1.exists()) {
			f1.delete();
		}else {
			f1.createNewFile();
		}
		
		File f2 = new File("hello");
		//7.create folder
		f2.mkdir();
		*/
		//8.rename
		f1.renameTo(new File("AABBCC.txt"));
		
		
	}

}











