package day4;

public class Main3 {

	public static void main(String[] args) {
//				a		b		c   
		for(int i=1 ; i<=100 ; i++) {
			System.out.println(i);	//d
		}
		
		//a->b->d->c->b->d->c->b->d->c->b(false)->end of the loop
		
		//print 100 99 98 ....3 2 1 
		for(int i=100 ; i>=1 ; i--) {
			System.out.println(i);
		}
		
		
	}

}

