package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
       // Directly access Database Here
       return "User Details From Database";
    }
}
