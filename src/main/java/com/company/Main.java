package com.company;


    public class Main {
        //Static değişkenler metod içerisinde tanımlanamaz.
        // Ayrıca static değişkenler class objesiyle çağrılmasına gerek yoktur.
         int GLOBAL_NUMBER = 5;

        public static void helloWorld() {
            System.out.println("Hello World");
        }

        public void helloWorldNotStatic() {
            System.out.println("Hello World");
        }

        public static void main(String[] args) {


            //String Tanımlama
            String word = "helloWorld";
            //Integer tanımlama
            int number = 5;
            //Boolean tanımlama
            boolean isEmpty = true;
            //Double tanımlama
            double deciminalNumber = 0.5;

            final int constant = 5;
            // CONTSANT=4; hata veriyor. Çünkü final değerler değiştirilimez.

            //*******************
            //static metodla static olmayan metodu karşılaştırıyoruz.
            helloWorld();
            //Static metodu direkt çağırabildik ama static olmayan metodu çağırmak için obje kullanmak zorundayız.
            Main mainObj = new Main();
            mainObj.helloWorldNotStatic();
            //********************

            //Array tanımlama
            int data[] = new int[5]; //Integer tipinde 5 elemanlı bir array
            int nullArray[]; // Integer tipinde boş bir array
            int filledArray[] = {1, 2, 3, 4}; //içerisinde 1,2,3,4 olan integer array
            //***************

        }

    }
