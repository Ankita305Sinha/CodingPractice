package com.exception.handling.custom.inheritance;

import java.io.IOException;

public class MyTestExceptionIOException extends IOException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyTestExceptionIOException(String message){
	    super(message);
	}


}
