package day6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		Student s1=new Student(1,"Rahul",78.5);  
		Student s2=new Student(45,"Rohit",88.5);
		Student s3=new Student(33,"Hardik",68.5);
		Student s4=new Student(18,"Virat",98.5);
		Student s5=new Student(77,"Shubman",87.5); 
		
		List<Student> students=new ArrayList();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		//display the details of the student who has secured the max marks
		double max=0.0;
		Student maxStudent=null;
		for(Student student:students)
		{
			if(student.getPer()>max)
			{
				max=student.getPer();
				maxStudent=student;
			}
		}
		
		System.out.println(maxStudent);//display the object , println expects the data tobe in String format
									  // we need some converter to convert from object to String
		                              //toString() object class, override the toString()
		
									  //maxStudent.displayStudent();
		
	}
	//[10,20,30,40,50]   //90 2 sum problem , 3 sum problem  [40,50]
	// string, arrays   
	// first repeating char rohit sharma : 'r'
	// first non repeating char rohit sharma : 'o'
	// group anagrams  ["cab", "bca", "nat", "tan", "apple", "mango", "abc"]
	/*				["cab", "bca","abc"]
					["tan", "nat"]
					["mango"]
					["apple"]*/
	//binary search
	//sorting,rotation
	//PriorityQueue
	//Stack
}
