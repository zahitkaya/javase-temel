package com.collection.set;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHasSetManager {
    public static void main(String[] args) {
        LinkedHashSet l=new LinkedHashSet();

        //LinkedHashset'in hashset'ten farkı ilk eklenenden son eklenene doğru sıralı olmasıdır
        l.add("Ocak");
        l.add("Şubat");
        l.add("Mart");
        l.add("Nisan");
        l.add("Mayıs");
        l.add("Haziran");
        l.add("Temmuz");
        l.add("Ağustos");
        l.add("Eylül");
        l.add("Ekim");
        l.add("Kasım");
        l.add("Aralık");

        l.add("Mayıs"); //Bu eklediğimiz mayıs hiç bir şey değiştirmiyecektir.

        l.forEach(item-> System.out.println(item));



    }
}
