package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Ordered Quantity");  //300
		int quantity=sc.nextInt();                     
		
		if(quantity>=500)
			System.out.println("Order Accepted");
		else
			throw new LowQuantityException("Please enter qty > 500");
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter valid integer value");
		}
		catch(LowQuantityException e2)
		{
			System.out.println(e2.getMessage());
		}
		finally
		{
			System.out.println("Thank You!! Visit Again");
		}

	}

}
