package day15;

public class Student {
	private int no;
	private String name;
	private int age;
	private String gender;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {//5~32
		if(age>=5 && age<=32) {
			this.age = age;
		}else {
			throw new RuntimeException("incorrect age");
//			throw new StudentException("incorrect age");//if you use this one, it will leave a compile error and you have to solve it
		}
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) throws StudentException {
		if(gender.equals("male") || gender.equals("female")) {
			this.gender = gender;
		}else {
//			System.out.println("invalid gender");
			//cause a problem by raising an exception
			throw new StudentException(gender+" is neither male or female");//bury a bomb here
		}
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public Student(int no, String name, int age, String gender) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Student() {
		super();
	}
	
}

//Chinese: id, name, age, gender,job
// id:43012119901119732X
//    430121199912127563
// 18characters:
// first 17: have to be number
// last one: have to be number or X
// create an exception class to just deal with Chinese information,including
// 1.age
// 2.gender
// 3.id
// display the exception details when it happens

// 











