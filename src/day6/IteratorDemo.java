package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList();
		names.add("Alice");
		names.add("Ben");
		names.add("Chris");
		names.add("David");
		names.add("Elcid");
		
//		Iterator itr=names.iterator();
//		
//		while(itr.hasNext())					//uni directional
//			System.out.println(itr.next());
// 
		
//		System.out.println("Forward Direction");
//		ListIterator listItr=names.listIterator();
//		while(listItr.hasNext())					//uni directional
//			System.out.println(listItr.next());
//		
//		
//		System.out.println("Reverse Direction");
//		while(listItr.hasPrevious())					//uni directional
//			System.out.println(listItr.previous());
		
		ListIterator<String> listItr=names.listIterator();				//bi direction, remove, replace(set())
		while(listItr.hasNext())
		{
			String item=listItr.next();
			if(item.length()<5)
				//listItr.remove();
				listItr.set("Benten");
		}
		
		System.out.println(names);
	}

	
	// input ["Merc India","Audi","BMW India","Mahindra"]
	// output["Merc India","Audi India","BMW India","Mahindra India"]
}
