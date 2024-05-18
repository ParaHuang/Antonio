package day21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main3 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("hola.txt");
		out.write("hello,it's saturday".getBytes());
		out.close();
	}

}

