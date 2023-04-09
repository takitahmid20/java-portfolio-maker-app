/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.portfoliomakerapp;

/**
 *
 * @author marzi
 */
public class profileData {
    private String firstname;
    private String lastname;
    private String emailaddress;
    private String password;
    private String cpassword;
    
    profileData(String firstname, String lastname, String emailaddress, String password, String cpassword){
        this.firstaname = firstname;
        this.lastname = lastname;
        this.emailaddress = emailaddress;
        this.password = password;
        this.cpassword = cpassword;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getEmailaddress() {
        return emailaddress;
    }
    public String getPassword() {
        return password;
    }
    public String getCpassword() {
        return cpassword;
    }
}
