package com.improve10x.learningplatform.authentication;

public class UserAuth {

    private static UserAuth instance;

    private UserAuth() {
    }

    public static UserAuth getInstance() {
        if (instance == null) {
            instance = new UserAuth();
        }
        return instance;
    }
}