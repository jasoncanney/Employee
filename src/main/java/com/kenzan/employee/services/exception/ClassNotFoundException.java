package com.kenzan.employee.services.exception;

/** 
*/

public class ClassNotFoundException extends RuntimeException
{
	public ClassNotFoundException()
	{
	}

	public ClassNotFoundException(String message)
	{
		super(message);
	}

	public ClassNotFoundException(String message, RuntimeException innerException)
	{
		super(message, innerException);
	}

	
}