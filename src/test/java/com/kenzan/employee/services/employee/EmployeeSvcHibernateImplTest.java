/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenzan.employee.services.employee;

import com.canopyaudience.model.domain.consumer;
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

    consumer consumer1;
    consumer consumer2;
    consumer consumer3;

    @Before	
	protected void setUp() throws Exception {
		
		super.setUp();
                // Factory factory = Factory.getInstance();
		consumer1 = new consumer (86730, "1", "2", "3", "4", "5","6","7","8","9","10",1,"2",3, "password1");                
                consumer2 = new consumer (86730, "1", "2", "3", "4", "5","6","7","8","9","10",1,"2",3, "password2");             
                consumer3 = new consumer (86731, "1", "2", "3", "4", "5","6","7","8","9","10",1,"2",3, "password3");           

        }
        /*
	 * Category set in config/log4j.properties as
	 * log4j.category.com.classexercise=DEBUG, A1
	 */
        static Logger log = Logger.getLogger(EmployeeSvcHibernateImplTest.class);
    
    
    
    /**
     * Test of storeConsumer method, of class ConsumerSvcHibernateImpl.
     */
    @Test
    public void test1StoreConsumer() {
        log.info ("ConsumerSvcHibernateImplTest - test1StoreConsumer");
        ConsumerSvcHibernateImpl instance = new ConsumerSvcHibernateImpl();
        boolean expResult = true;
        boolean result = instance.storeConsumer(consumer1);
        assertEquals(expResult, result);   
    }

    /**
     * Test of getaConsumer method, of class ConsumerSvcHibernateImpl.
     *//*
    @Test
    public void test2GetAConsumer() throws ConsumerException, ClassNotFoundException {
        log.info ("ConsumerSvcHibernateImplTest - test2GetAConsumer");
        ConsumerSvcHibernateImpl instance = new ConsumerSvcHibernateImpl();
        boolean expResult = true;
        consumer c = new consumer();
        c = instance.getAConsumer(consumer1.getConsumerID());
        assertEquals(consumer1.getConsumerID(), c.getConsumerID());   
    } */
    /**
     * Test of updateConsumer method, of class ConsumerSvcHibernateImpl.
     */
    @Test
    public void test3UpdateConsumer() {
          log.info ("ConsumerSvcHibernateImplTest - test3UpdateConsumer");
        ConsumerSvcHibernateImpl instance = new ConsumerSvcHibernateImpl();
        boolean expResult = true;
        boolean result = instance.updateConsumer(consumer2);  // adimpression2 is a pre-updated adimpression object for adimpression1
        assertEquals(expResult, result);    
    }

    /**
     * Test of deleteConsumer method, of class ConsumerSvcHibernateImpl.
     */
    @Test
    public void test4DeleteConsumer() {
        log.info ("ConsumerSvcHibernateImplTest - test4DeleteConsumer");
        ConsumerSvcHibernateImpl instance = new ConsumerSvcHibernateImpl();
        boolean expResult = true;
        boolean result = instance.deleteConsumer(consumer1);
        assertEquals(expResult, result); 
    }
    
}
