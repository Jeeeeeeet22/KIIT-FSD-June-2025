package day3hotfutsolution;

import java.util.Scanner;

public class DriverApp {

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
		if(turfChoice!=0)
		{
		Turf turf=TurfFactory.getTurf(turfChoice);
		displayBill(customerName,dateOfPlay,timeOfPlay,turf);
		}
		else
			System.out.println("Session Expired");
	}

	private static void displayBill(String customerName, String dateOfPlay, String timeOfPlay, Turf turf) {
		System.out.println("**** BILL ****");
		System.out.println("Customer name "+customerName);
		System.out.println("Play Date "+dateOfPlay);
		System.out.println("Play Time "+timeOfPlay);
		System.out.println("Turf Type" + turf.getTurfType());
		System.out.println("Cost" + turf.getTurfPrice());
	}

}
