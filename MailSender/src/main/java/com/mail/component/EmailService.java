package com.mail.component;

import com.mail.bean.EmailSendFromJava;


import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;



public class EmailService {
	

    public void sendSimpleMessage() {
        SimpleMailMessage message = new SimpleMailMessage();
        //message.setTo("snvaattendance@gmail.com");
        message.setTo("piyush0746@gmail.com");
        //message.setCc( "pradeep.sharma@snva.com", "vibhuti@snva.com");
        // message.setCc( "shalu@snva.com", "harshit.kumar@sbsind.in");
      
        message.setSubject("Piyush Kumar Logout Time");

        final StringBuffer strEmail = new StringBuffer();
        strEmail.append("Dear Sir, \n" +
                "Logout time 04;00 PM\n" +
                "\n" +
                "Sincerely, \n" +
                "Piyush Kumar ");

        message.setText(String.valueOf(strEmail));
        
        EmailSendFromJava emailsend = new EmailSendFromJava();
        MailSender sender = emailsend.getJavaMailSender();
        
        sender.send(message);
    }
    
    

}
