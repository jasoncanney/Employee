package com.kenzan.employee.business.exception;

/**
 * Exception class that is used by PropertyManager in the service layer for reading in properties file
 * @author JasonCanney
 *
 */


public class PropertyFileNotFoundException extends Exception
{
    /**
	 * @param serialVersionUID - unique identifier
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param inMessage
	 * @param inNestedException
	 */
	public PropertyFileNotFoundException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
	
} // end class PropertyFileNotFoundException