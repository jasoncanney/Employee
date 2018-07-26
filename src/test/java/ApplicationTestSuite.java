
import com.kenzan.employee.business.manager.AllBusinessTests;
import com.kenzan.employee.domain.AllDomainTests;
import com.kenzan.employee.services.AllServicesTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/** 
 * Runs all test suites in the domain, services and business layers
 * @author JasonCanney
 *
 */
@RunWith(Suite.class)
@SuiteClasses({AllBusinessTests.class, AllServicesTests.class, AllDomainTests.class})
public class ApplicationTestSuite {

}
