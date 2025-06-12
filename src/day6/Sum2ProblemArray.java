package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum2ProblemArray {

	public static void main(String[] args) {
		List<Integer> arr =new ArrayList(Arrays.asList(10,20,30,40,50));
		int sum=90;
		for(int num1:arr)																//num1		num2
		{																				//10        80
			int num2=sum-num1;															//20		70
			if(arr.contains(num2))														//30		60
			{																			//40		50
				System.out.println("[" + num1 + ","+ num2 + "]");
				break;
			}		
		}
	}

}
