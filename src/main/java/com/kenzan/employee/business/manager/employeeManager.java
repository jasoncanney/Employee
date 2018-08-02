package com.kenzan.employee.business.manager;

import com.kenzan.employee.domain.employee;
import com.kenzan.employee.services.employee.*;
import com.kenzan.employee.services.employee.ManagerSuperType;
import com.kenzan.employee.services.exception.EmployeeException;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Service
public class employeeManager extends ManagerSuperType
{
        // create reference to the actual config file
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});   
        // leverage spring to get the config information for the service
        IEmployeeSvc consSvc = (IEmployeeSvc)context.getBean("IEmployeeSvc");
        
        /*
	* Category set in config/log4j.properties as
	* log4j.category.com.classexercise=DEBUG, A1
	*/
        static Logger log = Logger.getLogger("employeeManager.clss");
        

	/** 
	 Business use case for "store employee"
	 
	 @param c
            * @return 
	*/
	public final boolean Create(employee c)
	{
            log.info ("employeeManager - Create");
            consSvc.storeEmployee(c);
            return true;
	}

	/** 
	 Business use case for "retrieve employee list"
	 
	 @return Set<employee>
        * @throws java.lang.ClassNotFoundException
	*/
	public final List<employee> Get() throws EmployeeException, ClassNotFoundException
	{
                log.info ("employeeManager - Get");
                log.info ("Next: return consSvc.getEmployee");
		return consSvc.getEmployee();
	}
        
	/** 
	 Business use case for "retrieve employeeID"
	 
	 @return 
	*//**
	public final int whatIsEmployeeID(String socemail)
	{
		Factory factory = Factory.GetInstance();
		IEmployeeSvc consSvc = (IEmployeeSvc)factory.getService("IEmployeeSvc");
		return consSvc.whatIsEmployeeID(socemail);
	}
*/
	/** 
	 Business use case for "retrieve single employee"
         * @param id
	 @return employee
        * @throws java.lang.ClassNotFoundException
	*/
	public final employee GetA(int id) throws EmployeeException, ClassNotFoundException
	{
            log.info ("employeeManager - GetA");
            return consSvc.getAEmployee(id);
	}
        
	/** 
	 Business use case for "update employee"
	 S
	 @param c
	*/
	public final boolean Update(employee c)
	{
                log.info ("employeeManager - Update");
		consSvc.updateEmployee(c);
		return true;
	}

	/** 
	 Business use case for "delete employee"
	 
	 @param c
	*/
	public final boolean Delete(employee c)
	{
		log.info ("employeeManager - Delete");
                consSvc.deleteEmployee(c);
		return true;
	}


}