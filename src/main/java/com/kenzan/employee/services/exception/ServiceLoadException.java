package com.kenzan.employee.services.exception;

public class ServiceLoadException extends RuntimeException
{
	public ServiceLoadException()
	{
	}

	public ServiceLoadException(String message)
	{
		super(message);
		System.out.println("ServiceLoadException");

	}

	public ServiceLoadException(String message, RuntimeException innerException)
	{
		super(message, innerException);
		System.out.println("ServiceLoadException - innerException");

	}

}