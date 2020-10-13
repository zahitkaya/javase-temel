package com.lambda;

import java.util.ArrayList;

public class LambdaManager {

    public interface Calculation{
        int calculate(int x,int y);
    }
    public interface Name {
        void setName (String message);
    }
    public static void main(String[] args) {

        Calculation add=(x,y)->x+y;
        Calculation sub=(x,y)->x-y;
        Calculation mul=(x,y)->x*y;
        Calculation div=(x,y)->x/y;

        System.out.println("5+2= " +add.calculate(5,2));
        System.out.println("5-2= " +sub.calculate(5,2));
        System.out.println("5*2= " +mul.calculate(5,2));
        System.out.println("5/2= " +div.calculate(5,2));

        System.out.println("---------");

        Name name = message -> System.out.println("Hoşgeldiniz " + message+" Bey");
        name.setName("feyzi");
        System.out.println("---------");

        ArrayList list = new ArrayList<String>();
        list.add("Metin");
        list.add("Ali");
        list.add("Feyyaz");

        list.forEach(i-> {
            if(i.equals("Metin")){
                System.out.println(i+" Ortaladı");}
            else if(i.equals("Ali")){
                System.out.println(i+" Çevirdi");
            }
            else System.out.println(i + " Vurdu Goll");
        });
        System.out.println("----------");

    }
}
