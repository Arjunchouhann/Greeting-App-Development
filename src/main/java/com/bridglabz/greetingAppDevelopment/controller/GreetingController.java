package com.bridglabz.greetingAppDevelopment.controller;

import com.bridglabz.greetingAppDevelopment.entity.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
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

}