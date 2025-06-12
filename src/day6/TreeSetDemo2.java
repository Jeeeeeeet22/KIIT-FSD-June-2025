package day6;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		Student s1=new Student(1,"Rahul",78.5);  //each time will be compared on a single property Comporable
		Student s2=new Student(45,"Rohit",88.5);
		Student s3=new Student(33,"Hardik",68.5);
		Student s4=new Student(18,"Virat",98.5);
		Student s5=new Student(77,"Shubman",87.5); 
		
//		Set<Student> rankingStudents=new TreeSet(new PercentageComparator());   //dsc order of per   Comparator
//		rankingStudents.add(s1);
//		rankingStudents.add(s2);
//		rankingStudents.add(s3);
//		rankingStudents.add(s4);
//		rankingStudents.add(s5);
//		//System.out.println(rankingStudents);
//		
//		for(Student s:rankingStudents)
//		{
//			System.out.println(s);
//		}
		Set<Student> attendanceStudents=new TreeSet(new RnoComparator());  // asc order of rno
		attendanceStudents.add(s1);
		attendanceStudents.add(s2);
		attendanceStudents.add(s3);
		attendanceStudents.add(s4);
		attendanceStudents.add(s5);
		System.out.println(attendanceStudents);
//		
//		
//		Set<Student> examSeatingStudents=new TreeSet();  // asc order of sname
//		 examSeatingStudents.add(s1);
//		 examSeatingStudents.add(s2);
//		 examSeatingStudents.add(s3);
//		 examSeatingStudents.add(s4);
//		 examSeatingStudents.add(s5);
//		 System.out.println(examSeatingStudents);
	}

}
