package javaprogramspart1;

/*You need to find missing alphabets from a given string. E.g.
User input: “Amod Mahajan”
Output: [B, C, D, E, F, G, H, I, J, K, L, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, b, c, e, f, g, i, k, l, p, q, r, s, t, u, v, w, x, y, z]

Logic step by step:

Step 1: Remove all whitespaces from given string as we just need characters of given string. To do this, we can use replaceAll() method of String class. I will remove all white spaces into empty space. E.g. userInput.replaceAll(” “, “”)

Step 2: We need to extract each character from given string and store in an array. We can do this using split() method. E.g.
String [] inputStringArray = userInput.split(“”);

Step 3: Create an array of alphabets including upper and lower alphabets.
String alphabets[]= “abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ”.split(“”);

Step 4: Now create a Set of above arrays. Set is useful to remove duplicate characters and find intersection of arrays.*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
 
public class MissingAlphabets 
{ 
    public static void main(String[] args) 
    { 
        // User input for the string to know length
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to know the length:");
        String userInput = sc.nextLine(); 
        // We must close input stream
        sc.close(); 
        System.out.println("You entered: " + userInput);         
        
        // Replacing whitespace to empty as we are concerned about alphabets
        userInput= userInput.replaceAll(" ", "");
        System.out.println("User input without spaces :"+userInput);
         
        // Creating a String array containing each character of user input
        String [] inputStringArray = userInput.split("");
                
        // Creating a String array containing alphabets
        String alphabets[]= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");         
         
        // Creating HashSet to find intersections
        HashSet<String> s1 = new HashSet<String>(Arrays.asList(inputStringArray));
        HashSet<String> s2 = new HashSet<String>(Arrays.asList(alphabets));
         
        System.out.println("User Input in set :"+s1);
        System.out.println("Alphabets :"+s2);
         
        // Intersection of above sets
        s2.removeAll(s1);         
         
        // Missing alphabets
        System.out.println("Missing alphabets :"+ s2);              
         
    }
}