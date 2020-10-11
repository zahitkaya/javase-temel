package com.collection.map;


import java.util.*;

public class HashMapManager {
    public static void main(String[] args) {
        HashMap h=new HashMap();
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
        //printlerken dağınık printliyor.
        hashMapDefining();
    }


    public static void hashMapDefining(){
        //Generic
        HashMap<Integer, String> hashMap = new HashMap<>(); //Key-valuesini ayrı ayrı tanımlayabiliriz
        HashMap<String, Integer> hashMap1 = new HashMap<>();

        //Generic hashmaplari yazdırma
        hashMap.put(1,"Adana");
        hashMap.put(34,"İstanbul");
        hashMap.put(58,"Sivas");

        //Key türü bilinen bir hashmape foreach uygulayabiliriz.
        for (Integer key:hashMap.keySet()) {
            System.out.println("Key: "+key+" value "+hashMap.get(key));
        }

    }
}
