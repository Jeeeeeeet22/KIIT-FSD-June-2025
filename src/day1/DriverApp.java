package day1;

public class DriverApp {

	public static void main(String args[])
	{
		//LHS             RHS
		Student s1   =    new Student();
		s1.acceptStudent();
		s1.displayStudent();
		
		System.out.println(s1.getRno()); //read getter
		s1.setRno(45);                   //write setter
	
	}
}
