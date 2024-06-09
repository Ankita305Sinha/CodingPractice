package com.java.core.oops.statickeyword;

public class StaticHasNoDynamicBinding {
	//There is no concept of dynamic binding in static methods in Java.
	//In Java, although not recommended, it is allowed to use an instance to access static fields and static methods of the class.
	
	//VVI**********The static fields and static methods that are accessed only depends on the type of Java reference used 
	//and not the actual type of the object.
	public static void main(String args[]) {
		Bs bPtr;
		As aPtr;
		aPtr = bPtr = new Bs();

		As.myHello();
		aPtr.myHello(); // Hello A
		// type A used to search static method myHello

		Bs.myHello();
		bPtr.myHello(); // Hello B
		// type B used to search static method myHello
	}
}

class As {
	static void myHello() {
		System.out.println("Hello A");
	};
}

class Bs extends As {
	static public void myHello() {
		System.out.println("Hello B");
	}
}

