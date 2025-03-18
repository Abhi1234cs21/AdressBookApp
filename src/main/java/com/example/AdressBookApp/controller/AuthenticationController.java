package com.example.AdressBookApp.controller;

import com.example.AdressBookApp.dto.AuthUserDTO;
import com.example.AdressBookApp.service.AuthenticationService;
import com.example.AdressBookApp.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.AdressBookApp.dto.LoginDTO;
import com.example.AdressBookApp.dto.MailDTO;

@RestController
public class AuthenticationController {
    EmailService emailService;
    AuthenticationService authenticationService;

    public AuthenticationController(EmailService emailService, AuthenticationService authenticationService) {
        this.emailService = emailService;
        this.authenticationService = authenticationService;
    }

    //============================UC9(Register and Login for a User)
    @PostMapping(path = "/register")
    public String register(@RequestBody AuthUserDTO user){
        return authenticationService.register(user);
    }

    @PostMapping(path ="/login")
    public String login(@RequestBody LoginDTO user){
        return authenticationService.login(user);
    }

    //==============================Sendmail======================//
    @PostMapping(path="/sendMail")
    public String sendMail(@RequestBody MailDTO user){ emailService.sendEmail(user.getTo(), user.getSubject(), user.getBody());
        return "Mail Sent";
    }




}