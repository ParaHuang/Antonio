package day15;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setNo(1);
		s.setName("Jack");
		
//		try {
//			s.setGender("hello");
//		}catch (Exception e) { //Exception e = new StudentException(gender+" is neither male or female");//bury a bomb here
//			e.printStackTrace();
//		}
		try {
			s.setAge(18);
			s.setGender("hello");
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}

