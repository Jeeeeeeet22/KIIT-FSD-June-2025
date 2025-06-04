package day2;

public interface Shape {
		static final double PI=3.14;
		void area();
		void perimeter();
		default void shapeDimension()
		{
			System.out.println("2D");
		}
}
