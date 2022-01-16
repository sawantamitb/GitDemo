package javaprogramspart2;

/*
 * Question-9: Write Java code to swap two numbers without using a temporary
 * variable?
 */

public class SmartSwapping {

	public static void main(String args[]) {
		
		int numX = 10;
		int numY = 20;
		System.out.println("Pre-swapping state:");
		System.out.println("numX value: " + numX);
		System.out.println("numY value: " + numY);
		
		System.out.println("");
		
		numX = numX + numY;
		numY = numX - numY;
		numX = numX - numY;
		System.out.println("Post-swapping state:");
		System.out.println("numX value: " + numX);
		System.out.println("numY value: " + numY);
	}
}