package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");  //10
		int numerator=sc.nextInt();      //new InputMismatchException()
		
		System.out.println("Enter Denominator");//2
		int denominator=sc.nextInt();
		
		String name=null;               
		System.out.println(name.length()); 	//new NullPointerException
		
		int arr[]=new int[2];
		arr[2]=10;						//new ArrayIndexOutOfBoundsException
		
		double result=numerator/denominator; // / by zero  ArithmeticException 1. search in vast lib or exception classess to which class the ex belongs
		System.out.println(result);
		}																	//ArithmeticException
		catch(ArithmeticException e1)																//2. creates an object of that class
		{
			System.out.println("Cannot divide by zero");
		}
		catch(InputMismatchException e2)//   new ArithmeticException()
		{																                             //3. throws the object
			System.out.println("Please enter valid  integer value only");													
		}															//4a. catch the object							4b. drop the object
		catch(NullPointerException | ArrayIndexOutOfBoundsException e3)															//	. the execution contine						//. program will terminate/crash
		{
			System.out.println("Some error occured");													//it spills on the console the cause and metadat about the excepion
		}
																													//in which package,class,method, line, message
	}

}
