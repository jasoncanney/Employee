package com.kenzan.employee.business.manager;

import com.canopyaudience.model.services.consumerservice.*;
import com.canopyaudience.model.domain.*;
import com.canopyaudience.model.services.exception.ConsumerException;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @Service
public class employeeManager extends ManagerSuperType
{
        // create reference to the actual config file
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});   
        // leverage spring to get the config information for the service
        IConsumerSvc consSvc = (IConsumerSvc)context.getBean("IConsumerSvc");
        
        /*
	* Category set in config/log4j.properties as
	* log4j.category.com.classexercise=DEBUG, A1
	*/
        static Logger log = Logger.getLogger("consumerManager.class");
        
	/** 
	 Business use case for "store consumer"
	 
	 @param c
            * @return 
	*/
	public final boolean Create(consumer c)
	{
		// Factory factory = Factory.getInstance();
		// IConsumerSvc consSvc = (IConsumerSvc)factory.getService("IConsumerSvc");
		consSvc.storeConsumer(c);
		return true;
	}

	/** 
	 Business use case for "retrieve consumer list"
	 
	 @return Set<consumer>
        * @throws java.lang.ClassNotFoundException
	*/
	public final List<consumer> Get() throws ConsumerException, ClassNotFoundException
	{
		// Factory factory = Factory.getInstance();
      		// IConsumerSvc consSvc = (IConsumerSvc)factory.getService("IConsumerSvc");
                log.info ("Next: return consSvc.getConsumer");
		return consSvc.getConsumer();
	}
        
	/** 
	 Business use case for "retrieve consumerID"
	 
	 @return 
	*//**
	public final int whatIsConsumerID(String socemail)
	{
		Factory factory = Factory.GetInstance();
		IConsumerSvc consSvc = (IConsumerSvc)factory.getService("IConsumerSvc");
		return consSvc.whatIsConsumerID(socemail);
	}
*/
	/** 
	 Business use case for "retrieve single consumer"
         * @param id
	 @return consumer
        * @throws java.lang.ClassNotFoundException
	*/
	public final consumer GetA(int id) throws ConsumerException, ClassNotFoundException
	{
		// Factory factory = Factory.getInstance();
		// IConsumerSvc consSvc = (IConsumerSvc)factory.getService("IConsumerSvc");
		return consSvc.getAConsumer(id);
	}
        
	/** 
	 Business use case for "update consumer"
	 S
	 @param c
	*/
	public final boolean Update(consumer c)
	{
		// Factory factory = Factory.getInstance();
		// IConsumerSvc consSvc = (IConsumerSvc)factory.getService("IConsumerSvc");
		consSvc.updateConsumer(c);
		return true;

	}

	/** 
	 Business use case for "delete consumer"
	 
	 @param c
	*/
	public final boolean Delete(consumer c)
	{
		// Factory factory = Factory.getInstance();
		// IConsumerSvc consSvc = (IConsumerSvc)factory.getService("IConsumerSvc");
		consSvc.deleteConsumer(c);
		return true;
	}


}