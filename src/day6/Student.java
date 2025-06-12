package day6;

import java.util.Scanner;

public class Student implements Cloneable//,Comparable<Student>
{

	private int rno;				//properties
	private String sname;
	private double per;
	
	
	//to read and write private data outside the class we have special methods
	//known as setter getter methods
	//create a pair(set,get) for each private property
	
	//right click inside the class anywhere
	//source
	//generate setter getter
	//select All
	//click generate
	
	public Student()								//it will override the default constructor
	{
		this.rno=1;
		this.sname="Alice";
		this.per=50.0;
	}
	
	public Student(int a,String b, double c)		//it will overload the constructor
	{
		this.rno=a;
		this.sname=b;
		this.per=c;
	}
	public Student(Student stud)					//it will overload the constructor
	{
		this.rno=stud.rno;
		this.sname=stud.sname;
		this.per=stud.per;
		stud.rno=45;
	}
	public void acceptStudent()		//methods
	{
		Scanner sc=new Scanner(System.in); //Predefined class  ctrl shift O
		System.out.println("Please enter roll no");  //18
		rno=sc.nextInt();
		System.out.println("Please enter Student name");  //18
		sname=sc.next();
		System.out.println("Please enter Student Percentage");  //18
		per=sc.nextDouble();	
	}
	
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public void displayStudent()
	{
		Student s2 = new Student();
		s2.rno=18;
		System.out.println("Roll Number is "+rno);
		System.out.println("Student Name is "+sname);
		System.out.println("Percentage is "+per);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}

//	@Override
//	public int compareTo(Student stud) {
//		return sname.compareTo(stud.sname);
//	}

//	@Override
//	public int compareTo(Student stud) {
//		if(rno>stud.rno)
//			return 1;
//		else if(rno<stud.rno)
//			return -1;
//		else
//			return 0;
//	}
	
	
//	@Override
//	public int compareTo(Student stud) {
//		if(per>stud.per)
//			return -1;
//		else if(per<stud.per)
//			return 1;
//		else
//			return 0;
//	}
	
	
	
	
	
}

//Job profile : Java Developer
//the class methods have "DIRECT" access to the class properties
//Note printing machine : class    notes : objects
//half done
//class is a blue print to create objects