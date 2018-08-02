/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenzan.employee.services.employee;

import com.kenzan.employee.domain.employee;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Jason
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeSvcHibernateImplTest extends TestCase{
    
    public EmployeeSvcHibernateImplTest() {
    }

    employee employee1;
    employee employee2;
    employee employee3;

    @Before	
	protected void setUp() throws Exception {
		
		super.setUp();
                // Factory factory = Factory.getInstance();
		employee1 = new employee ("FirstName", "Middle", "Last","DOB","DOE","ACTIVE");
                employee2 = new employee ("01", "02", "03","04","05","06");
                employee3 = new employee ("01", "02", "03","04","05","06");
        }
        /*
	 * Category set in config/log4j.properties as
	 * log4j.category.com.classexercise=DEBUG, A1
	 */
        static Logger log = Logger.getLogger(EmployeeSvcHibernateImplTest.class);
    
    
    
    /**
     * Test of storeEmployee method, of class EmployeeSvcHibernateImpl.
     */
    @Test
    public void test1StoreEmployee() {
        log.info ("EmployeeSvcHibernateImplTest - test1StoreEmployee");
        EmployeeSvcHibernateImpl instance = new EmployeeSvcHibernateImpl();
        boolean expResult = true;
        boolean result = instance.storeEmployee(employee1);
        assertEquals(expResult, result);   
    }

    /**
     * Test of getaEmployee method, of class EmployeeSvcHibernateImpl.
     *//*
    @Test
    public void test2GetAEmployee() throws EmployeeException, ClassNotFoundException {
        log.info ("EmployeeSvcHibernateImplTest - test2GetAEmployee");
        EmployeeSvcHibernateImpl instance = new EmployeeSvcHibernateImpl();
        boolean expResult = true;
        employee c = new employee();
        c = instance.getAEmployee(employee1.getEmployeeID());
        assertEquals(employee1.getEmployeeID(), c.getEmployeeID());   
    } */
    /**
     * Test of updateEmployee method, of class EmployeeSvcHibernateImpl.
     */
    @Test
    public void test3UpdateEmployee() {
          log.info ("EmployeeSvcHibernateImplTest - test3UpdateEmployee");
        EmployeeSvcHibernateImpl instance = new EmployeeSvcHibernateImpl();
        boolean expResult = true;
        boolean result = instance.updateEmployee(employee2);  // adimpression2 is a pre-updated adimpression object for adimpression1
        assertEquals(expResult, result);    
    }

    /**
     * Test of deleteEmployee method, of class EmployeeSvcHibernateImpl.
     */
    @Test
    public void test4DeleteEmployee() {
        log.info ("EmployeeSvcHibernateImplTest - test4DeleteEmployee");
        EmployeeSvcHibernateImpl instance = new EmployeeSvcHibernateImpl();
        boolean expResult = true;
        boolean result = instance.deleteEmployee(employee1);
        assertEquals(expResult, result); 
    }
    
}
