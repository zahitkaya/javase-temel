package com.java11.changes;

import java.util.Arrays;
import java.util.HashSet;

public class CollectionChanges {
    public static void main(String[] args) {

        //toArray
        HashSet l=new HashSet();
        l.add(1);
        l.add(2);
        l.add(3);
        Object[] array1=l.toArray();
        System.out.println(Arrays.toString(array1)); // [1,2,3]
        System.out.println("------");

        //removeIf
        l.removeIf(a->a.equals(3)); // Lambda kullanarak collectionda gezer. İçerisi true dönerse siler.
        System.out.println(l); //3 ü sildik.
        System.out.println("-----");

        //adAll bir collectiondan diğer collectiona veri kopyalar
        HashSet l1 = new HashSet();
        l1.addAll(l);
        System.out.println(l1);  // 1,2
        System.out.println("------");


    }
}
