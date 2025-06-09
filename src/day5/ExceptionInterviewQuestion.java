package day5;

public class ExceptionInterviewQuestion {

	public static void main(String[] args) {

		int result=test();
		System.out.println(result);

	}

	private static int test() {
		try
		{
		int ans=10/0;
		return 1;
		}
		catch(ArithmeticException e1)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}

}
//if the code has gone into try it will go into catch is conditional to occurance of an exception
//if the code has gone into try it HAS TO go into finally irresopective exception occurs or not