/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kenzan.employee.presentation.controller;

import com.canopyaudience.model.business.manager.consumerManager;
import com.canopyaudience.model.domain.consumer;
import com.canopyaudience.model.domain.myads;
import com.canopyaudience.model.services.exception.ConsumerException;
import com.canopyaudience.model.services.exception.myAdsException;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/consumer")
public class EmployeeController {
    
    //create an instance of the consumer business manager object
    consumerManager instance = new consumerManager();

    @GetMapping("/list")
	public String listCustomers(Model theModel) throws ConsumerException, ClassNotFoundException{
		
		// get consumers from the database through the business layer in CDE
		// consumerManager instance = new consumerManager();
                List<consumer> theConsumers = instance.Get();
                
                // add the customers to the model
                theModel.addAttribute("consumers", theConsumers);
		return "consumer_list";
	}
	
    @GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		consumer theConsumer = new consumer();
		
		theModel.addAttribute("consumer", theConsumer);
		
		return "consumer_create";
	}
	
    @PostMapping("/saveConsumer")
	public String saveConsumer(@ModelAttribute("consumer") consumer theConsumer) {
		
		// save the customer using our service
		instance.Create(theConsumer);
		
		return "redirect:/consumer/list";
	}

    @GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("consumerID") int theId, Model theModel) throws ConsumerException, ClassNotFoundException {
		
		// get the customer from our service
		consumer theConsumer = instance.GetA(theId);  //add method in service layer to get a single consumer
 
                // get the customer from our service
		// instance.Update(theConsumer);
                
                // set customer as a model attribute to pre-populate the form
		theModel.addAttribute("consumer", theConsumer);
                
		// send over to our form		
		return "consumer_update";    
        }
        
    @PostMapping("/updateConsumer")
	public String updateConsumer(@ModelAttribute("consumer") consumer theConsumer) {
		
		// update the customer using our service
                instance.Update(theConsumer);		
		
                return "redirect:/consumer/list";
	}
        
    @GetMapping("/delete")
	public String deleteConsumer(@RequestParam("consumerID") int theId) {
		
                consumer c = new consumer();
                c.setConsumerID(theId);
            
		// delete the customer
		instance.Delete(c);  //service layer wants a domain object not just an id
		
		return "redirect:/consumer/list";
	}
        
        
    // REST interfaces for mobile app to create new login and check login for existing users    
        
     /**
    @RequestMapping(value = "/{consumerId}", method = RequestMethod.GET, headers = "Accept=application/json", produces = {"application/json"})
    @ResponseBody
    public List<myads> getUserID(@PathVariable("consumerId") int consumerID) throws myAdsException, ClassNotFoundException{
    
        theAds = instance.GetA(consumerID);
        
        return theAds;
    
    }*/
   
    /**
     * REST Interface to pull a list of all consumers (Not needed to expose to Mobile app)
     * @return
     * @throws ConsumerException
     * @throws ClassNotFoundException 
     */
    @RequestMapping(value = "/listall", method = RequestMethod.GET, headers = "Accept=application/json", produces = {"application/json"})
    @ResponseBody
    public List<consumer> getConsumerList() throws ConsumerException, ClassNotFoundException {
        
        List<consumer> consumers = instance.Get();
        return consumers;    
    }
    
    /* Use Case to put new consumer into Matterhorn
       
    */
    @RequestMapping(value = "/post", method = RequestMethod.POST, headers = "Accept=application/json", produces = {"application/json"}, consumes = {"application/json"})
    @ResponseBody
    public boolean putnewConsumer(@RequestBody consumer consumer) {
        return instance.Create(consumer);
    
    }
    
}
