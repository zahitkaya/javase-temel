package com.collection.list;

import java.util.Vector;

public class VectorManager {
    public static void main(String[] args) {


        //Vektörlerin size'ı kendi kendine artar.
        Vector v=new Vector(5); //Başlangıç kapasitesini 5 yaptık ve eğer bu kapasitiyi geçersek beşer artıcak.

        System.out.println("Başlangıç kapasitesi: "+v.capacity());
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        v.add("6");
        System.out.println("Bitiş kapasitesi: "+v.capacity());


    }
}
