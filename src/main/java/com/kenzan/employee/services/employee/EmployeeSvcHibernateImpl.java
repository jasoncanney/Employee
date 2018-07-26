/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenzan.employee.services.employee;

import com.canopyaudience.model.domain.consumer;
import com.canopyaudience.model.services.exception.ConsumerException;
import com.canopyaudience.model.services.factory.HibernateFactory;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Jason
 */
// @Repository
public class EmployeeSvcHibernateImpl implements IConsumerSvc
{
	/*
	* Category set in config/log4j.properties as
	* log4j.category.com.classexercise=DEBUG, A1
	*/
        static Logger log = Logger.getLogger("ConsumerSvcHibernateImpl.class");
	
 /**
  * Set adimpression data received from GUI and put in database
  * @return boolean
  */
 
        @Override
  public boolean storeConsumer(consumer consumer)
        {
          
            boolean status = true;
            log.info("-------------------------------");
            log.info("Using Hibernate Implementation");
            log.info("-------------------------------");
            log.info ("storeConsumer - ConsumerSvcHibernateImpl.java");
            consumer appdb  = consumer;
            Transaction tx = null;
            Session session = fetchSession();
            log.info ("fetched session");
            
            try 
            {    
                tx = session.beginTransaction();
                log.info ("beginTransaction");
                session.save(appdb);
                log.info ("session.saved");
                log.info("consumer saved. Check database for data!");
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
     @Override
    public List<consumer> getConsumer() throws ConsumerException, ClassNotFoundException {
        
        {
            log.info("-------------------------------");
            log.info("Using Hibernate Implementation");
            log.info("-------------------------------");
            log.info ("getConsumer - ConsumerSvcHibernateImpl.java");
            Transaction tx = null;
            List<consumer> theApplications = null;
            Session session = fetchSession();
            log.info ("fetched session");
            
            try 
            {
                tx = session.beginTransaction();
                log.info ("beginTransaction");
                theApplications = session.createQuery("from consumer").getResultList();
                log.info ("session.createQuery passed");
                log.info("consumer queried and put into List.");
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
     * @return consumer object
     * @throws java.lang.ClassNotFoundException
     */
    public consumer getAConsumer(int id) throws ConsumerException, ClassNotFoundException {
        
        {
            
            int i = id;
            consumer c = new consumer();
            log.info("-------------------------------");
            log.info("Using Hibernate Implementation");
            log.info("-------------------------------");
            log.info ("getConsumer - ConsumerSvcHibernateImpl.java");
            Transaction tx = null;
            Session session = fetchSession();
            log.info ("fetched session");
            
            try 
            {
                tx = session.beginTransaction();
                log.info ("beginTransaction");
                c = session.get(consumer.class, i);
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
  * Updates consumerHistory object received from GUI and put in database
  * @return boolean
  */
  @Override
  public boolean updateConsumer(consumer consumer)
        {
          boolean status = true;
            log.info("-------------------------------");
            log.info("Using Hibernate Implementation");
            log.info("-------------------------------");

            log.info ("updateConsumer - ConsumerSvcHibernateImpl.java");
 
            // updateApplication takes in an application object
            // this object includes the updates received and that need to be stored in the db
            consumer appdb  = consumer;
            // create a new application object.  This is where the current application object gets stored and 
            // will be used to make updates and store back in the db
            consumer appnew = null;
            Transaction tx = null;
            Session session = fetchSession();
            log.info ("fetched session");
            
            try 
            {
                tx = session.beginTransaction();
                log.info ("beginTransaction, Getting consumer with consumerid:" + appdb.getConsumerID());   
                // retrieve the current application object from the database
                appnew = session.get(consumer.class, appdb.getConsumerID());
                // update all fields in the current advertisement object except the PK of consumerID  
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
		System.out.println("Updating consumer...");
                // application object is updated in the db based on the Primary Key that was unchanged
                session.update(appnew);
                log.info("consumer updated. Check database for data!");
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
     * @param consumer
     * @return boolean of applications
     */
    @Override
    public boolean deleteConsumer(consumer consumer)
        {
            boolean status = true;
            log.info("-------------------------------");
            log.info("Using Hibernate Implementation");
            log.info("-------------------------------");
            log.info ("deleteConsumer - ConsumerSvcHibernateImpl.java");
            consumer appdb  = consumer;
            Transaction tx = null;
            Session session = fetchSession();
            log.info ("fetched session");
            
            try 
            {
                tx = session.beginTransaction();
                log.info ("beginTransaction");
                session.delete(appdb);
                log.info ("session.delete(consumer passed in)");
                log.info("consumer deleted. Check database for data not there!");
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
