/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenzan.employee.business.manager;

import com.kenzan.employee.domain.employee;
import junit.framework.TestCase;
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
public class employeeManagerTest extends TestCase{
    
    public employeeManagerTest() {
    }
    
    employee employee1;
    employee employee2;
    employee employee3;

    @Before	
	protected void setUp() throws Exception {
		
		super.setUp();
                // Factory factory = Factory.getInstance();
		employee1 = new employee (86730, "1", "2", "3", "4", "5","6","7","8","9","10",1,"2",3, "password1");                
                employee2 = new employee (86730, "1", "2", "3", "4", "5","6","7","8","9","10",1,"2",3, "password2");             
                // employee3 = new employee (86731, "1", "2", "3", "4", "5","6","7","8","9","10",1,"2",3, "password3");              

        }
        /*
	 * Category set in config/log4j.properties as
	 * log4j.category.com.classexercise=DEBUG, A1
	 */
        static Logger log = Logger.getLogger(employeeManagerTest.class);
    /**
     * Test of Create method, of class employeeManager.
     */
    @Test
    public void test1Create() {
        log.info ("employeeManagerTest - test1Create");
        employeeManager instance = new employeeManager();
        boolean expResult = true;
        boolean result = instance.Create(employee1);
        assertEquals(expResult, result);   
    }

    /**
     * Test of Get method, of class employeeManager.
     */
    @Test
    public void test2GetA() throws Exception {
        log.info ("employeeManagerTest - test2GetA");
        employeeManager instance = new employeeManager();
        employee c = instance.GetA(employee1.getConsumerID());
        assertEquals(c.getConsumerID(), employee1.getConsumerID());   
    }
    
    /**
     * Test of Update method, of class employeeManager.
     */
    @Test
    public void test3Update() {
         log.info ("employeeManagerTest - test3Update");
        employeeManager instance = new employeeManager();
        boolean expResult = true;
        boolean result = instance.Update(employee2);  // adimpression2 is a pre-updated adimpression object for adimpression1
        assertEquals(expResult, result);        
    }

    /**
     * Test of Delete method, of class employeeManager.
     */
    @Test
    public void test4Delete() {
        log.info ("employeeManagerTest - test4Delete");
        employeeManager instance = new employeeManager();
        boolean expResult = true;
        boolean result = instance.Delete(employee1);
        assertEquals(expResult, result);  
    }
    
}
