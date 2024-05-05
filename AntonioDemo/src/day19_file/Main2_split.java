package day19_file;

public class Main2_split {

	public static void main(String[] args) {
		String str = "R W G B G";
		String[] ary = str.split(" ");
		for(String s : ary) {
			System.out.println(s);
		}
		
		String ip = "192.168.66.1";
		// 214.1.29.174
		String[] ary2 = ip.split("[.]");
		int[] ary3 = new int[ary2.length];
		for(int i=0 ; i<ary2.length ; i++) {
			ary3[i] = Integer.parseInt(ary2[i]);
		}
		
		
	}

}

