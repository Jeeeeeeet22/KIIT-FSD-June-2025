package day7;

import java.util.Scanner;

public class Student {

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
}

//Job profile : Java Developer
//the class methods have "DIRECT" access to the class properties
//Note printing machine : class    notes : objects
//half done
//class is a blue print to create objects