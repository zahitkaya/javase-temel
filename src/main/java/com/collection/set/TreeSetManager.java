package com.collection.set;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetManager {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();

        //TreeSette de girdiğimiz değerleri büyüklüğüne,alfabeye göre göre sıralar
        // null değerleri kabul etmez !!

        t.add("Ocak");
        t.add("Şubat");
        t.add("Mart");
        t.add("Nisan");
        t.add("Mayıs");
        t.add("Haziran");
        t.add("Temmuz");
        t.add("Ağustos");
        t.add("Eylül");
        t.add("Ekim");
        t.add("Kasım");
        t.add("Aralık");


        t.forEach(item-> System.out.println(item));

        TreeSet n = new TreeSet<>();
        n=findTwenty();
        System.out.println(n);



    }

    public static TreeSet findTwenty(){
        TreeSet t=new TreeSet<>();
        Random random=new Random();
        int i=0;
        while(true){
            i=random.nextInt(100);
            if (i==20)break;
            t.add(i);
        }
        return t;
    }
}
