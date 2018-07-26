package com.kenzan.employee.business.manager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.canopyaudience.model.business.manager.*;


/**
 * Properties are being passed is using the -D option.
 * This test suite runs all business layer test cases 
 * 
 * @author Jason Canney
 *
 */

@RunWith(Suite.class)
@SuiteClasses({ adImpManagerTest.class, adManagerTest.class, consumerHistoryManagerTest.class,consumerManagerTest.class, couponManagerTest.class,loginManagerTest.class,preferenceManagerTest.class,myadsManagerTest.class})
public class AllBusinessTests {

}
