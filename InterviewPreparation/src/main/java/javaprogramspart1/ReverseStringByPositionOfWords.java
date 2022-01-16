package javaprogramspart1;

/*Write a Java program to reverse position of words in given string i.e. word at first position in string should be at last position in string.

Input String: You are awesome
Output String: awesome are You

Step 1: First of all we need to extract words from a given string.
Step 2: Traverse from end to first position and print array content. */

import java.util.Scanner;

public class ReverseStringByPositionOfWords {
 
    /*
     * This method splits given string by space delimiter and returns a String
     * array.
     */
    public static String[] splitStringBySpace(String inputStringToSplit) {
        return inputStringToSplit.split(" ");
    }
 
 
    public static void main(String[] args) {
 
        // User input for the string to know length
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to reverse each word:");
 
        String userInput = sc.nextLine();
 
        sc.close();
         
        // Split string
        String[] splitedString = splitStringBySpace(userInput);
         
        // Output with each word reversed
        String desiredString="";
         
        // Reversing word by word and appending
        for(int j=splitedString.length-1;j>=0;j--)
        {
            desiredString= desiredString + splitedString[j] +" ";
        }
         
        System.out.println("Original string            :"+userInput);
         
        System.out.println("String with reversed words :"+desiredString);
    }
}