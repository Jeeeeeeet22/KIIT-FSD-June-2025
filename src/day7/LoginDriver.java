package day7;

import java.util.Scanner;

public class LoginDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String username=sc.next();
		
		System.out.println("Enter Password");
		String password=sc.next();
		
		ERRORS error;
		if(username.length()<3)
		{
			error=ERRORS.ERROR1;
			System.out.println(String.format(error.getErrorMessage(), username));
		}
		
		if(password.length()<8)
		{
			error=ERRORS.ERROR2;
			System.out.println(error.getErrorMessage());
		}
		

	}

}
