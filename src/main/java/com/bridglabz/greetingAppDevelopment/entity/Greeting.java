package com.bridglabz.greetingAppDevelopment.entity;

//Greeting class
public class
Greeting {
    private String message;

    //Constructor
    public Greeting(String message) {
        this.message = message;
    }
    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        this.message = message;
    }
}