package javaprogramspart2;

/*
Question-10: Write a Java program to demonstrate string reverse with and without StringBuffer class?
*/


public class ReverseStrings {

	public static String invertWithStringBuffer(String str) {

		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse();
		return buffer.toString();
	}

	public static String invertWithoutStringBuffer(String str) {

		int length = str.length();
		String original = str;
		String invert = "";
		for (int i = length - 1; i >= 0; i--) {
			invert = invert + original.charAt(i);
		}
		return invert;
	}

	public static void main(String[] args) {

		
		System.out.println("Inverted String with StringBuffer class: "
				+ ReverseStrings.invertWithStringBuffer("987654321"));

		System.out.println("");

		System.out.println("Inverted String without StringBuffer class: "
				+ ReverseStrings.invertWithoutStringBuffer("kjihgfedcba"));
	}
}