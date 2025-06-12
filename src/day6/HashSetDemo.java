package day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> hs1=new HashSet();
		System.out.println(hs1.add("Alice"));
		hs1.add("Tom");
		hs1.add("Ben");
		hs1.add("Frank");
		System.out.println(hs1.add("Tom"));
		hs1.add("Chris");
		
		System.out.println(hs1);
		
		
		Set<Integer> setA=new HashSet(Arrays.asList(1,2,3));
		Set<Integer> setB=new HashSet(Arrays.asList(4,5,6));
		System.out.println("set A"+setA);
		System.out.println("set B"+setB);
		//union
		setA.addAll(setB);
		System.out.println("Union"+setA);
		
		
		
		Set<Integer> setX=new HashSet(Arrays.asList(1,2,3,4,5));
		Set<Integer> setY=new HashSet(Arrays.asList(4,5,6));
		System.out.println("set X"+setX);
		System.out.println("set Y"+setY);
		setX.retainAll(setY);
		System.out.println("Intersection "+setX);
		
		
		
		
		Set<String> lhs=new LinkedHashSet();    //Linked order is preserved
		lhs.add("Alice");
		lhs.add("Tom");
		lhs.add("Ben");
		lhs.add("Frank");
		lhs.add("Tom");
		lhs.add("Chris");
		
		System.out.println(lhs);
		
		
		
		Set<String> ts=new TreeSet();    //Linked order is preserved
		ts.add("Alice");
		ts.add("Tom");
		ts.add("Ben");
		ts.add("Frank");
		ts.add("Tom");
		ts.add("Chris");
		
		System.out.println(ts);

	}

}
