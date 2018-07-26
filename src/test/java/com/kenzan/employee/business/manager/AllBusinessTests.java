package com.kenzan.employee.business.manager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Properties are being passed is using the -D option.
 * This test suite runs all business layer test cases 
 * 
 * @author Jason Canney
 *
 */

@RunWith(Suite.class)
@SuiteClasses({ employeeManagerTest.class})
public class AllBusinessTests {

}
