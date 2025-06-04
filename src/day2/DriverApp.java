package day2;

public class DriverApp {

	public static void main(String[] args) {
		Amitabh a1;
		Abhishek a2;
		Aradhya a3;
		a1=new Aradhya();
		a2=new Aradhya();
		a3=new Aradhya();
		
		a3.home();
		a3.car();
		a3.office();
		
		a2.home();
		a2.car();
		
		a1.home();
		
		System.out.println(a1.qualification);
		System.out.println(a2.qualification);
		System.out.println(a3.qualification);
		
		
		a1=new Shweta();
		a1.home();
		a1.gold();
		a1.car();
		a1.office();
	}
}

//as home() is a method, we are calling a method
//method belongs to the object
//object is of Abhishek
//hence it will invoke the home() of Abhishek class

//as qulaification is a property, we are accessing a property
//property belongs to the ref
//ref is of Amitabh
//hence it will access the qualification of Amitabh
