package com.kenzan.employee.business.exception;

/**
 * 
 * Service Load Exception class in the business layer for issues when business classes run into problems
 * @author JasonCanney
 *
 */
@SuppressWarnings("serial")

/**
 * Used to catch issues with loading services through the business layer
 * @author JasonCanney
 *
 */
public class ServiceLoadException extends Exception
{
    public ServiceLoadException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
	
} // end class ServiceLoadException