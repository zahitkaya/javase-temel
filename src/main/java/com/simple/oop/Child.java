package com.simple.oop;

public class Child extends Parent {

    public Child(){

    }
    public Child(String action){
        super(action);
    }

    @Override
    void sampleMethod() {
        System.out.println("This method overrided");
    }

    @Override
    String getAction() {
        return "İlk çocuk " +super.getAction();
    }
}
