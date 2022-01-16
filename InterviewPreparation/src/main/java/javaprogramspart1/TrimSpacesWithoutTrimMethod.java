package javaprogramspart1;


/*Write a java program to Trim a given string without using inbuilt trim() method of String Class in Java.

We need to find first index of non space char in given string from beginning. Say it First.
We need to find first index of non space char in given string from end. Say it Last.
Return a substring indexing from First till Last.

“trim()” method of String class trims leading and trailing whitespace/s of given string. 
It does not remove whitespace between words. We need to write logic to do so.
*/

import java.util.Scanner;

public class TrimSpacesWithoutTrimMethod {
	 
	public static String trimSpace(String str) {
 
		// Assume 0th index is non-space character
		int startNonSpaceIndex = 0;
 
		// Assume last index is non-space character
		int endNonSpaceIndex = str.length()-1;
 
		// Store length in a variable
		int strLength = str.length();
 
		// Convert string into char array
		char[] val = str.toCharArray();
 
		// Increment startNonSpaceIndex by one until you really find a non space char
		while (startNonSpaceIndex < strLength && val[startNonSpaceIndex] == ' ') {
			startNonSpaceIndex++;
		}
 
		// Decrement endNonSpaceIndex by one until you really find a non space char
		// Since we know starting index of a non space char, so we should not exceed
		// that which
		// is taking care by (startNonSpaceIndex &lt; endNonSpaceIndex)
		while (startNonSpaceIndex < endNonSpaceIndex && val[endNonSpaceIndex] == ' ') {
			endNonSpaceIndex--;
		}
 
		// Now you have actual starting and ending index of non space char in given
		// string.
		return str.substring(startNonSpaceIndex, endNonSpaceIndex+1);
	}
 
	public static void main(String[] args) {
 
		// User input to trim spaces
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to trim spaces:");
 
		String userInput = sc.nextLine();
 
		sc.close();
 
		System.out.println("You entered with spaces: \"" + userInput+"\"");
		
		System.out.println("String after trimming space: \""+trimSpace(userInput) +"\"");
	}
}