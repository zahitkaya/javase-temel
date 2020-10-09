package com.simple.oop;

public class Parent  {

    private String action;
    public Parent(){

    }
    public Parent(String action){
        this.action=action;
    }

    void printHelloWorld(){
        System.out.println("Hello world");
    }
   //Override childdaki metodu yok sayıp üzerine yazar.
   void sampleMethod(){
       System.out.println("This is a sample metod");
   }

   String getAction(){
        return action;
   }

}
