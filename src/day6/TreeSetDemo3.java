package day6;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		Student s1=new Student(1,"Rahul",78.5);  //each time will be compared on a single property Comporable
		Student s2=new Student(45,"Rohit",88.5);
		Student s3=new Student(33,"Hardik",68.5);
		Student s4=new Student(18,"Virat",98.5);
		Student s5=new Student(77,"Shubman",87.5); 
		
		Set ts1=new TreeSet();
		ts1.add(10);
		ts1.add(20);
		ts1.add(null);
		
		System.out.println(ts1);	
	}

}
