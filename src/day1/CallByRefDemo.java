package day1;

public class CallByRefDemo {

	public static void main(String[] args) {
		//int arr[]= {10,20};
		Student s1=new Student();
		s1.setRno(18);
		s1.setSname("Virat");
		s1.setPer(78.5);
		
		System.out.println("A : "+s1.getRno());//18
		test(s1);
		System.out.println("A : "+s1.getRno());//96
	}

	private static void test(Student sz) {
		System.out.println("Z : "+sz.getRno());//18
		sz.setRno(96);
		System.out.println("Z : "+sz.getRno());//96	
	}
}
