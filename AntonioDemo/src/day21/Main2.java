package day21;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) throws IOException {
		//hello, it's Saturday
		//你好，今天星期六
		//hello.txt
		
		//2nd parameter:true-append ,false: replace   ,false is default
		FileWriter writer = new FileWriter("hello.txt",true);
		writer.write("hello, it's Saturday\r\n");
		writer.write("你好，今天星期六");
		writer.write("\r\nhola,es sabado");
		//the content wont write into file if you don't close it
		writer.close();
		System.out.println("end");
	}

}

