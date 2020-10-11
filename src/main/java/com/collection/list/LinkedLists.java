package com.collection.list;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        //Array Listlerle büyük ölçüde benzer.
        //Hem List hemde queue'larda ortak bir sınıftır.
        //Kullanımı arraylist le çok benzer
        LinkedList l=new LinkedList();
        for (int i=0;i<100;i++){
            l.add(i);
        }

        l.forEach(item-> System.out.print(item+" "));


    }
}
