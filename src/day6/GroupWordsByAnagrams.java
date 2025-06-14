package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByAnagrams {

	public static void main(String[] args) { // abc abc abc
		List<String> input = new ArrayList(Arrays.asList("abc", "bac", "cba", "ate", "tan", "nat"));
		System.out.println(groupedAnagrams(input));
	}

	private static Collection<List<String>> groupedAnagrams(List<String> input) {
		Map<String, List<String>> angramGroups = new HashMap();
		
		for (String word : input) {
			char arr[] = word.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);
			angramGroups.putIfAbsent(key, new ArrayList()); // lion //4 {4=[lion]}
															// tiger //5 {5=[tiger]}
			angramGroups.get(key).add(word); // zebra //5 {5=[tiger,zebra]}
		}
		return angramGroups.values();
	}
}

//groupAnagrams
//List<String> input = new ArrayList(Arrays.asList("abc", "bac","cba", "ate", "tan","nat"));
//[abc,bac,cba]
//[ate]
//[tan,nat]

//  {[()]}  wellforemd

//  {[[)}   not well formed - Stack

//  string is palindorme 
		//without using a second string
		//Stack