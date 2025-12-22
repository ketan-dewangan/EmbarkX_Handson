package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        System.out.println("Hello World");
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
