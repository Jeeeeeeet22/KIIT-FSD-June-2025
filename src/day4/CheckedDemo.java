package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedDemo {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter Numerator");
		int numerator=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Denominator");
		int denominator=Integer.parseInt(br.readLine());
		double result=numerator/denominator;
		System.out.println(result);	
		}
		catch(IOException e1) {}
		
		 // / by zero  ArithmeticException 1. search in vast lib or exception classess to which class the ex belongs
																			//ArithmeticException
																		//2. creates an object of that class
																		//   new ArithmeticException()
																		//3. throws the object
															
																	//4a. catch the object							4b. drop the object
																													//. program will terminate/crash
																													//it spills on the console the cause and metadat about the excepion
																													//in which package,class,method, line, message
	}

}
