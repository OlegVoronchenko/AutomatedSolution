package org.selenide.AutomatedTests.Entities;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class UserLogin {
    private String userName;
    private String userLogin;
    private String userPassword;

    public UserLogin(String name, String login, String password){
        userName = name;
        userLogin = login;
        userPassword = password;
    }

    String getUserName(){
        return userName;
    }
}
