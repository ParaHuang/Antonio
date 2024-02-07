package day10;

public class Main2 {

	public static void main(String[] args) {
		new TestForStatic();
		new TestForStatic();
		new TestForStatic();
		new TestForStatic();
		new TestForStatic();
		new TestForStatic();
		new TestForStatic();
		new TestForStatic();
		new TestForStatic();
		new TestForStatic();
	}

}

class TestForStatic{
	
	static {
		System.out.println("static code:\n"
				+ "1.preload into memory when you use this class for the first time"
				+ "2. exeute before everything of this class\n "
				+ "3.it only execute for once no matter how many object of this you create");
	}
	
	public TestForStatic() {
		System.out.println("constructor for TestForStatic");
	}
}