package com.collection.map;


import com.collection.Person;

import java.util.*;

public class HashMapManager {
    public static void main(String[] args) {
        HashMap h=new HashMap();
        h.put("Türkiye","Ankara");
        h.put("Amerika","Washington");
        h.put("Azerbeycan","Bakü");
        //h.put("Türkiye","İstanbul"); // hata verecektir 2 tane key aynı key olmaz.

        //HashMapteki değerlere ulaşma
        Set s=h.entrySet(); //HashMApi sete çevirdik.
        Iterator i=s.iterator();
        while (i.hasNext()){
            Map.Entry item=(Map.Entry) i.next(); //Set olan i.nexti tekrar Mape çevirdik.
            System.out.println(item.getKey()+": "+item.getValue());
        }
        System.out.println("---------");
        //printlerken dağınık printliyor.
        hashMapDefining();
        System.out.println("---------");
        personMap();
        System.out.println("---------");



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

    public static void personMap(){
        //Kişileri oluşturuyoruz
        Person person1=new Person(1,"Mehmet",15);
        Person person2=new Person(2,"Ali",17);
        Person person3=new Person(3,"Metin",19);
        Person person4=new Person(4,"Feyyaz",21);

        //Oluşturduğumuz kişileri HashMapin içerisine atıyoruz
        HashMap<String,Person> mapPerson = new HashMap<>();
        mapPerson.put(person1.getName(),person1);
        mapPerson.put(person2.getName(),person2);
        mapPerson.put(person3.getName(),person3);
        mapPerson.put(person4.getName(),person4);

        //Printliyoruz
        for(String key:mapPerson.keySet()){
            System.out.println(key+" : "+mapPerson.get(key));
        }

    }

}
