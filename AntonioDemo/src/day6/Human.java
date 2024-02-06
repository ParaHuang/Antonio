package day6;

public class Human {
	//attribute： define variable
	private String name;
	private int age;
	private String gender;
	private String country;
	
	//getters and setters
	//setters: use to assign a value into a specific attribute
	/*
	//xxx is the attribute name
	public void setXxx(type x){
		xxx = x;
	}
	*/
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	//getters: use to get the value from a specific attribute
	
	//function/method
	public void eat() {
		System.out.println(name+" is eating");
	}
	
	public void sleep() {
		System.out.println(age + " years old "+gender+" who's from "+country+" is sleep");
	}
}



//3D printer
//design
//Bark Simpson