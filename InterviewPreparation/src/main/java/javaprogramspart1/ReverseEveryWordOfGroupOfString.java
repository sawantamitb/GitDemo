package javaprogramspart1;

/*“Java Program to Reverse Every Word of a String”
Original string                      :Make Selenium Easy
String with reversed words  :ekaM muineleS ysaE

We need to reverse a given string word by word. Note here we are not changing default position of words here.

Step 1: First of all we need to extract words from a given string. 
Step 2: To reverse a word, we just need to iterate it from last index of word, read and append it until you reach first index of word. 
To read any character at specific index, we have a method named chatAt(int index).
Step 3: We have extracted words and know the logic to reverse a word. 
You just need to call reversing word method for each word in given string. 
For this you can use a for loop.*/


import java.util.Scanner;

public class ReverseEveryWordOfGroupOfString 
{
 
    /*
     * This method splits given string by space delimiter and returns a String
     * array.
     */
    public static String[] splitStringBySpace(String inputStringToSplit) {
        return inputStringToSplit.split(" ");
    }
 
    /*
     * This method reverse the given word and return it.
     */
    public static String reverseWord(String inputWord) {
        String reverse = "";
        // Reading char by char from end and appending
        for (int i = inputWord.length() - 1; i >= 0; i--) {
            reverse = reverse + inputWord.charAt(i);
        }
        return reverse;
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
        for(int j=0;j<splitedString.length;j++)
        {
            desiredString= desiredString + reverseWord(splitedString[j]) +" ";
        }
         
        System.out.println("Original string            :"+userInput);
         
        System.out.println("String with reversed words :"+desiredString);
    }
}
