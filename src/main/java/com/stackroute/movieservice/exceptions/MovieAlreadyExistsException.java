package com.stackroute.movieservice.exceptions;

public class MovieAlreadyExistsException extends Exception{

	 public MovieAlreadyExistsException(String s)
	    {
	        // Call constructor of parent Exception
	        super(s);
	    }
}
