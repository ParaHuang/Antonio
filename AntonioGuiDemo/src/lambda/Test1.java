package lambda;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new A() {
//			@Override
//			public void fun1() {

//			}
//		};		
//		AImpl ai = new AImpl();
		
		A a = ()->{
			//method body
			System.out.println("lambda body of intraface A");
		};
		
		a.fun1();
		
		B b = new B() {	
			@Override
			public void fun3() {
				
			}
			
			@Override
			public void fun2() {
				
			}
		};
		
		C c1 = (x,y)->{
			System.out.println(x+"----"+y);
		};
		
		c1.fun4(10, "hahahhah");
		
		//rules
		//1.if there is only 1 code for method body, then you can emit {}
		C c2 = (x,y)->System.out.println(x+"----"+y);
		//2.if there is only 1 parameter for method, then you can emit ()
		D d = x->System.out.println("the paramenter is :"+x);
		
		E e1 = ()->{
			System.out.println("a lot of other codes");
			return 10;
		};
		
		//3.if there is only 1 code for method body and it's a return syntax, 
		//then you can directly write the value you want to return after ->
//		E e2 = ()->{
//			return 3;
//		};
		E e2 = ()->3;
		
		System.out.println(e1.fun6());
		System.out.println(e2.fun6());
		
		
	}
}
//functional interface with method of return
interface E{
	int fun6();
}

interface A{
	void fun1();
}

interface B{
	void fun2();
	void fun3();
}
//functional interface with method of 2 parameters
interface C{
	void fun4(int x,String y);
}

//functional interface with method of 1 parameter1
interface D{
	void fun5(int x);
}


class AImpl implements A{
	@Override
	public void fun1() {
		System.out.println("hello");
	}
	
}