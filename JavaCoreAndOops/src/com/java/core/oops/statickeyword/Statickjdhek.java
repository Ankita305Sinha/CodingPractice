package com.java.core.oops.statickeyword;

public class Statickjdhek {
//	In the above example, when B::sayHello executes, the hello field that will be accessed will be 
//	static field defined on type B and not inherited field of type A 
//	( since type B is closer in the type hierarchy to the perspective type B).

	public static void main(String[] args) {
		 Ch chObj = new Ch();
		 
		 chObj.sayHello(); // output --- 50
	     System.out.println(Bh.hello);   // output --- 50
	}

}

class Ah {
    public int hello;
}
class Bh extends Ah {
    public static int hello = 120;
    public Bh() {
        this.hello = 50;
    }
    
    public void sayHello() {
        System.out.println(this.hello); 
        // which hello static field or instance field ?
    }
}
class Ch extends Bh {
    public static int hello = 3;
}