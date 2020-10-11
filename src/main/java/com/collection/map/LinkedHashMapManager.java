package com.collection.map;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.*;

public class LinkedHashMapManager {

    public static void main(String[] args) {


        LinkedHashMap h=new LinkedHashMap();
        h.put("Türkiye","Ankara");
        h.put("Amerika","Washington");
        h.put("Azerbeycan","Bakü");
        //h.put("Türkiye","İstanbul"); // hata verecektir 2 tane aynı key olmaz.

        //HashMapteki değerlere ulaşma
        Set s=h.entrySet(); //HashMApi sete çevirdik.
        Iterator i=s.iterator();
        while (i.hasNext()){
            Map.Entry item=(Map.Entry) i.next(); //Set olan i.nexti tekrar Mape çevirdik.
            System.out.println(item.getKey()+": "+item.getValue());
        }
        //printlerken yazdığımız sıraya göre

    }
}
