package com.acadgild.androidtesting.login;

/**
 * Created by Pri on 8/31/2017.
 */

public interface LoginView {
    String getUsername();

    void showUsernameError(int resId);

    String getPassword();

    void showPasswordError(int resId);

    void startMainActivity();

    void showLoginError(int resId);
}

