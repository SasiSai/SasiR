package Basics;

import java.util.Arrays;

public class FirstRepeatedElement {
public static void main(String[] args) {
		int[] numbers = { 1,5,6,7,7,12,44,12,44,12};
				Arrays.sort(numbers);

				for(int i = 1; i < numbers.length; i++) {
				    if(numbers[i] == numbers[i - 1] )
				    {System.out.println(numbers[i]);
				    	break;
				    }
				}}}
	


