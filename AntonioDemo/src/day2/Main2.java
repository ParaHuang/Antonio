package day2;

public class Main2 {

	public static void main(String[] args) {
		//print 1,2,3,....,100
		//print hello for 100 times
		int i=1;			//a.initial value
		while(i<=100) {		//b.condition
			System.out.println(i);	
			i++;			//c.increment
		}
		System.out.println("================");
		//print 2,4,6,....,98,100
		int x=1;
		while(x<=100) {
			if(x%2==0){
				System.out.println(x);
			}
			x++;
		}
		System.out.println("=================");
		int y=2;
		while(y<=100) {
			System.out.println(y);
			y+=2;//y increase by 2
		}
		
		
//		y++;  //y increase by 1
//		y=y+1;
//		y+=1;
		// y++ 	<=>		y+=1		<=>		y=y+1
		//				y+=2;		<=>		y=y+2
		
//		find every leap year in 21 centery  (2000-2999)
		
	}

}

