package com.collection.set;

import com.collection.Person;
import java.util.concurrent.PriorityBlockingQueue;


import java.util.*;

public class HashSetManager {
    public static void main(String[] args) {



        //HashSet oluşturma
        HashSet h=new HashSet<String>();

        //HashSete veri ekleme
        h.add("Detay");
        h.add(7);
        h.add("7");
        h.add(7.0);
        h.add(7); //Integer olan ikinci 7 eklenmiyor.
        h.add(true);
        h.add(null); //null değerler başta yazılıyor.



        //HashSetin içindekilere ulaşma
        Iterator iterator = h.iterator(); // burda ki iterator hash setin içerisinde gezinecek
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Böyle de hashSeti basabiliriz.
        // h.forEach(item-> System.out.println(item));

        sampleCodes(h);



    }

    public static void sampleCodes(HashSet hashSet){
        hashSet.size(); //Boyutunu verir
        hashSet.isEmpty(); //Boş olup olmadığını kontrol eder.
        hashSet.contains("Detay"); //İçerisinde Detay Stringi var mı diye bakar

        ArrayList list=new ArrayList();
        hashSet.addAll(list);//Listenin tamamını hashsete ekledik
        hashSet.containsAll(list); // list, hashSetin içerisinde mi kontrol ettik

        Integer arr[]={1,2,3,4,5};
        HashSet secondHashSet = new HashSet<>(Arrays.asList(arr)); // secondHashSetin içerisine default olarak arr'i koyduk
        System.out.println(secondHashSet);


        HashSet l=new HashSet();
        l.retainAll(l);

        HashSet bag=new HashSet<String>();
        HashSet books=new HashSet<String>();
        bag.addAll(books);

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


        Object []sampleArray=l.toArray();
        System.out.println(Arrays.toString(sampleArray));

        System.out.println();
        System.out.println(l);

        Set<Person> personSet=new HashSet();
        Person person1=new Person(1,"Emre",22);
        Person person2=new Person(1,"Emre",22);
        personSet.add(person1);
        personSet.add(person2);
        System.out.println(personSet);






    }


}
