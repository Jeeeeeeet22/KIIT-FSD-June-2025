package day5;

import java.util.Arrays;

public class IntegerCountFromString {

	public static void main(String[] args) {
		String sentance="my name is Alice i am 19 years old i have 2 brothers and 1 sister";
		System.out.println(sentance);
		String words[]=sentance.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.print("Integers Found Are : ");
		int count=0;
		for(String word:words)
		{
			try
			{
			int n=Integer.parseInt(word);
			System.out.print(n+ ",");
			count++;
			}
			catch(NumberFormatException e1) {}
		}
		
		System.out.println("\nTotal Integers "+count);
	}

}
