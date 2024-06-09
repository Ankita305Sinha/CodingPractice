package com.java.core.oops.statickeyword;

public class HidingInStaticMethod {

	public static void main(String args[]) {
		Ad.myHello();
		Bd.myHello();
	}
}

class Ad {
	static void myHello() {
		System.out.println("Hello A");
	};
}

class Bd extends Ad {
	static public void myHello() {
		System.out.println("Hello B");
	}
}

//The static methods defined in a subclass should at least be 
//as accessible as the static method defined by the super types in the type hierarchy 
//when the method has the same name and same signature and compatible return types. 
//		
//In such case the subclass static method hides the superclass static method.