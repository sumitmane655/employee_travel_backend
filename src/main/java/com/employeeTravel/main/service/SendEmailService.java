package com.employeeTravel.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.employeeTravel.main.domain.SendEmail;

@Service
public class SendEmailService implements SendEmailServiceInterface {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String sender;

	public boolean sendSimpleMail(SendEmail sendEmail) {

		// Try block to check for exceptions
		try {

			// Creating a simple mail message
			SimpleMailMessage mailMessage = new SimpleMailMessage();

			// Setting up necessary details
			mailMessage.setFrom(sender);
			mailMessage.setTo(sendEmail.getRecipient());
			mailMessage.setText(sendEmail.getBody());
			mailMessage.setSubject(sendEmail.getSubject());

			// Sending the mail
			javaMailSender.send(mailMessage);
			return true;
		}

		// Catch block to handle the exceptions
		catch (Exception e) {
			return false;
		}
	}
	
}



