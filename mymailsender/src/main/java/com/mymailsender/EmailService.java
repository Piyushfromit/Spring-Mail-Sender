package com.mymailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender sender;
	
	public void send(String toEmailAdd, String subject,String body) {
		
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setFrom("piyushfrommasai@gmail.com");
		smm.setTo(toEmailAdd);
		smm.setSubject(subject); 
		smm.setText(body);
		
		sender.send(smm);
		
		System.out.println("Mail successfully Seded");
		
	}

	
	
	
	
}
