package com.tight.coupling;

public class UserDatabase {
    public String getUserDetails() {
       // Directly access Database Here
       return "User Details From Database";
    }
}
