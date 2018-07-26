/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenzan.employee.domain;

import junit.framework.TestCase;
import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import org.apache.log4j.Logger;

/**
 *
 * @author jason
 */
public class employeeTest extends TestCase {
    
     private employee employee1, employee2;
     
     Random randomNumbers = new Random();  // object to create for a new random number for the appID
	
        /*
	 * Category set in config/log4j.properties as
	 * log4j.category.com.classexercise=DEBUG, A1
	 */
        static Logger log = Logger.getLogger(employeeTest.class);
        
	/**
	 * @throws java.lang.Exception
	 */
	@Before	
	public void setUp() throws Exception {

        employee1 = new employee (12345, "01", "02", "03","04","05","06","07","08","09","10", 1, "2", 3, "password");    
        employee2 = new employee (12346, "01", "02", "03","04","05","06","07","08","09","10", 1, "2", 3, "password2");
	}
        
    /**
     * Test of equals method, of class advertisement.
     */
    @Test
    public void testEqualsemployee() {
        log.info("starting testEqualsemployee()");
	assertFalse ("employee1 NOT equal employee2", employee1.equals(employee2));
	log.info ("testNOTEqualsemployee PASSED");		
    }
    
}
