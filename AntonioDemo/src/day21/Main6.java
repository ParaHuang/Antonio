package day21;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ctrl+C: read into clipborad
		//ctrl+V: write into destination from clipboard
		
		//cut/move
		
		
		File f = new File("/Users/parahuang/Downloads/IMG_E82B636D2E4E-1.jpeg");
		System.out.println(f.getName());
		FileInputStream in = new FileInputStream(f);
		
		FileOutputStream out = new FileOutputStream("/Users/parahuang/Desktop/C/"+f.getName());
		//create a temporary space
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] b = new byte[1024];
		
		while(true) {
			int len = in.read(b);//read a part
			if(len==-1) {
				break;
			}

			baos.write(b, 0, len);//write exact what you read into this space
		}
		
		out.write(baos.toByteArray());//write everything in temporary space into destination all at once
		
		
		out.close();
		in.close();

		f.delete();//delete the original file
		System.out.println("end");
		
	}

}









