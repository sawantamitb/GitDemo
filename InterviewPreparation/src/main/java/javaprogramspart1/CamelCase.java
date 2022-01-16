package javaprogramspart1;

/*Convert first character of each word into upper case and join without any whitespace.

A sentence is a collection of words generally separated by a white space. 
We can extract words of given sentence using split method.
Now extract first character of first word and check if it is not uppercase already. 
If it is not, convert first char to upper case and append remaining characters of word. we can use subString method.
If it is already in uppercase, append entire word. Repeat the same for all words.
*/

import java.util.Scanner;

public class CamelCase {
 
	public static String convertToCamelCase(String sentence) {
 
		// Extract all words
		String words[] = sentence.split("\\s+");
		
		// Creating an empty string of type StringBuilder so that modification of string is possible.
		StringBuilder sb = new StringBuilder();
		
		// Iterating through words
		for (String word : words) {
			//Extracting first char
			char firstChar = word.charAt(0);
			// Checking if firstchar is not in upper case already
			if (!Character.isUpperCase(firstChar)) {
				// Convert first char into upper case and then append remaining characters of words. 
				sb.append(Character.toUpperCase(firstChar)).append(word.substring(1));
			} else
				sb.append(word.substring(0));
			
		}
		
		// Converting StringBuilder to String. trim() is needed to trim last space appended. 
		String result = sb.toString().trim();
		return result;
	}
 
	public static void main(String[] args) {
 
		// User input for the string to know length
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to convert in to camel case:"); 
		String userInput = sc.nextLine(); 
		sc.close(); 
		System.out.println("You entered: " + userInput); 
		System.out.println("Output is :" + convertToCamelCase(userInput));	 
	} 
}
