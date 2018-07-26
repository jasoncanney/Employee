package com.kenzan.employee.services.employee;

import com.kenzan.employee.domain.employee;
import com.kenzan.employee.services.IService;
import com.kenzan.employee.services.exception.EmployeeException;
import java.util.List;

/** 
 This interface defines methods for persisting of employee.java
 to and from a file system
 @author Jason L. Canney
  
*/
public interface IEmployeeSvc extends IService
{

	/** 
	 Persists a employee
	 The storeEmployee takes in a employee object as input and will pass it to the EmployeeSvcImpl 
	 @param employee The application to be persisted 
	 @return  void 
	 @exception EmployeeException  
	*/

	public boolean storeEmployee(employee employee);
        
	/** 
	 Retrieves a single employee
	 The getEmployee takes an ID as an argument and retrieves it through the EmployeeSvcImpl class 
	 @return  The collection 
	 @exception EmployeeException 
	 @exception ClassNotFoundException  
	*/

	public List<employee> getEmployee() throws EmployeeException, ClassNotFoundException;

	/**
         * Pulls data from database through hibernate interface
         * @param id
         * @return employee object
         * @throws java.lang.ClassNotFoundException
         */
        public employee getAEmployee(int id) throws EmployeeException, ClassNotFoundException;
       
        /** 
	 Updates a employee
	 The updateEmployee takes in a employee object as input and will pass it to the EmployeeSvcImpl 
	 @param employee The employee to be updated
	 @return  void 
	 @exception EmployeeException  
	*/


	public boolean updateEmployee(employee employee);

	/** 
	 delete a employee
	 The deleteEmployee takes in a employee object as input and will pass it to the EmployeeSvcImpl 
	 @param employee The employee to be updated
	 @return  void 
	 @exception EmployeeException  
	*/

	public boolean deleteEmployee(employee employee);

}