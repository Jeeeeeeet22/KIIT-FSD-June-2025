package day5;

public class StringTypes {
	public static void main(String[] args) {
		String s1 = "123";  //Numeric String
		String s2 = "456";
		//			 579
		String s3 = "123abc";
		
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=Integer.parseInt(s3);  //NumberFormatException
		
		System.out.println(n1+n2);   //123456	
	}
}
//"my name is Alice i am 19 years old i have 2 brothers and 1 sister"
//can you display the count of integers
//output : Integer count 3