package org.selenide.AutomatedTests.testfwk.entities;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class UserProfile {
    private String userName;
    private String userEmail;
    private String userPassword;

    public UserProfile(String email, String password){
        userEmail = email;
        userPassword = password;
    }
    public UserProfile(String name, String email, String password){
        userName = name;
        userEmail = email;
        userPassword = password;
    }

    String getName() {
        return userName;
    }

    public String getEmail() {
        return userEmail;
    }

    public void setEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
