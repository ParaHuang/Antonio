package day15;

//to deal with all those wrong information of a student by causing exception
//1.define a class, to extends Exception/RuntimeException
//Exception:  compile exception, when you throw an instance of this Class, it will leave you a compile error to force to deal with it
//RuntimeException: it will cause exception , but wouldn't force you to deal with
//2.generate a construction with a String as parameter(this is the exception information)
//  pass this parameter into super()
public class StudentException extends Exception{
	
	public StudentException(String msg) {
		super(msg);//calling the constructor from super class
	}
}


