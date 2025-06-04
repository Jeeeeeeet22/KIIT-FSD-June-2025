package day2;

public class Rectangle implements Shape
{

	@Override
	public void area() {
		double result=5*10;
		System.out.println("Area of Rectangle is "+result);
		
	}

	@Override
	public void perimeter() {
		double result=2*(5+10);
		System.out.println("Perimeter of Rectangle is "+result);	
	}
	
}
