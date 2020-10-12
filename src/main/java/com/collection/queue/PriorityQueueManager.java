package com.collection.queue;

import com.collection.Person;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueManager {
    public static void main(String[] args) {

        //Shortes Job First
        Queue<Integer> q=new PriorityQueue();

        q.add(5);
        q.add(2);
        q.add(25);
        q.add(10);
        q.add(1);

        //PriortyQueue da yerleştirme sırasının bir önemi yoktur.
        System.out.println("Başlangıçtaki sıra: "+q);

        q.remove();
        System.out.println("Removedan sonra: "+q);

        q.poll();
        System.out.println("Pooldan sonra"+q);

        personQueue();



    }
    public static void personQueue(){
        Person person1=new Person(1,"Mehmet",5);
        Person person2=new Person(2,"Mehmet",6);
        Person person3=new Person(3,"Mehmet",7);
        Person person4=new Person(4,"Mehmet",8);

        Queue<Person> people=new PriorityQueue<Person>();


    }
}
