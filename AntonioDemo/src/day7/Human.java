package day7;

public class Human {
	//fields
	private String name;
	private int age;
	private String gender;
	private String country;
	
	//invisible constructor
	//public Human() {}
	//constructor
	public Human(String name,int age,String gender,String country) {
		System.out.println("this is a constructor......");
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.country = country;
	}
	

	public Human() {
		
	}
	
	//shortcut
	//alt+shift+s->generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	//getters and setters
	//setters: use to assign a value into a specific attribute
	/*
	//xxx is the attribute name
	public void setXxx(type xxx){
		xxx = xxx;
	}
	*/
	/*
	//this:using it inside of class, refers to the object of this class that you are using right now
	//when local variable is in the same name as global variable
	//this.variableName to refer to the global variable
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		//use logic code to control attribute, save correct value inside
		if(age<0 || age>150) {
			System.out.println("invalid age");
			this.age = 1;//default value
		}else {
			this.age = age;
		}
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	*/
	//getters to get the value of attribute
	/*
	 public type getXxx(){
	 	return xxx;
	 }
	 */
	/*
	public String getName() {
		//xxxxxxxxxxxx
		//solve a result out
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getCountry() {
		return country;
	}
	*/
	public void eat() {
		System.out.println("that "+gender+" "+name+" is eating" );
	}
	
	public void eat(String food) {
		System.out.println(name + " is eating "+food);
	}
	
	public void sleep() {
		System.out.println(age+" years old "+gender+" who's from "+country+" is sleeping");
	}
}

