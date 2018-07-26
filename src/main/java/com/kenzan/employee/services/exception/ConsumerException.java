package com.kenzan.employee.services.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/** 
*/


/** 
 @author Jason L. Canney
 
 
 
*/

public class ConsumerException extends RuntimeException
{

	/** @param serialVersionUID = unique identifier 
	 @param Throwable exception 
	 @param inMessage is a string 
	*/
	private static final long serialVersionUID = 1L;
	private static RuntimeException inNestedException;
	private static String inMessage;

	/** 
	 @param string 
	 @param ioeinMessage 
	*/
	public ConsumerException(String string, IOException ioeinMessage)
	{
		super(inMessage, inNestedException);
		System.out.println("IO Exception - ConsumerSvcxxxImpl");
	}

	/** 
	 @param string 
	 @param fnfe 
	*/
	public ConsumerException(String string, FileNotFoundException fnfe)
	{
		super(inMessage, inNestedException);
		System.out.println("File Not Found - ConsumerSvcxxxImpl");
	}

	/** 
	 @param string 
	*/
	public ConsumerException(String string)
	{
		super(inMessage);
	}

}