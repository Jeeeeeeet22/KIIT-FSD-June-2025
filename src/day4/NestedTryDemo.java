package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[2];
		try
		{
		System.out.println("Enter Value for index 0 : ");  //10  apple
		arr[0]=sc.nextInt();     						 //new InputMismatchException()
		
		System.out.println("Enter Value for index 1 : ");//0
		arr[1]=sc.nextInt();
		
		
							try
							{
								System.out.println("Enter the index of the number you wish to be Numerator : ");  //apple
								int n=sc.nextInt();
								int numerator=arr[n];
								
								System.out.println("Enter the index of the number you wish to be Denominator : ");  //1  apple
								int d=sc.nextInt();
								int denominator=arr[d];
								
								double result=numerator/denominator;
								System.out.println("Result is "+result);
							}
							catch(ArithmeticException e1)
							{
								System.out.println("cannot "+e1.getMessage());  // cannot / by zero
							}
							catch(ArrayIndexOutOfBoundsException e2)
							{
								System.out.println("Invalid Index");  // cannot / by zero
							}
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter valid integer values only");
		}

	}

}
