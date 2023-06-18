package com.design.patterns.creational.singleton;

//Singleton pattern allows only 1 instance object of the class at any point in the application,
//Meaning, If we create an instance of DB connection object then it has to be just 1 instance to be shared across the application.
public class SingleWithNonThread {

    private static SingleWithNonThread instance;
    private String data;

    SingleWithNonThread(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public static SingleWithNonThread getInstance(String data) {
        if(instance == null ){
            instance = new SingleWithNonThread(data);
        }
        return instance;
    }
}
