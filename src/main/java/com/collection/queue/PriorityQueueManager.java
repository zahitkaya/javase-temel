package com.collection.queue;

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



    }
}
