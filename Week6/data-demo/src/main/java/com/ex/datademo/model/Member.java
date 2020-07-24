package com.ex.datademo.model;

import javax.validation.constraints.*;
import java.util.Date;

public class Member {

    private String lastName = null;
    private String firstName = null;
    private Gender gender = null;
    private String emailAddress = null;
    private Date dateOfBirth = null;

   @NotNull(message="Last name is required")
   @NotBlank(message="Last name cannot be empty")
   @Pattern(regexp="[a-z-A-z]*", message="Last name has invalid characters")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @NotNull(message="email is required")
    @NotBlank(message="email is required")
    @Email(message="email address format is incorrect")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @NotNull
    @Past(message="Date of birth must be in the past")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Min(value=18, message="Age must be greater than or equal to 18")
    @Max(value=150, message="Age must be less than or equal to 150")
    public Integer getAge(){
       if(this.dateOfBirth != null){
           //calculate
       }
       return null;
    }
}
