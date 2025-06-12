package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> employees=new HashMap();
		employees.put("Alice", 800);
		employees.put("Ben", 900);
		employees.put("Chris", 850);
		
		
		System.out.println(employees);
		System.out.println(employees.get("Alice"));
		
		
		Set<String> keys=employees.keySet();
		System.out.println(keys);
		
		
		//display name of the empl earning max salary
		Entry<String,Integer> maxEmp=null;
		int maxSal=0;
		for(Entry<String,Integer> entry:employees.entrySet())
		{
			if(entry.getValue()>maxSal)
			{
				maxSal=entry.getValue();
				maxEmp=entry;
			}
		}

		System.out.println("Employee with Maximum Salary is "+maxEmp.getKey());
	}

	
}
