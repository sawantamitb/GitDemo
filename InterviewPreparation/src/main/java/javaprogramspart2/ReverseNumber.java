package javaprogramspart2;

import java.util.Scanner;

/*
Question-3: Write a function to reverse a number in Java?

*/
public class ReverseNumber 
{

	public static long doInvert(long number)
	{
		long invert = 0;
		while (number != 0) 
		{
			invert = (invert * 10) + (number % 10);
			number = number / 10;
		}
		return invert;
	}

	public static void main(String args[]) {
				
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Please enter the long number to reverse:");
	 
	      Long userInput = sc.nextLong();
	      sc.close();
	         
		
		System.out.println("Input value : " + userInput);
		System.out.println("Inverted value : " + ReverseNumber.doInvert(userInput));
	}
}