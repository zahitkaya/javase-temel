package com.simple.oop;

import com.simple.oop.abstraction.SampleInterface;
import com.simple.oop.abstraction.Test;

public class Main {

    public static void main(String[] args) {

        String abc = new String("Hello World");
        String xyz = new String("Hello World");

        if(abc == xyz)
            System.out.println("Refers to same string");
        else
            System.out.println("Refers to different strings");


        if(abc.equals(xyz)){
            System.out.println("Contents of both strings are same");
            }
        else{
            System.out.println("Contents of strings are different");}

        //Constructor,getter setter metodları
        FootballPlayer footballPlayer = new FootballPlayer("Jose Sosa", "Fenerbahçe", 75.5, 183);
        System.out.println(footballPlayer.getTeamName());
        footballPlayer.setName("Diego Perotti");
        System.out.println(footballPlayer.getName());
        System.out.println(footballPlayer+" fb");


        //Kalıtım(Inheritince). Sadece parentı kullanarak Childdaki metoda ulaştık..
        Child child=new Child();
        child.printHelloWorld();
        //Override
        child.sampleMethod();

        //Polymorphosim
        Parent firstChild=new Child("Gülüyor");
        Parent secondChild=new SecondChild("Ağlıyor");
        System.out.println(firstChild.getAction());
        System.out.println(secondChild.getAction());


        //toString bir String classı metodudur. String dışındaki değişkenleri Stringe çevirir.
        int number=5;
        System.out.println(Integer.toString(number)+2); // 52 döndürüyor. number değişkenini string gördü.

        //Abstract metodlarda kalıtım sağlanır.
        Test test=new Test();
        test.abstractMethod();
        //Interfacete tanımladığımız değişkene de ulaşabiliriz. Kullanımı static'e benziyor.
        System.out.println(SampleInterface.interfaceVariable);





    }
    //Overloading metotlarda da yapılabilir
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

}
