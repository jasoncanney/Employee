/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenzan.employee.services.employee;

import com.kenzan.employee.domain.employee;
import com.kenzan.employee.services.exception.EmployeeException;
import com.kenzan.employee.services.factory.HibernateFactory;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Jason
 */
// @Repository
public class EmployeeSvcHibernateImpl implements IEmployeeSvc
{
	/*
	* Category set in config/log4j.properties as
	* log4j.category.com.classexercise=DEBUG, A1
	*/
        static Logger log = Logger.getLogger("EmployeeSvcHibernateImpl.class");
	
 /**
  * Set employee data received from GUI and put in database
  * @return boolean
  */
 
  public boolean storeEmployee(employee employee)
        {
          
            boolean status = true;
            log.info("-------------------------------");
            log.info("Using Hibernate Implementation");
            log.info("-------------------------------");
            log.info ("storeEmployee - EmployeeSvcHibernateImpl.java");
            employee appdb  = employee;
            Transaction tx = null;
            Session session = fetchSession();
            log.info ("fetched session");
            
            try 
            {    
                tx = session.beginTransaction();
                log.info ("beginTransaction");
                session.save(appdb);
                log.info ("session.saved");
                log.info("employee saved. Check database for data!");
                tx.commit();
            }
            catch(Exception e)
            {
              if (session.getTransaction() != null) {
                session.getTransaction().rollback();
                log.error (e.getClass() + ": " + e.getMessage(), e);
                }
            }
            finally{
                session.close();                                                 // added this line to fix session closing
            }
            return status;
       }  

    /**
     * Pulls data from database through hibernate interface
     * @return <list> of adimpression
     * @throws java.lang.ClassNotFoundException
     */
    public List<employee> getEmployee() throws EmployeeException, ClassNotFoundException {
        
        {
            log.info("-------------------------------");
            log.info("Using Hibernate Implementation");
            log.info("-------------------------------");
            log.info ("getEmployee - EmployeeSvcHibernateImpl.java");
            Transaction tx = null;
            List<employee> theApplications = null;
            Session session = fetchSession();
            log.info ("fetched session");
            
            try 
            {
                tx = session.beginTransaction();
                log.info ("beginTransaction");
                theApplications = session.createQuery("from employee").getResultList();
                log.info ("session.createQuery passed");
                log.info("employee queried and put into List.");
                tx.commit();
            }
            catch(Exception e)
            {
              if (session.getTransaction() != null) {
                session.getTransaction().rollback();
                log.error (e.getClass() + ": " + e.getMessage(), e);
                }
            }
            finally{
                session.close();                                                 // added this line to fix session closing
            }
            return theApplications;

       }  
    }
   
    /**
     * Pulls data from database through hibernate interface
     * @param id
     * @return employee object
     * @throws java.lang.ClassNotFoundException
     */
    public employee getAEmployee(int id) throws EmployeeException, ClassNotFoundException {
        
        {
            
            int i = id;
            employee c = new employee();
            log.info("-------------------------------");
            log.info("Using Hibernate Implementation");
            log.info("-------------------------------");
            log.info ("getEmployee - EmployeeSvcHibernateImpl.java");
            Transaction tx = null;
            Session session = fetchSession();
            log.info ("fetched session");
            
            try 
            {
                tx = session.beginTransaction();
                log.info ("beginTransaction");
                c = session.get(employee.class, i);
                tx.commit();
            }
            catch(Exception e)
            {
              if (session.getTransaction() != null) {
                session.getTransaction().rollback();
                log.error (e.getClass() + ": " + e.getMessage(), e);
                }
            }
            finally{
                session.close();                                                 // added this line to fix session closing
            }
            return c;              
       }  
    }
  
    /**
  * Updates employeeHistory object received from GUI and put in database
  * @return boolean
  */
  public boolean updateEmployee(employee employee)
        {
          boolean status = true;
            log.info("-------------------------------");
            log.info("Using Hibernate Implementation");
            log.info("-------------------------------");

            log.info ("updateEmployee - EmployeeSvcHibernateImpl.java");
 
            // updateApplication takes in an application object
            // this object includes the updates received and that need to be stored in the db
            employee appdb  = employee;
            // create a new application object.  This is where the current application object gets stored and 
            // will be used to make updates and store back in the db
            employee appnew = null;
            Transaction tx = null;
            Session session = fetchSession();
            log.info ("fetched session");
            
            try 
            {
                tx = session.beginTransaction();
                log.info ("beginTransaction, Getting employee with employeeid:" + appdb.getConsumerID());   
                // retrieve the current application object from the database
                appnew = session.get(employee.class, appdb.getConsumerID());
                // update all fields in the current advertisement object except the PK of employeeID  
                appnew.setConsumerFirstName(appdb.getConsumerFirstName());
                appnew.setConsumerMiddleInitial(appdb.getConsumerMiddleInitial());
                appnew.setConsumerLastName(appdb.getConsumerLastName());
                appnew.setConsumerEmail(appdb.getConsumerEmail());
                appnew.setConsumerPhone(appdb.getConsumerPhone());
                appnew.setConsumerAddress(appdb.getConsumerAddress());
                appnew.setConsumerCity(appdb.getConsumerCity());
                appnew.setConsumerState(appdb.getConsumerState());
                appnew.setConsumerZip(appdb.getConsumerZip());
                appnew.setConsumerSocEmail(appdb.getConsumerSocEmail());
                appnew.setConsumerPWD(appdb.getConsumerPWD());
		System.out.println("Updating employee...");
                // application object is updated in the db based on the Primary Key that was unchanged
                session.update(appnew);
                log.info("employee updated. Check database for data!");
                tx.commit();
            }
            catch(Exception e)
            {
              if (session.getTransaction() != null) {
                session.getTransaction().rollback();
                log.error (e.getClass() + ": " + e.getMessage(), e);
                }
            }
            finally{
                session.close();                                                 // added this line to fix session closing
            }
            return status;
       }  
     /**
     * Deletes data from database through hibernate interface
     * @param employee
     * @return boolean of applications
     */
    public boolean deleteEmployee(employee employee)
        {
            boolean status = true;
            log.info("-------------------------------");
            log.info("Using Hibernate Implementation");
            log.info("-------------------------------");
            log.info ("deleteEmployee - EmployeeSvcHibernateImpl.java");
            employee appdb  = employee;
            Transaction tx = null;
            Session session = fetchSession();
            log.info ("fetched session");
            
            try 
            {
                tx = session.beginTransaction();
                log.info ("beginTransaction");
                session.delete(appdb);
                log.info ("session.delete(employee passed in)");
                log.info("employee deleted. Check database for data not there!");
                tx.commit();
            }
            catch(Exception e)
            {
              if (session.getTransaction() != null) {
                session.getTransaction().rollback();
                log.error (e.getClass() + ": " + e.getMessage(), e);
                }
            }
            finally{
                session.close();                                                 // added this line to fix session closing
            }
            return status;
       }  
    /**
	 * Gets a hibernate session from HibernateFactory
	 * 
	 * @return org.hibernate.Session
	 * 
	 */
	private Session fetchSession()
	{
			log.info ("******Fetching Hibernate Session");

			Session session = HibernateFactory.currentSession();

			return session;
	    
	} //end fetchConnection

   
}// end class AdImpressionSvcHibernateImpl
