package com.exception.handling.custom.inheritance;

public class testClass {
	
	public static void main(String[] args) {
		
		
	}
	
	// MyTestException will be a checked Exception class since it is extending Exception class
	// we need to add it in method throws declaration  before throw new
	public void m1() throws MyTestException {       
		throw new MyTestException("djhgjd");
	}
	
	
	// MyTestException will be a checked IOException class since it is extending Exception class
	// we need to add it in method throws declaration  before throw new
	public void m2() throws MyTestException, MyTestExceptionIOException {       
		throw new MyTestExceptionIOException("kjedhekj");
	}
	
	public void m3() throws MyTestException, MyTestExceptionIOException {       
		throw new MyTestExceptionRunTime("jwhewkjq");
	}
	
	public void m4() throws MyTestException, MyTestExceptionIOException, MyTestExceptionThrowable {       
		throw new MyTestExceptionThrowable("kjhdekj");
	}

}
