package day5;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import day4.LowQuantityException;

public class ThrowsKeywordDemo {

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		    try
		    {
			System.out.println("Enter Numerator");  //10
			int numerator=sc.nextInt();      //new InputMismatchException()
			
			System.out.println("Enter Denominator");//0
			int denominator=sc.nextInt();
			double result=divide(numerator,denominator);
			System.out.println(result);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("Please enter non zero denominator");
			}
			catch(InputMismatchException e2)
			{
			  System.out.println("Please enter valid Integer value");	
			}
		    finally
		    {
		    	System.out.println("Thank you!!"); //cleanup 
		    }
	}

	private static double divide(int numerator, int denominator) throws ArithmeticException,InputMismatchException,IOException
	{
		return numerator / denominator;
	}

}

//throw, throws,Throwable
//final finally finalize