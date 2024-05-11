package day20_file;

import java.io.File;

public class Main2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("/Users/parahuang/Desktop/image");
		findImage(folder);
		System.out.println(count);
	}
	static int count = 0;//how many pictures?  png,jpg,jpeg,gif
	
	
	public static void findImage(File folder) {
		File[] fs = folder.listFiles();//get all files under this folder
		
		for(File f:fs) {
			System.out.println(f.getName());
			
			//when it's file
			if(f.isFile()) {
				String fileName = f.getName().toLowerCase();
						
				if (fileName.endsWith("png") || fileName.endsWith("jpg") || fileName.endsWith("jpeg") ||
						fileName.endsWith("gif")) {
					count++;
				}
			}else {
//				use f to get into findImage again
				findImage(f);
			}
		}
	}
	

}

