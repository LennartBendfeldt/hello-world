package project1;

import java.util.*;

public class Fivenumbers {

	public static void main(String[] args) {
		
		System.out.print("Give me 5 numbers (separated by enters.)\n");
		
		Scanner keyboard = new Scanner(System.in);
		
		int arraysize = 5;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(arraysize);
		
		//input array integers
		for(int i = 0; i < arraysize; i++) 
		{
		numbers.add(keyboard.nextInt());
		}
		
		System.out.println("Here are your numbers: " + numbers);
		
		//sum of all 5 numbers
		int sum = 0;
		
		for(int nums : numbers ) 
		{
			sum += nums;
		}
		
		System.out.println("This is the sum of all of your numbers: " + sum);
		
		//Product of all 5 numbers
		int product = 1;
		
		for(int i : numbers) 
		{
			product *= i;
		}
		
		System.out.println("This is the product of all of your numbers: " + product);
		
		//Find largest number
		int max = numbers.get(0);
        for(int i = 0; i < arraysize; i++)
        {
            if(max < numbers.get(i))
            {
                max = numbers.get(i);
            }
        }
        
        System.out.println("This is the largest number: " + max);
        
        //Find smallest number
        int min = numbers.get(0);
        for(int i = 0; i < arraysize; i++)
        {
        	if(min > numbers.get(i))
        	{
        		min = numbers.get(i);
        	}
        }
		
		System.out.println("This is the smallest number: " + min);
		
	}

}
