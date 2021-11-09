package com.example.springboot;

public class Customer {

    private String firstName;
    private String lastName;
    private Date dob;

    public Customer(){
        firstName="Malka";
        lastName="Farkash";
        dob=new Date();
    }

    public String getFirstName(){
        return firstName;
    }

        public String getLastName(){
        return lastName;
    } 

        public String getDob(){
        return dob;
    }                                                                                                     

}