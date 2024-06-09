package com.java.core.oops.statickeyword;

class An {
	int i = 10;
}

class Bn extends An {
	int i = 20;

	public static void main(String[] args) {
		An a = new Bn();
		System.out.println(a.i); // for Variables the reference will get printed
		
		Bn b = new Bn();
		System.out.println(b.i);
		
	//	System.out.println(i);   // Compiler error since i is not a static variable
	}
}

public class JavaClassVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}