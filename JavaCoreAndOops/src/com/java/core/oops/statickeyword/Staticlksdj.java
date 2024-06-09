package com.java.core.oops.statickeyword;

public class Staticlksdj {
//	How are fields and methods resolved when static fields and static methods are used inside instance methods of the class?
//	Another consideration about static fields and static methods is that it might clash with instance fields/methods 
//	since objects and instance methods are capable of accessing static fields/methods.
	
	public static void main(String args[]) {

		Ce ceObj = new Ce();
		
		ceObj.sayHello();           // Output 50 from B's hello
		System.out.println( Ae.hello );   //// Output 120
	}
}

class Ae {
	public static int hello = 120;
}

class Be extends Ae {
	private int hello;

	public Be() {
		this.hello = 50;
	}

	public void sayHello() {
		System.out.println(hello);
		// which hello static field or instance field ?
	}
}

class Ce extends Be {
	public static int hello = 3;
}