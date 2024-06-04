package com.Email.ConfiqEmaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ConfiqEmaildemoApplication {
@Autowired
private EmailSenderService senderService;
	public static void main(String[] args) {
		SpringApplication.run(ConfiqEmaildemoApplication.class, args);
		
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderService.sendEmail("pranjalhande08@gmail.com","What u say!!","This is not a white labelError batch or I'm not a white label error student.Did you understand.You better Understand");
	}

}
