package com.kenzan.employee.services.employee;

import com.kenzan.employee.services.IService;
import com.kenzan.employee.services.factory.Factory;


/** 
 Used as an abstract class for the managers in the business layer
 Static code below is executed anytime any of the managers in the 
 business layer are executed that inherit this abstract class
 
 @author Jason Canney
 
*/
public abstract class ManagerSuperType
{

	private Factory factory;


	protected final IService getService(String name)
	{
		return factory.getService(name);
	}

}