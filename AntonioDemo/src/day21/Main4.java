package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ctrl+C: read into clipborad
		//ctrl+V: write into destination from clipboard
		
		//read == copy
		File f = new File("/Users/parahuang/Downloads/IMG_E82B636D2E4E-1.jpeg");
		System.out.println(f.length());
		FileInputStream in = new FileInputStream(f);
		
		
		byte[] b = new byte[(int) f.length()];
		int len = in.read(b);
		System.out.println(len);
		
		//write == paste
		FileOutputStream out = new FileOutputStream("/Users/parahuang/Desktop/C/a.jpeg");
		out.write(b);
		
		out.close();
		in.close();
		
		System.out.println("end");
		
	}

}









