package day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<String,Student> std8=new HashMap();
		std8.put("first", new Student(18,"Virat",98.5));
		std8.put("second", new Student(45,"Rohit",88.5));
		std8.put("third", new Student(33,"Hardik",78.5));
		
		
		//System.out.println(std8.get("first").getSname());
		
		Map<String,Student> std9=new HashMap();
		std9.put("first", new Student(77,"Shubman",87.5));
		std9.put("second", new Student(1,"Rahul",86.5));
		std9.put("third", new Student(3,"Shami",81.5));
		
		//System.out.println(std9.get("first").getSname());
		
		Map<String,Student> std10=new HashMap();
		std10.put("first", new Student(43,"Alice",87.5));
		std10.put("second", new Student(19,"Ben",86.5));
		std10.put("third", new Student(36,"Chris",81.5));
		
		
		List<Map<String,Student>> schoolResuls=new ArrayList();
		schoolResuls.add(std8);
		schoolResuls.add(std9);
		schoolResuls.add(std10);  
		
		//using the schoolResult, display toppers name from each class
		System.out.println("Topper Names");
//		for(Map<String,Student> classResult: schoolResuls)
//		{
//			System.out.println(classResult.get("first").getSname());
//		}
		
		for(int i=0;i<schoolResuls.size();i++)
		{
			System.out.println(schoolResuls.get(i).get("first").getSname());
		}

	}	
}
