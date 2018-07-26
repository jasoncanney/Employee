/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenzan.employee.services.factory;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JasonCanney
 */
public class HibernateFactoryTest {
    
    public HibernateFactoryTest() {
    }
   
        /*
	 * Category set in config/log4j.properties as
	 * log4j.category.com.classexercise=DEBUG, A1
	 */
        static Logger log = Logger.getLogger(HibernateFactoryTest.class);


    /**
     * Test of currentSession method, of class HibernateFactory.
     */
    @Test
    public void testCurrentSession() {
        log.info("HibernateFactory testCurrentSession");
        Session expResult = null;
        Session result = HibernateFactory.currentSession();
        
        assertNotSame(expResult, result);
    }

    /**
     * Test of closeSession method, of class HibernateFactory.
     */
    @Test
    public void testCloseSession() {
        log.info("HibernateFactory testCloseSession");
        HibernateFactory.closeSession();
    }
}
