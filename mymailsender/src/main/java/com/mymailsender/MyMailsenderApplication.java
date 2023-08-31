package com.mymailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MyMailsenderApplication {
	
//	@Autowired
//	private EmailService sendEmail;

	public static void main(String[] args) {
		SpringApplication.run(MyMailsenderApplication.class, args);
		
		
		
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void Sendmail() {
//		
//		sendEmail.send("piyushkrme@gmail.com", "Ecom Website testing Testing", "Hello Piyush \n"+ "This Mail is Fore testing");
//		
//	}
	
	
	
	
	
}
