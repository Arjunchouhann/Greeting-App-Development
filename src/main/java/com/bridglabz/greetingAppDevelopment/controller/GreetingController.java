package com.bridglabz.greetingAppDevelopment.controller;

import com.bridglabz.greetingAppDevelopment.entity.Greeting;
import com.bridglabz.greetingAppDevelopment.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//Base Path
@RequestMapping("/greeting")
public class GreetingController {

    //Using Get mapping method to greet
    //Get :http://localhost/greeting
    @GetMapping
    public Greeting getGreeting(){
        return new Greeting("Hello : this is get mapping");
    }

    //Using put mapping method to greet
    //Put :http://localhost/greeting
    @PutMapping
    public Greeting putGreeting(){
        return new Greeting("Hello : this is put mapping");
    }

    //Using delete mapping method to greet
    //Delete :http://localhost/greeting
    @DeleteMapping
    public Greeting deleteGreeting(){
        return new Greeting("Hello : this is delete mapping");
    }

    //Using Post mapping method to greet
    //Post :http://localhost/greeting
    @PostMapping
    public Greeting postGreeting(){
        return new Greeting("Hello : this is post mapping");
    }

    //UC_2- to return a simple greeting message
    // curl -X GET http://localhost:8080/greeting/greet
    @Autowired
    //Automatically injects the UserService bean into this controller
    private GreetService greetService;
    //Constructor-based Dependency Injection
    public GreetingController(GreetService greetService) {
        this.greetService = greetService;
    }
    @GetMapping("/greet")
    //Calls the getGreetingMessage method from UserService to get the greeting message
    public String sayHelloGet() {
        return greetService.getGreetingMessage();
    }
}