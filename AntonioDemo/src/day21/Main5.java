package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ctrl+C: read into clipborad
		//ctrl+V: write into destination from clipboard
		
		
		File f = new File("/Users/parahuang/Downloads/IMG_E82B636D2E4E-1.jpeg");
		System.out.println(f.length());
		FileInputStream in = new FileInputStream(f);
		
		FileOutputStream out = new FileOutputStream("/Users/parahuang/Desktop/C/a.jpeg");
		
		
		byte[] b = new byte[1024];
		
		while(true) {
			int len = in.read(b);//read a part
			if(len==-1) {
				break;
			}
			out.write(b,0,len);//immediately write that part
		
		}
		
		
		
		out.close();
		in.close();
		
		System.out.println("end");
		
	}

}









