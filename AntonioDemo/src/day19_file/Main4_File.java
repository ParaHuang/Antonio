package day19_file;

import java.io.File;
import java.io.IOException;

public class Main4_File {
	public static void main(String[] args) throws IOException {
//		File f1 = new File("hello/abc.txt");
//		f1.createNewFile();
		
		File folder = new File("/Users/parahuang/Desktop/527");
//		System.out.println(folder.getAbsolutePath());
//		System.out.println(f1.exists());
		//1.get all the file under a folder
		File[] fs = folder.listFiles();
		for(File f:fs) {
			System.out.println(f.getName());
//			f.renameTo(new File("/Users/parahuang/Desktop/527/"+f.getName().toUpperCase()));
//			f.renameTo(new File("/Users/parahuang/Desktop/527",f.getName().toUpperCase()));
			f.renameTo(new File(folder.getAbsolutePath(),f.getName().toLowerCase()));
			
		}
	}
}

