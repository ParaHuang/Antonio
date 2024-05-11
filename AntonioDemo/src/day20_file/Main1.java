package day20_file;

public class  Main1{
	
	public static void main(String[] args) {
		count(6);
	}
	
	//1.inside of a method, call this method with a different data
	//2.write exit condition
	public static void count(int num) {
		if(num==0) {
			return;
		}
		
		System.out.println("start-----");
		System.out.println(num);
		System.out.println("end-----");
		System.out.println();
		
		num--;
		count(num);
		
	}

}

/*
start-----
6
end-----

start----
5
end----

start----
4
end----

start----
3
end----

start----
2
end----

start----
1
end----



*/