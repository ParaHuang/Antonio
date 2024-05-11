package day20_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		while(true) {
			String msg = br.readLine();
			if(msg==null) {
				break;
			}
			System.out.println(msg);
		}
		
	}

}

