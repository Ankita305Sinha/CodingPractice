package com.java.core.oops.statickeyword;

public class StaticAndInheritence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 F.changeHiMessage();
	     G.checkHiMessage(); // changed messaged from Class F will be printed
	}

}

class E {
    static String hiMessage = "Hi";
}
class F extends A {
   static void changeHiMessage() {
       hiMessage = "Evil Message";   // this changes the value of hiMessage variable
   }
}
class G extends A {
    static void checkHiMessage() {
        System.out.println(hiMessage);
    }
}
