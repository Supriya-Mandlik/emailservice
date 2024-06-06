package com.email.service.emailservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@RequestMapping(value = "/sendemail/{productid}" , method = RequestMethod.GET)
	public String sendEmailByProductId(@PathVariable String productid) {
		
		return "email sent to user for Product Id "+productid ;
		
	}

}
