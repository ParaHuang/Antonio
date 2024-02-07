package day10;

public class Main1 {

	public static void main(String[] args) {
		Student.teacherName = "Alex";//this class doesnt have any student, we can firstly set up teacher
		
		
		Student s1 = new Student(1, "Jack", 18, "male");
		Student s2 = new Student(2, "Susan", 18, "female");
		System.out.println(s1);
		System.out.println(s2);
		
		Student.teacherName = "Para";
//		s1.setTeacherName("Alex");
		
		System.out.println("==============");
		System.out.println(s1);
		System.out.println(s2);
	}

}


class Student{
	private int no;
	private String name;
	private int age;
	private String gender;
//	private String teacherName;//belongs object
	//we suggest to make static attribute as public 
	public static String teacherName;//belongs class,but object can still use it.use Student.teacherName directly
	public Student(int no, String name, int age, String gender /*,String teacherName*/) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
//		this.teacherName = teacherName;
	}
	
	public static void abc() {
		System.out.println(teacherName);
//		System.out.println(age);//wrong
	}
	
//	public String getTeacherName() {
//		return teacherName;
//	}
//
//	public void setTeacherName(String teacherName) {
//		this.teacherName = teacherName;
//	}



	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + ", gender=" + gender + ", teacherName="
				+ teacherName + "]";
	}

}