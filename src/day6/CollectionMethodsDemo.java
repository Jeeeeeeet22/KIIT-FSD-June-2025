package day6;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethodsDemo {

	public static void main(String[] args) {
		 List<String> list=new ArrayList();
		 list.add("Alice");	//0
		 list.add("Ben");		//1
		 list.add("Chris");    //2
		 list.add("Dom");		//3
		 list.add("Elcid");    //4
		 						    //  0     1   2     3     4
		 System.out.println(list);  //[Alice,Ben,Chris,David,Elcid]
		 							
		 							//  0     1   2     3     4      5
		 list.add(2,"Bharat");		//[Alice,Ben,Bharat,Chris,David,Elcid]
		 System.out.println(list);
		 							  //  0     1   2     3     4      5    6
		 System.out.println(list.get(1).length());
		 
		 
		 List list1=new ArrayList();
		 list1.add(1);
		 list1.add(2);
		 list1.add(3);
		 
		 System.out.println(list1);
		 System.out.println(list1.remove(1)); //when we pass integer as a parameter to the remove method it will prioritise the index removal
		 System.out.println(list1);   // [1,3]
		 System.out.println(list1.remove(Integer.valueOf(1))); //remove the element 1
		 
		 
		 List<String> rj=new ArrayList();
		 rj.add("Jaipur");
		 rj.add("Bikaner");
		 rj.add("Fatehpur");
		 
		 List<String> mh=new ArrayList();
		 mh.add("Pune");
		 mh.add("Mumbai");
		 mh.add("Nashik");
		 
		 List<String> or=new ArrayList();
		 or.add("Rourkela");
		 or.add("Kalinga");
		 or.add("Bhubaneshwar");
		 
		 List<List<String>> India=new ArrayList<>();
		 India.add(rj);
		 India.add(mh);
		 
		 
		 System.out.println(India); //[[Jaipur,Bikaner,Fatehpur],[Pune,Mumbai,Nashik],[]]
		 //System.out.println(India.get(0).get(1));
		 
		
		 System.out.println(India);
		 
		 //addAll
		 System.out.println(India.size()); //2
		 List<String> India1=new ArrayList();
		 India1.addAll(rj);
		 India1.addAll(mh);
		 India1.addAll(or);
		 System.out.println(India1.size()); //9
		 System.out.println(India1);
//		 India1.removeAll(mh);
//		 System.out.println(India1);
		 
		 India1.retainAll(or); 
		 System.out.println(India1);
		 
		 System.out.println(India1.isEmpty());
		 India1.clear();
		 System.out.println(India1.isEmpty());
		

	}

}
