package com.bridglabz.greetingAppDevelopment.service;

import org.springframework.stereotype.Service;

@Service
public class GreetService {
    //UC2
    public String getGreetingMessage(){
        return "Hello World";
    }
}
