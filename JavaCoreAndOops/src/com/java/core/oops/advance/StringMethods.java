package com.java.core.oops.advance;

public class StringMethods {
	
	public static void main(String[] args) {
		
		// https://www.javatpoint.com/java-string-concat
		
//		Java String charAt()
		String name="javatpoint";  
		char ch=name.charAt(4);//returns the char value at the 4th index  
		System.out.println(ch);  
		
//		Java String compareTo()

//		if s1 > s2, it returns positive number  
//		if s1 < s2, it returns negative number  
//		if s1 == s2, it returns 0  
		
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
		
	//	Java String concat
		
		String str="java string";    
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		str.concat("is immutable");    
		System.out.println(str);    
		str=str.concat(" is immutable so assign it explicitly");    
		System.out.println(str);    
		
	//  Java String contains
		String strc="what do you know about me";  
		System.out.println(strc.contains("do you know"));  
		System.out.println(strc.contains("about"));  
		System.out.println(strc.contains("hello"));  
	}
	
	
}
