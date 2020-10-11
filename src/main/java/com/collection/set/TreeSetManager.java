package com.collection.set;

import java.util.TreeSet;

public class TreeSetManager {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();

        //TreeSette de girdiğimiz değerleri büyüklüğüne,alfabeye göre göre sıralar
        // null değerleri kabul etmez !!

        t.add(100);
        t.add(2);
        t.add(50);

        t.forEach(item-> System.out.println(item));

    }
}
