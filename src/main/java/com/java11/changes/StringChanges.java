package com.java11.changes;

import java.util.ArrayList;
import java.util.List;

public class StringChanges {
    public static void main(String[] args) {
        String name="Detay Teknoloji";
        String empty="";
        String irregular="       TEXT        TEXT ";

        //repeat: Bir stringi içerisine yazılan index kadar tekrarlar
        System.out.println(name.repeat(3));
        System.out.println("-----");

        //isBlank: Bir stringin boş olup olmadığına bakar
        System.out.println(name.isBlank());
        System.out.println(empty.isBlank());
        System.out.println("------");

        //strip bir stringin başındaki ve sonundaki boşlukları siler
        System.out.println(irregular.strip()+" TEXT");
        System.out.println("-------");


        //lines
        String str = "\nHi\nHello\nYes\r\nNo\n";

        List<String> lines = new ArrayList<>();
        str.lines().forEach(s -> lines.add(s));

        System.out.println(lines);


    }
}
