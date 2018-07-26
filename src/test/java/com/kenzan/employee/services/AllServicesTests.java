package com.kenzan.employee.services;

import com.canopyaudience.model.services.adimpression.AdImpressionSvcHibernateImplTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.canopyaudience.model.services.adservice.AdSvcHibernateImplTest;
import com.canopyaudience.model.services.consumerhistoryservice.ConsumerHistorySvcHibernateImplTest;
import com.canopyaudience.model.services.consumerservice.ConsumerSvcHibernateImplTest;
import com.canopyaudience.model.services.couponservice.CouponSvcHibernateImplTest;
import com.canopyaudience.model.services.interestservice.IntSvcHibernateImplTest;
import com.canopyaudience.model.services.loginservice.LoginSvcHibernateImplTest;
import com.canopyaudience.model.services.myads.myAdSvcHibernateImplTest;
import com.canopyaudience.model.services.preferenceservice.PreferenceSvcHibernateImplTest;
/** Test suite runs all service level tests */
@RunWith(Suite.class)
@SuiteClasses({ 
//		SAXPropertyManagerTst.class,
		AdSvcHibernateImplTest.class,
                AdImpressionSvcHibernateImplTest.class,
                ConsumerHistorySvcHibernateImplTest.class,
                ConsumerSvcHibernateImplTest.class,
                CouponSvcHibernateImplTest.class,
                LoginSvcHibernateImplTest.class,
                PreferenceSvcHibernateImplTest.class,
                myAdSvcHibernateImplTest.class,
                IntSvcHibernateImplTest.class
        //      HibernateFactoryTest.class
})
public class AllServicesTests {

}
