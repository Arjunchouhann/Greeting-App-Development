package com.bridglabz.greetingAppDevelopment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//this class as a JPA entity
@Entity
public class GreetingEntity {

    //UC_4-
    @Id
    //auto-generates unique ID values
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    //Default Constructor
    public GreetingEntity(){

    }
    //parameterized constructor
    public GreetingEntity(String message) {
        this.message = message;
    }
    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}