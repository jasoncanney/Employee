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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    
    // Use Case - Get employee by an ID
    @RequestMapping(value = "/{employeeId}", method = RequestMethod.GET, headers = "Accept=application/json", produces = {"application/json"})
    @ResponseBody
    public employee getAemployee(@PathVariable("employeeId") int employeeID) throws EmployeeException, ClassNotFoundException{
    
        employee theEmployee = instance.GetA(employeeID);
        return theEmployee;
    }
    
    /* Use Case - Create new employee
       
    */
    @RequestMapping(value = "/post", method = RequestMethod.POST, headers = "Accept=application/json", produces = {"application/json"}, consumes = {"application/json"})
    @ResponseBody
    public boolean putnewEmployee(@RequestBody employee employee) {
        return instance.Create(employee);
    
    }
    
     /* Use Case - Update existing employee
       
    */
     @RequestMapping(value = "/update", method = RequestMethod.PUT, headers = "Accept=application/json", produces = {"application/json"}, consumes = {"application/json"})
    @ResponseBody
    public boolean updateEmployee(@RequestBody employee employee){
                return instance.Update(employee);
    }
    
     /* Use Case - Delete existing employee
       
    */
    @RequestMapping(value = "/{employeeID}", method = RequestMethod.PUT, headers = "Accept=application/json", produces = {"application/json"}, consumes = {"application/json"})
    @ResponseBody
    public boolean deleteEmployee(@PathVariable("employeeId") int employeeID) throws EmployeeException, ClassNotFoundException{
        employee e = new employee();
        e.setEmployeeID(employeeID);
        return instance.Delete(e);
    }
     /**
     * Use Case - Get all Employees
     */
    @RequestMapping(value = "/listall", method = RequestMethod.GET, headers = "Accept=application/json", produces = {"application/json"})
    @ResponseBody
    public List<employee> getEmployeeList() throws EmployeeException, ClassNotFoundException {
        
        List<employee> employees = instance.Get();
        return employees;    
    } 
}
