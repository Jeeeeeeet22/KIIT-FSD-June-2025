package day2;

public class Circle implements Shape
{
	@Override
	public void area() {
		double result=PI*5*5;
		System.out.println("Area of Circle is "+result);
		
	}
	@Override
	public void perimeter() {
		double result=2*PI*5;
		System.out.println("Perimeter of Circle is "+result);
		
	}
}
