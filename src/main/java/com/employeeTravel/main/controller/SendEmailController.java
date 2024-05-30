package com.employeeTravel.main.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeTravel.main.domain.SendEmail;
import com.employeeTravel.main.service.SendEmailServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("sendemailapi")
public class SendEmailController {

	@Autowired
	private SendEmailServiceInterface emailSenderService;

	// Sending a simple Email
	@PostMapping("/sendMail")
	public boolean sendMail(@RequestBody SendEmail sendEmail) {
		boolean result=emailSenderService.sendSimpleMail(sendEmail);
		return result;

	}

}