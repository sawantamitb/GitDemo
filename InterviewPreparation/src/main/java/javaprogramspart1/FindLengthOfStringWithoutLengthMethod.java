package javaprogramspart1;

/*java code to find the length of given string WITHOUT USING LENGTH METHOD
 * 
 * There is another method in String class called lastIndexOf().

*/
import java.util.Scanner;

public class FindLengthOfStringWithoutLengthMethod {
	
	// Method to find length of given string without length method
	public static int getLengthWithoutLengthMethod(String input)
	{
		// lastIndexOf("") will give us length of string. 
		int position= input.lastIndexOf("");
		return position;
	}

	public static void main(String[] args) {

		// User input for the string to know length
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to know the length:");
		
		String userInput= sc.nextLine();
		
		sc.close();
		
		System.out.println("You entered: "+userInput);
		
		System.out.println("Length of string \""+userInput +"\" is :" +getLengthWithoutLengthMethod(userInput));
		
		

	}
}