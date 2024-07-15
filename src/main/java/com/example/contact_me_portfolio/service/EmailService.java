package com.example.contact_me_portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;
    
    public void sendMail(String name , String email , String messgae){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("un451948@gmail.com");
        message.setFrom(email);
        message.setText("Name : "+name+"\n"+"Email : "+email+"\n"+messgae);
        mailSender.send(message);
    }
}
