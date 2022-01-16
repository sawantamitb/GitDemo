package javaprogramspart1;

import java.util.Scanner;

public class occurrenceOfCharWithoutCollections {
 
	public static void occurrenceOfChar(String inputString) {
 
		// Converting input string to upper case
		inputString = inputString.toUpperCase();
 
		// We need to keep counting char till its length is greater than 1
		while (inputString.length() > 1) {
 
			// Resetting counter to zero for each iteration
			int counter = 0;
			// Extracting first char
			char c = inputString.charAt(0);
			// Iterating to find occurrence
			for (int j = 0; j < inputString.length(); j++) {
				// If matches, increment counter
				if (c == inputString.charAt(j)) {
					counter++;
				}
			}
			// Giving name to whitespace
			if (Character.isWhitespace(c)) {
				System.out.println("Occurrence of whitespace : " + counter);
			} else {
				System.out.println("Occurrence of " + inputString.charAt(0) + " : " + counter);
			}
 
			// Remove char whose occurrence is checked
			inputString = inputString.replace(Character.toString(inputString.charAt(0)), "");
		}
		// Printing single occurrence
		if (inputString.length() == 1) {
			System.out.println("Occurrence of " + inputString.charAt(0) + " : 1");
		}
 
	}
 
	public static void main(String[] args) {
 
		// User input for the string to know length
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to find occurrence of each char:");
 
		String userInput = sc.nextLine();
 
		sc.close();
 
		System.out.println("You entered: " + userInput);
 
		occurrenceOfChar(userInput);
	}
 
}