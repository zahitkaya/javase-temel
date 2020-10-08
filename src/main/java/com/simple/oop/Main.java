package com.simple.oop;

import com.simple.oop.abstraction.SampleInterface;
import com.simple.oop.abstraction.Test;

public class Main {

    public static void main(String[] args) {

        //Constructor,getter setter metodları
        FootballPlayer footballPlayer = new FootballPlayer("Jose Sosa", "Fenerbahçe", 75.5, 183);
        System.out.println(footballPlayer.getTeamName());
        footballPlayer.setName("Diego Perotti");
        System.out.println(footballPlayer.getName());


        //Kalıtım(Inheritince). Sadece parentı kullanarak Childdaki metoda ulaştık..
        Parent parent=new Parent();
        parent.printHelloWorld();
        //Override
        parent.sampleMethod();

        //Polymorphism
        Child child=new Child();
        child.sampleMethod();

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
