package com.java.core.string.methods;

public class MethodOverloadExample3 {

	// Overloaded main method which accepts two int values as arguments.
	// And prints the sum of two numbers
	public static void main(int num1, int num2) {
		System.out.println("Overloaded main() method 1 called");
		System.out.println(num1+" + "+num2+" = " + (num1 + num2));
	}

	// Overloaded main method which accepts String value as an argument.
	// And calls overloaded main method 1
	public static void main(String str) {
		System.out.println("Overloaded main() method 2 called");
		System.out.println(str);
		main(3,5);
	}

	// Original main() method which accepts String array as an argument.
	public static void main(String args[]) {
		
		System.out.println("Original main() method called");
		
		// Calls overloaded main method 2
		main("Hello");
	}
}