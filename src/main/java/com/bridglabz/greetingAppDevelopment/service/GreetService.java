package com.bridglabz.greetingAppDevelopment.service;

import com.bridglabz.greetingAppDevelopment.entity.GreetingEntity;
import com.bridglabz.greetingAppDevelopment.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetService {
    //UC2
    public String getGreetingMessage() {
        return "Hello World";
    }

    //UC4
    private final GreetingRepository greetingRepository;

    public GreetService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    //UC_3-
    public String greetingMessage(String firstName, String lastName) {
        //both first name and last name are provided
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName + "!";
        }
        //only first name is provided
        else if (firstName != null) {
            return "Hello, " + firstName + "!";
        }
        //only last name is provided
        else if (lastName != null) {
            return "Hello, " + lastName + "!";
        }
        //return default greeting
        else {
            return "Hello World!";
        }
    }

    //UC_4-save the greeting message in the repository
    //injects UserRepository into this service
    @Autowired
    private GreetingRepository repository;

    //saves a new greeting message to the database
    public GreetingEntity saveMessage(String message) {
        return repository.save(new GreetingEntity(message));
    }

    //UC_6-list all greeting messages
    //retrieves all greeting messages from the database
    public List<GreetingEntity> getAllMessages() {
        return repository.findAll();
    }

    //UC_5- to find a greeting message by ID
    public Optional<GreetingEntity> getMessageById(Long id) {
        return repository.findById(id);
    }


}
