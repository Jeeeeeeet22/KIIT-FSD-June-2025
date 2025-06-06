package day3;

import java.util.Scanner;

public class HotFut {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String customerName=sc.next();
		System.out.println("Enter Date");
		String dateOfPlay=sc.next();
		System.out.println("Enter Time");
		String timeOfPlay=sc.next();
		
		System.out.println("***Turf Options***");
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("3. Tennis");
		System.out.println("4. Skating");
		System.out.println("0. Exit");
		System.out.println("Enter Choice");
		int turfChoice=sc.nextInt();
		double turfPrice=0;
		String turfType="";
		switch(turfChoice)
		{
		case 1:  	turfPrice=900; turfType="Cricket Turf"; break;
		case 2:  	turfPrice=1000; turfType="Football Turf"; break;
		case 3:  	turfPrice=1500;  turfType="Tennis Turf"; break;
		case 4:  	turfPrice=2500;  turfType="Skating Turf"; break;
		case 0:  	System.exit(0);  //graceful exit with programmers exit
		default : System.out.println("Invalid choice");
		}

		System.out.println("**** BILL ****");
		System.out.println("Customer name "+customerName);
		System.out.println("Play Date "+dateOfPlay);
		System.out.println("Play Time "+timeOfPlay);
		System.out.println("Turf Type" + turfType);
		System.out.println("Cost" + turfPrice);
		
	}

}


/* default values for
int 
char
double
boolean
String
*/