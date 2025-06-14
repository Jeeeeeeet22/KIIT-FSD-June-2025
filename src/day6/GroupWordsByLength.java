package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByLength {

	public static void main(String[] args) {
		List<String> input = new ArrayList(Arrays.asList("Lion", "Tiger","Zebra", "Elephant", "Cat","Dog"));
		Map<Integer,List<String>> animalGroups=new HashMap();					{}	//not a single entry present
		
		for(String animal:input)
		{
			int length=animal.length();										//animal			//length			animalsGroups
			animalGroups.putIfAbsent(length, new ArrayList());				//lion				//4					{4=[lion]}
																			//tiger				//5					{5=[tiger]}
			animalGroups.get(length).add(animal);							//zebra				//5					{5=[tiger,zebra]}
		}
		System.out.println(animalGroups);
	}
}

//groupAnagrams
//List<String> input = new ArrayList(Arrays.asList("abc", "bac","cba", "ate", "tan","nat"));
//[abc,bac,cba]
//[ate]
//[tan,nat]