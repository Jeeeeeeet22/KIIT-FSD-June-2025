package day6;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList();
		names.add("Alice");
		names.add("Ben");
		names.add("Chris");
		
		System.out.println(names);
		
		
		ArrayList<String> names1=new ArrayList(Arrays.asList("David","Elcid","Frank"));
		System.out.println(names1);
		
		Student s1=new Student();  //this was using the default constructor gifted to the developer by java int=0, char='', double=0.0, booleabn=false, object=null
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student(18,"Virat",78.5);
		Student s5=new Student(s4);  //invokes the copy constructor, deep copies 
		
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
		s4.displayStudent();   //rno=45
		s5.displayStudent();   //rno=18
		
		
	
		Student s6=new Student(); 	
		Student s7=s6; //shallow copy means - call by reference
	}

}
