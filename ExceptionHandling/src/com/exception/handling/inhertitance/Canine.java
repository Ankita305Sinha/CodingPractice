package com.exception.handling.inhertitance;

import java.io.IOException;

public class Canine extends Animal {
	
	// When no exception in SuperClass Child can choose not to throw any exception
	public void hasTeeth() {
		System.out.println("In Child Class, Overriding - hasTeeth, superclass method with no Exception");
	}
	
	// When no exception in SuperClass Child can not to throw any checked exception
//	public void canJump() throws IOException{
//		System.out.println("In Child Class, Overriding - canJump, superclass method has checked IOException");
//	}
	
	// When no exception in SuperClass Child can throw any unchecked/runtime exception
	public void canWalk() throws ArithmeticException {
		System.out.println("In Child Class, Overriding - canWalk, superclass method has checked IOException");
	}
	
	// When unchecked/runtime exception in SuperClass Child can throw any unchecked/runtime exception 
	// no need to maintain hierarchy of unchecked/runtime exception,
	// but cannot write just throws Exception or checked exception
	public void canMakeSound() throws NullPointerException {
		System.out.println("In Child Class, Overriding - CanMakeSound, superclass method has unchecked RuntimeException");
	}
	
	// When checked exception in SuperClass Child can choose not to throw any exception
	public void canRocknRoll(){
		System.out.println("In Child Class, Overriding - canRocknRoll, superclass method has unchecked RuntimeException");
	}
	
	// When unchecked/runtime exception in SuperClass Child can throw any unchecked/runtime exception 
	// no need to maintain hierarchy of unchecked/runtime exception,
	public void canLove() throws RuntimeException {
		System.out.println("canRocknRoll, superclass method has unchecked RuntimeException");
	}

	// When checked exception in SuperClass Child can choose not to throw any other checked exception
	// but can throw any unchecked/runtime exception no need to maintain hierarchy of unchecked/runtime exception,
	public void canRun()  throws NullPointerException {
		System.out.println("In Child Class, Overriding - canRun, superclass method has checked IOException");
	}
	
	// When checked exception in SuperClass Child can only throw same exception or 
	// exception which is lower in hierarchy as defined in superclass method maintain hierarchy of checked exception
//	public void canSleep() throws Exception {
//		System.out.println("canRun, superclass method has checked IOException");
//	}
//	
	// When checked exception in SuperClass Child can choose not to throw any checked/Unchecked exception
	public void canEat(){
		System.out.println("In Child Class, Overriding - canEat, superclass method has checked IOException");
	}
	
	public void isHerbivore() throws IOException, NullPointerException{
		System.out.println("isHerbivore, superclass method has checked IOException");
	}

}
