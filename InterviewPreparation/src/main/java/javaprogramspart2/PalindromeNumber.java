package javaprogramspart2;

/*
java program to check if a given number is palindrome.
We need to extract last digit from input number and keep it at first position for a new number.
Extract the second last digit and put in the next position of new number.
We can achieve that using multiple ways like reverse traversing or charAt methods etc. Here we will see include some number concepts.
We can extract last digit of a number(remainder) if we divide number by 10.
For examples:
a. 13/10 : Remainder= 3 which is last digit in number 13.
b. 100/10 : Remainder= 0 which is last digit in number 10.
New number which is actually reverse number, will be formed by formula “(reverseNumber*10) + remainder”.
Now divide the original number by 10 to remove last digit of it.
Repeat above steps till original number is less than zero.
*/
import java.util.Scanner;

public class PalindromeNumber 
{
 
 public static void main(String[] args) {
 
  // Taking input from user
  Scanner sc = new Scanner(System.in);
  System.out.println("Please input the number to find if it is  palindrome or not:");
  int inputByUser = sc.nextInt();
  System.out.println("Input Number to be checked for palindrome: " + inputByUser);
 
  // Closing input stream
  sc.close();
 
  // Copy input number to a temporary variable to keep original value intact
  int temp = inputByUser;
  int revNumber = 0;
 
  // checking if number is negative
  if (inputByUser < 0) {
   System.out.println("Negative number.Enter positive number.");
   System.exit(1);
 
  } // checking if number is single digit only
  else if (inputByUser >= 0 && inputByUser <= 9) {
   System.out.println(inputByUser + " is palindrome as it is single digit number.");
   System.exit(1);
  } else {
   while (temp > 0)
 
   {
    // extracting last digit of number
    int rem = temp % 10;
    // forming number
    revNumber = revNumber * 10 + rem;
    // removing last digit from number
    temp = temp / 10;
   }
 
   System.out.println("Input By User:" + inputByUser);
   System.out.println("Reverse number:" + revNumber);
 
   // Comparing if input number and reversed number are same
   if (inputByUser == revNumber) {
    System.out.println(inputByUser + " is a Palindrome Number");
   } else {
    System.out.println(inputByUser + " is not a Palindrome Number");
   }
 
  }
 
 }
}