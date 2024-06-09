package com.exception.handling.inhertitance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Animal {

	public void hasTeeth() {
		System.out.println("Has Teeth, superclass method with no Exception");
	}
	
	public void canJump() {
		System.out.println("canJump, superclass method has checked IOException");
	}
	
	public void canWalk() {
		System.out.println("canWalk, superclass method has checked IOException");
	}
	
	public void canMakeSound() throws RuntimeException {
		System.out.println("CanMakeSound, superclass method has unchecked RuntimeException");
	}
	
	public void canRocknRoll() throws FileNotFoundException {
		System.out.println("canRocknRoll, superclass method has unchecked RuntimeException");
	}
	
	public void canLove() throws NullPointerException {
		System.out.println("canRocknRoll, superclass method has unchecked RuntimeException");
	}

	public void canRun() throws IOException {
		System.out.println("canRun, superclass method has checked IOException");
	}
	
	public void canSleep() throws IOException {
		System.out.println("canRun, superclass method has checked IOException");
	}
	
	public void canEat() throws Exception {
		System.out.println("canEat, superclass method has checked IOException");
	}
	
	public void isHerbivore() throws Exception {
		System.out.println("isHerbivore, superclass method has checked IOException");
	}
	
}
