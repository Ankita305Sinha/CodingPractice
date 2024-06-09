package com.java.core.oops.statickeyword;

public class StaticAndInheritence3 {

	public static void main(String args[]) {
		Ba.changeHiMessage();
		// which messsage is changed ? B.hiMessage
		Ca.checkHiMessage(); // what message is shown? A.hiMessage
	}
}

class Ab {
	static String hiMessage = "Hi";
}

class Ba extends A {

	static private String hiMessage = "Hiii"; // This will not inherited and can only be read/changed from class Ba

	static void changeHiMessage() {
		System.out.println(hiMessage);
		hiMessage = "Evil Message";
		System.out.println(hiMessage);
	}
}

class Ca extends A {
	static void checkHiMessage() {
		System.out.println(hiMessage);
	}
}

class MyClassTest {

}
/**
 * OUTPUT: Hi
 **/
