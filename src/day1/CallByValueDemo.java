package day1;

public class CallByValueDemo {

	public static void main(String[] args) {
		int a=10;
		System.out.println("A : "+a);//10
		test(a);
		System.out.println("A : "+a);//10
	}

	private static void test(int z) {
		System.out.println("Z : "+z);//10
		z=99;
		System.out.println("Z : "+z);//99	
	}
}
