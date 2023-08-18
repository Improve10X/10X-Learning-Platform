package com.improve10x.learningplatform.authentication;

public class UserAuth {

    private static UserAuth instance;
    private User user;

    private UserAuth() {
    }

    public static UserAuth getInstance() {
        if (instance == null) {
            instance = new UserAuth();
            instance.getDummyUser();
        }
        return instance;
    }

    public User getCurrentUser() {
        return user;
    }

    private User getDummyUser() {
        instance.user = new User();
        instance.user.setUserId("1234");
        instance.user.setName("MS Dhoni");
        instance.user.setImageUrl("https://cdn.britannica.com/25/222725-050-170F622A/Indian-cricketer-Mahendra-Singh-Dhoni-2011.jpg");
        Address address = new Address();
        address.setCountry("India");
        address.setState("Jharkhand");
        address.setZipCode("99999");
        instance.user.setAddress(address);
        instance.user.setEmail("ms@gmail.com");
        instance.user.setMobileNumber("9959256425");
        return instance.user;
    }
}