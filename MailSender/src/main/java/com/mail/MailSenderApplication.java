package com.mail;

import com.mail.bean.EmailSendFromJava;
import com.mail.component.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailSenderApplication {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
		
		
		EmailService email = new EmailService();
		email.sendSimpleMessage();

	}

}
