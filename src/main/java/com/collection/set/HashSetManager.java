package com.collection.set;

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





    }

}
