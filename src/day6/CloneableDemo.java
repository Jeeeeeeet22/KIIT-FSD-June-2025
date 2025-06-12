package day6;

public class CloneableDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s4=new Student(18,"Virat",78.5);
		Student s5=(Student)s4.clone();  //not having the I card, the flag is not set
		
		s4.setRno(45);

		System.out.println("S4 " +s4.getRno());  // S4 45
		System.out.println("S5 " +s5.getRno());  // S5 18
	} 

}
