package com.acadgild.androidtesting.login;

/**
 * Created by Pri on 8/31/2017.
 */

public class LoginService {
    public boolean login(String username, String password) {
        return "james".equals(username) && "bond".equals(password);
    }
}
