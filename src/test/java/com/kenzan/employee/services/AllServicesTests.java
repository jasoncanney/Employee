package com.kenzan.employee.services;

import com.kenzan.employee.services.employee.EmployeeSvcHibernateImplTest;
import com.kenzan.employee.services.factory.HibernateFactoryTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/** Test suite runs all service level tests */
@RunWith(Suite.class)
@SuiteClasses({ 
//		SAXPropertyManagerTst.class,
                EmployeeSvcHibernateImplTest.class,
                HibernateFactoryTest.class
})
public class AllServicesTests {

}
