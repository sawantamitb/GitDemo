package javaprogramspart1;

/*A Perfect number is a positive integer that is equal to the sum of its proper divisors excluding the number itself.
 * For Example: Take Number 6. Its divisors are 1, 2 , 3 and 6. 
 * When we add all divisors except 6 ( as it is number itself) (i.e. 1+2+3= 6), it is equal to actual number. 
 * So we can say Number 6 is a perfect number.
 * 
 * The smallest perfect number is 6. Other perfect numbers are 28, 496, and 8,128.
 * 
 * */

import java.util.Scanner;
 
public class PerfectNumber 
{
	public static void perfectNumber(int userInput)
	{
		// Handling numbers less than or equal to zero
		if(userInput <= 0)
		{
			System.out.println("A perfect number must be positive and greater than zero. So kindly enter number greater than zero.");
		}
		else
		{
			int sum =0;
			// Iterating till half of the number
			for(int i = 1; i<=userInput/2;i++)
			{
				// If number is divisible, add divisor.
				if(userInput%i==0)
				{
					sum = sum+i;
				}
			}
			
			// If sum is equal to number
			if(userInput==sum)
			{
				System.out.println(userInput+" is a perfect number.");
			}
			else
			{
				System.out.println(userInput+" is not a perfect number.");
			}
		}
	}
 
	public static void main(String[] args) 
	{
 		// User input for the number
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to check for perfect number : ");
 		int userInput = sc.nextInt();
		sc.close();
 		System.out.println("You entered: " + userInput);	
 		perfectNumber(userInput);
	}
}