package com.mymailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sendMailController {
	
	@Autowired
	private EmailService sendEmail;
	
	
	
	@GetMapping("/sendmail")
	public String sendMail() {
		
		sendEmail.send("piyushkrme@gmail.com", "Ecom Website testing Testing", "Hello Piyush \n"+ "This Mail is Fore testing");
		
		return "mail sent successuflly";
	}

}
