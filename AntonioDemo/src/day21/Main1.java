package day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main1 {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("text2.txt");
		byte[] b = new byte[20];
		String str = "";
		while(true) {
			int length = in.read(b);
			if(length==-1) {
				break;
			}
			String msg = new String(b,0,length);
			str+=msg;
		}
		System.out.println(str);
		
	}

}

