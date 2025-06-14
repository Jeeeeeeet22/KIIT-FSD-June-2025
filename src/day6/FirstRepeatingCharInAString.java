package day6;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingCharInAString {
	public static void main(String[] args) {
		String input="M$ah$endra Singh Dhoni";  //output i;
		input =input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(input);
		//step1 : display count of occurances of a char in a String : v:1,i:2,r:1,a:1,t:1...
		Map<Character,Integer> counter=new HashMap();
		for(char c: input.toCharArray())
		{
			counter.put(c, counter.getOrDefault(c, 0)+1);
		}
		
		//System.out.println(counter);
		for(char c: input.toCharArray())
		{
			if(counter.get(c)>1)
			{
				System.out.println(c);
			    break;
			}
		}
	}
}
