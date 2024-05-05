package day19_file;

import java.io.File;
import java.io.IOException;

public class Main5_File {
	public static void main(String[] args) throws IOException {
		//exercise 1: easy version
		File folder = new File("/Users/parahuang/Desktop/527");
		File[] fs = folder.listFiles();
		int count = 0;	//how many pictures?  png,jpg,jpeg,gif
		for(File f:fs) {
			System.out.println(f.getName());
			//get the suffix
			//1.split by .   , get the last part
			//2.get the position of last . , do substring after that index
			//3. str.endWith("png")
			if(f.getName().endsWith("png")) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
//exercise 2:hard version
//find all images files in the every corner of that folder
//use recursion
















