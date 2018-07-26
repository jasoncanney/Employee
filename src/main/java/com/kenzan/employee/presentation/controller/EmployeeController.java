/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenzan.employee.presentation.controller;

import com.kenzan.employee.business.manager.employeeManager;
import com.kenzan.employee.domain.employee;
import com.kenzan.employee.services.exception.EmployeeException;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Jason
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    
    //create an instance of the employee business manager object
    employeeManager instance = new employeeManager();

    @GetMapping("/list")
	public String listCustomers(Model theModel) throws EmployeeException, ClassNotFoundException{
		
		// get employees from the database through the business layer in CDE
		// employeeManager instance = new employeeManager();
                List<employee> theEmployees = instance.Get();
                
                // add the customers to the model
                theModel.addAttribute("employees", theEmployees);
		return "employee_list";
	}
	
    @GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		employee theEmployee = new employee();
		
		theModel.addAttribute("employee", theEmployee);
		
		return "employee_create";
	}
	
    @PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") employee theEmployee) {
		
		// save the customer using our service
		instance.Create(theEmployee);
		
		return "redirect:/employee/list";
	}

    @GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeID") int theId, Model theModel) throws EmployeeException, ClassNotFoundException {
		
		// get the customer from our service
		employee theEmployee = instance.GetA(theId);  //add method in service layer to get a single employee
 
                // get the customer from our service
		// instance.Update(theEmployee);
                
                // set customer as a model attribute to pre-populate the form
		theModel.addAttribute("employee", theEmployee);
                
		// send over to our form		
		return "employee_update";    
        }
        
    @PostMapping("/updateEmployee")
	public String updateEmployee(@ModelAttribute("employee") employee theEmployee) {
		
		// update the customer using our service
                instance.Update(theEmployee);		
		
                return "redirect:/employee/list";
	}
        
    @GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeID") int theId) {
		
                employee c = new employee();
                c.setConsumerID(theId);
            
		// delete the customer
		instance.Delete(c);  //service layer wants a domain object not just an id
		
		return "redirect:/employee/list";
	}
        
        
    // REST interfaces for mobile app to create new login and check login for existing users    
        
     /**
    @RequestMapping(value = "/{employeeId}", method = RequestMethod.GET, headers = "Accept=application/json", produces = {"application/json"})
    @ResponseBody
    public List<myads> getUserID(@PathVariable("employeeId") int employeeID) throws myAdsException, ClassNotFoundException{
    
        theAds = instance.GetA(employeeID);
        
        return theAds;
    
    }*/
   
    /**
     * REST Interface to pull a list of all employees (Not needed to expose to Mobile app)
     * @return
     * @throws EmployeeException
     * @throws ClassNotFoundException 
     */
    @RequestMapping(value = "/listall", method = RequestMethod.GET, headers = "Accept=application/json", produces = {"application/json"})
    @ResponseBody
    public List<employee> getEmployeeList() throws EmployeeException, ClassNotFoundException {
        
        List<employee> employees = instance.Get();
        return employees;    
    }
    
    /* Use Case to put new employee into Matterhorn
       
    */
    @RequestMapping(value = "/post", method = RequestMethod.POST, headers = "Accept=application/json", produces = {"application/json"}, consumes = {"application/json"})
    @ResponseBody
    public boolean putnewEmployee(@RequestBody employee employee) {
        return instance.Create(employee);
    
    }
    
}
