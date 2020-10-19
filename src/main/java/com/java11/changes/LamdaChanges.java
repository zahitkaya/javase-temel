package com.java11.changes;

public class LamdaChanges {

    interface Name{
        String setName(String s1,String s2);


    }
    public static void main(String[] args) {

        Name getName=(var s1, var s2) -> s1 +" "+s2;
        System.out.println(getName.setName("Zahit","Kaya"));
    }
}
