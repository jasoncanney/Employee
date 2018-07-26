/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenzan.employee.business.manager;

import com.canopyaudience.model.domain.consumer;
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
    
    consumer consumer1;
    consumer consumer2;
    consumer consumer3;

    @Before	
	protected void setUp() throws Exception {
		
		super.setUp();
                // Factory factory = Factory.getInstance();
		consumer1 = new consumer (86730, "1", "2", "3", "4", "5","6","7","8","9","10",1,"2",3, "password1");                
                consumer2 = new consumer (86730, "1", "2", "3", "4", "5","6","7","8","9","10",1,"2",3, "password2");             
                // consumer3 = new consumer (86731, "1", "2", "3", "4", "5","6","7","8","9","10",1,"2",3, "password3");              

        }
        /*
	 * Category set in config/log4j.properties as
	 * log4j.category.com.classexercise=DEBUG, A1
	 */
        static Logger log = Logger.getLogger(employeeManagerTest.class);
    /**
     * Test of Create method, of class consumerManager.
     */
    @Test
    public void test1Create() {
        log.info ("consumerManagerTest - test1Create");
        consumerManager instance = new consumerManager();
        boolean expResult = true;
        boolean result = instance.Create(consumer1);
        assertEquals(expResult, result);   
    }

    /**
     * Test of Get method, of class consumerManager.
     */
    @Test
    public void test2GetA() throws Exception {
        log.info ("consumerManagerTest - test2GetA");
        consumerManager instance = new consumerManager();
        consumer c = instance.GetA(consumer1.getConsumerID());
        assertEquals(c.getConsumerID(), consumer1.getConsumerID());   
    }
    
    /**
     * Test of Update method, of class consumerManager.
     */
    @Test
    public void test3Update() {
         log.info ("consumerManagerTest - test3Update");
        consumerManager instance = new consumerManager();
        boolean expResult = true;
        boolean result = instance.Update(consumer2);  // adimpression2 is a pre-updated adimpression object for adimpression1
        assertEquals(expResult, result);        
    }

    /**
     * Test of Delete method, of class consumerManager.
     */
    @Test
    public void test4Delete() {
        log.info ("consumerManagerTest - test4Delete");
        consumerManager instance = new consumerManager();
        boolean expResult = true;
        boolean result = instance.Delete(consumer1);
        assertEquals(expResult, result);  
    }
    
}
