package com.example.contact_me_portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.contact_me_portfolio.model.email;
import com.example.contact_me_portfolio.service.EmailService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("contact")
public class EmailController {

    @Autowired
    EmailService emailService;
    
    @PutMapping
    public ResponseEntity<?> sendMail(@RequestBody email email){
       emailService.sendMail(email.getName(), email.getEmail(), email.getMessage());
       return ResponseEntity.ok().build();
    }

}
