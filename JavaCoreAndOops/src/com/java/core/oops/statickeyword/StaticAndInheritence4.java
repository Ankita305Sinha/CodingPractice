package com.java.core.oops.statickeyword;

public class StaticAndInheritence4 {

	public static void main(String args[]) {
		System.out.println(Cc.hiMessage); // since hiMessage in B has private access 
		// type perspective C used for searching field
		// B.hiMessage field not accessible outside class B
	}
}

class Ac {
	static String hiMessage = "Hi";
}

class Bc extends A {
	static private String hiMessage = "Hiii";
}

class Cc extends Bc {
}

//The below program does not compile.
//class A defines package static field hiMessage
//class B defines private static field hiMessage,
//class B also inherits from class A
//class C inherits from B which inherits from A
//class C cannot use the inherited package static field hiMessage defined by class A implicitly, 
//since class B is closer to class C in type hierarchy and the field hiMessage defined by class B has a 
//private access restriction and cannot be used from outside the class B.