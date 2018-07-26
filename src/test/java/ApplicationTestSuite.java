

import com.canopyaudience.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.canopyaudience.model.business.AllBusinessTests;
import com.canopyaudience.model.domain.AllDomainTests;
import com.canopyaudience.model.services.AllServicesTests;

/** 
 * Runs all test suites in the domain, services and business layers
 * @author JasonCanney
 *
 */
@RunWith(Suite.class)
@SuiteClasses({AllBusinessTests.class, AllServicesTests.class, AllDomainTests.class})
public class ApplicationTestSuite {

}
