package com.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {

        //First in first out

        Queue q=new LinkedList(); //Oluştururken polymorphism yapıyoruz.
        q.add("Detay");
        q.add("Soft");
        q.add("Sivas");
        q.add("İstanbul");
        q.remove("Sivas"); //Sivası kuyruktan atar. true veya false döndürür.
        q.forEach(i-> System.out.println(i));
        System.out.println("--------");

        q.element(); //Kuyruğun başındaki ögeyi verir ve onu kuyruktan atmaz.Kuyruk boşsa hata verir.
        System.out.println(q.element());
        System.out.println("------------");

        q.peek(); //Kuyruğun başındaki ögeyi verir. Kuyruk boşsa null verir.

        q.offer("Ankara"); //Mümkünse verilen ögeyi kuyruğa ekler
        q.forEach(i-> System.out.println(i));

        q.poll(); //Kuyruğun başında ki ögeyi verir ve onu kuyruktan atar. Kuyruk boşsa null verir.
        q.remove();//Kuyruğun başında ki ögeyi verir ve onu kuyruktan atar. Kuyruk boşsa hata verir.

        System.out.println(q.element());








    }
}
