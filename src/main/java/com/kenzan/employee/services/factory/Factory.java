package com.kenzan.employee.services.factory;

import com.kenzan.employee.services.IService;
import com.kenzan.employee.services.exception.ServiceLoadException;
import javax.naming.InitialContext;
import javax.naming.Context;

// uncomment to use SAXPropertyManager instead of code in getImplName which uses Tomcat web.xml 
//import com.canopyaudience.model.services.manager.SAXPropertyManager;

import org.apache.log4j.Logger;
// import org.apache.velocity.context.Context;

/**
 * This factory class takes a string name of a service, creates a class equivalent of it
 * and returns it in this classes interface form.
 * 
 * All service classes (com.kenzan.employee.services.*) implement IService interface.
 *     
 * The getService method does not return IApplicationSvc or IReleaseSvc but returns class of type IService
 * which continues the decoupling theme of MVC so the calling classes don't deal with a concrete implementation
 * class but its interface. 
 *     
 * @author Jason L. Canney
 *
 */
public class Factory
{
        /** Next three lines part of the Singleton Pattern.
	 * used to guarantee that only one object is instantiated at any time
        */
	Factory() {}
	private static Factory factory = new Factory();
	public static Factory getInstance() {return factory;}

        /*
	 * Category set in config/log4j.properties as
	 * log4j.category.com.classexercise=DEBUG, A1
	 */
        static Logger log = Logger.getLogger(Factory.class);
    
        /**
	 * getService calls the getImplName method below to read 
	 * the java.util.properties file to get the relevant SVC class NAME value
	 * @param serviceName
	 * @return service
	 * @throws ServiceLoadException
	 */
	public IService getService(String serviceName) throws ServiceLoadException
	{
		try 
		{
		   Class<?> c = Class.forName(getImplName(serviceName));
		   return (IService)c.newInstance();
		} catch (Exception excp) 
		{
		   serviceName = serviceName + " not loaded";
                   log.error (serviceName, excp);
		   throw new ServiceLoadException(serviceName, (RuntimeException) excp);
		}
	}
        
        /**
	 * Used to pull in properties from application.properties which is located in the projects config folder.
	 * @param serviceName
	 * @return service
	 * @throws Exception
	 */
	private static String getImplName (String serviceName) throws Exception
	{
	    log.info ("---->Inside Factory::getImplName");

	   InitialContext initialContext = new InitialContext(); 
	    return (String)initialContext.lookup("java:comp/env/" + serviceName);
	    
	    
        // uncomment this and comment out the above three lines if you want to use the SAXPropertyManager and NOT the web.xml tomcat container
	    //return SAXPropertyManager.getPropertyValue(serviceName);                  
        
        }
}