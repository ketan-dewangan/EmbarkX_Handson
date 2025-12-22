package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        System.out.println("Hello World");
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWitWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWitWS.getUserInfo());

        UserDataProvider newDBProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDBase = new UserManager(newDBProvider);
        System.out.println(userManagerWithNewDBase.getUserInfo());
    }
}
