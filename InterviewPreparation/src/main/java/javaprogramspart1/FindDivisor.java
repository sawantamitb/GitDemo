package javaprogramspart1;


/*Write a JAVA program to find the divisors of a given number.

Divisor is a number that divides  another number without a reminder or a number that divides an integer evenly.
Ex: 10/2= 5 (Here 2 is divisor.)*/

import java.util.Scanner;

public class FindDivisor {

		// A method of finding and printing divisor
	    static void findAndPrintDivisors(int n)
	    {
	        for (int i=1;i<=n;i++)
	            if (n%i==0)
	                System.out.printf("%d ",i);
	    }
	 
	    
	    public static void main(String args[])
	    {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Please enter the number greater than zero:");
	    	int num= sc.nextInt();
	        System.out.println("The divisors of "+num+" are: ");
	        findAndPrintDivisors(num);
	    }
	
}
