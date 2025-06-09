package day5;

public class StatementPriorityDemo {

	public static void main(String[] args) {

		System.out.println(test());

	}

	private static int test() {
		int numerator=100;
		int denominators[]= {10,20,0,50};
		int result=0;
		for(int i=0;i<denominators.length;i++)
		{
			try
			{
			result=result+numerator/denominators[i]; //result=15
			}
			catch(ArithmeticException e1)
			{
				return 50;	
			}
			finally
			{
				return 100;
			}
			
		}
		return 0;
	}
}
