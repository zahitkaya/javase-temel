package com.simple.oop.abstraction;

public class Test extends SampleAbstract implements SampleInterface {

    //Interfaceten gelen metod
    @Override
    public void interfaceMethod() {
        System.out.println("Interface metodu");
    }

    //Abstractan gelen metod
    @Override
    public int getId() {
        return super.getId();
    }

}
