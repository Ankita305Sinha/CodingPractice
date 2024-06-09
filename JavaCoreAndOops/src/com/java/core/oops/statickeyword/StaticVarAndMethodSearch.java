package com.java.core.oops.statickeyword;

public class StaticVarAndMethodSearch {

	public static void main(String[] args) {
		 Bg.goodOne(); // goodOne searched from type B,not found in B, then serach in A and found on type A
	}

}

class Ag {
    static private String assume = "I do not like to assume";
    static void myHello() {
        System.out.println("Hello A " + assume);
    };
    
    static void goodOne() {
        System.out.println("goodOne defined on type A");
        myHello();  //----method of Class Ag will be executed
    }
}
class Bg extends Ag {
    static public void myHello() {
        System.out.println("Hello B");
    }
}