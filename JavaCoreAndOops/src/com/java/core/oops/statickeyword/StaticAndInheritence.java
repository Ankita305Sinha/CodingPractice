package com.java.core.oops.statickeyword;

public class StaticAndInheritence {

	public static void main(String[] args) {

		A.showHello();
		B.showHello(); // static method of A inherited by class B
		/**
		 * OUTPUT: A::showHello static Hi 
		 * A::showHello static Hi
		 **/
		
		System.out.println();
		A.showHello(); // print showhello in Base Class
	    C.wishHelloAndBye();
	    /** 
	    OUTPUT:
	    A::showHello static Hi
	    A::showHello static Hi
	    Good Bye
	     **/
		
	}

}

class A {
	static String hiMessage = "Hi";

	static void showHello() {
		System.out.println("A::showHello static = " + hiMessage);
	}
}

// Class B inherits the static variable and Static method
class B extends A {
}


//Class B inherits the static variable and Static method
class C extends A {
	static String byeMessage = "Bye";
	static String goodByeMessage = "Good Bye";

	static void wishHelloAndBye() {
		System.out.println("For Class C ");
		showHello();   // since the method is inherited so the subclass can treat the method as its own, so no need of class name
		if (hiMessage.equals("hi")) {
			System.out.println(byeMessage);
		} else {
			System.out.println(goodByeMessage);
		}
	}

}
