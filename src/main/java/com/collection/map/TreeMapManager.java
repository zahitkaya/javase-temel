package com.collection.map;

import java.util.*;

public class TreeMapManager {
    public static void main(String[] args) {
        TreeMap t=new TreeMap();
        t.put("Türkiye","Ankara");
        t.put("Amerika","Washington");
        t.put("Azerbeycan","Bakü");
        t.put("Fransa","Paris");

        Map.Entry key= (Map.Entry) t.entrySet().iterator().next();
        System.out.println(key.getValue());

        //h.put("Türkiye","İstanbul"); // hata verecektir 2 tane aynı key olmaz.

        //HashMapteki değerlere ulaşma
        Set s=t.entrySet(); //HashMApi sete çevirdik.
        Iterator i=s.iterator();
        while (i.hasNext()){
            Map.Entry item=(Map.Entry) i.next(); //Set olan i.nexti tekrar Mape çevirdik.
            System.out.println(item.getKey()+": "+item.getValue());
        }
        //printlerken key alfabetik, numeric sırasına göre çıkartıyor

    }
}
