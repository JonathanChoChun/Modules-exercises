package com.techelevator.validation.model;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigInteger;
import java.time.LocalDate;

public class Registration {

    @NotBlank(message = "First name is required")
    @Size(max=20, message="Name cannot be over 20 characters")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    @Size(max=20, message="Name cannot be over 20 characters")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message="Please enter a valid email address")
    private String email;


    private String confirmEmail;

    @NotBlank(message = "Password is required")
    @Size(min=8, message="Password minimum length 8 characters")
    private String password;

    private String confirmPassword;

    @NotNull(message = "Birthday is required")
//    @Past(message="Enter a valid birthday")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate birthday;

    @NotNull(message = "Number of tickets is required")
    @Min(value = 1, message = "Must be at least 1")
    @Max(value = 10, message = "Must not be more than 10")
    private Integer numberOfTickets;


    @AssertTrue(message = "Passwords need to match")
    public boolean isPasswordMatching(){
        if(password!=null){
            return (password.equals(confirmPassword));
        }
        return false;
    }

    @AssertTrue(message = "Emails need to match")
    public boolean isEmailMatching(){
        if(email!=null){
            return (email.equals(confirmEmail));
        }
        return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }







}
