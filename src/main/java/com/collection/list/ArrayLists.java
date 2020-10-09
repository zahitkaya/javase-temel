package com.collection.list;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {


    public static void main(String[] args) {
        //ArrayList tanımlama
        ArrayList list=new ArrayList();
        ArrayList stringList = new ArrayList<String>();
        ArrayList intList=new ArrayList<Integer>();
        ArrayList doubleList=new ArrayList<Double>();
        ArrayList personList = new ArrayList<Person>();

        //ArrayList içerisine bir şeyler ekleme
        list.add("Hello");

        //Listeden eleman silme
        list.remove(0);

        //Bir elemanı değiştirme ekleme
        list.add(2);
        list.set(0,100);

        //Bütün elemanları silme
        list.clear();

        //Bu listeye 1 den 5 e kadar sayıları ekleyelim
        for (int i=1;i<=5;i++){
            list.add(i);
        }
        //Bu listedeki elemanlara teker teker ulaşıp yazdıralım
        for (Object i:list
             ) {
            System.out.println(i);
        }

        //addPersonda eklediğimiz kişileri yazdırdık.
        addPerson(personList);
    }

    //String listeleri alfabetik/Küçükten büyüğe sıralama
    public static void sortList(ArrayList arrayList){
        Collections.sort(arrayList);
    }

    //Arrayliste class objelerini de ekleyebiliriz.
    public static void addPerson(ArrayList<Person> arrayList){
        Person person=new Person(1,"Ali",22);
        Person person1=new Person(2,"Veli",32);
        arrayList.add(person);
        arrayList.add(person1);
        for (Person p:arrayList) {
            System.out.println(p);
        }
    }









}
