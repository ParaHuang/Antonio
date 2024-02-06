package day3;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1+2+3....+98+99+100
		int i=1;
		int sum=0;
		
		sum=sum+i;		//1
		i++;		//2
		
		sum=sum+i;		//sum:3
		i++;		//i:3
		
		sum=sum+i;		//sum:6b   ->  1+2+3
		i++;		//4
		
		sum=sum+i;		//sum:10	-> 1+2+3+4
		i++;		//5
		//.....
		
		
		//i=98
		
		sum=sum+i;		//xxxx
		i++;		//i:99
		
		sum=sum+i;		//xxx
		i++;		//i:100
		
		sum=sum+i;		//5050
		i++;		//101
		
		
		System.out.println(sum);//5050
		
	}

}

