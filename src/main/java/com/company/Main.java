package com.company;


    public class Main {
        int age=5;
        static int year=2012;

        public static void helloWorld() {
            System.out.println("Hello World");
        }

        public void helloWorldNotStatic() {
            System.out.println("Hello World");
        }
        //Static değişkenler metod içerisinde tanımlanamaz.
        // Ayrıca static değişkenler class objesiyle çağrılmasına gerek yoktur.
        int GLOBAL = 5;

        public static void main(String[] args) {
            //JAVADA DEĞİŞKEN TANIMLAMA


            //String Tanımlama
            String word = "helloWorld";
            //Integer tanımlama
            int number = 5;
            //Boolean tanımlama
            boolean isEmpty = true;
            //Double tanımlama
            double deciminalNumber = 0.5;
            //********************

            //Array tanımlama
            int data[] = new int[5]; //Integer tipinde 5 elemanlı bir array
            int nullArray[]; // Integer tipinde boş bir array
            int filledArray[] = {1, 2, 3, 4}; //içerisinde 1,2,3,4 olan integer array
            //***************
            //Operatorleri Atama
            int x=5; //X'e değer atama
            int y=3;

            //Aritmatik operatörler
            // 2 değerin toplamını bir değere atama alttaki 2 kodda aynı işlevdedir.
            x=x+y; //5+3
            x+=y;  //8+3

            x-=y;  //11-3 x'ten y yi çıkartır ve x'e atar
            x*=y;  //8*3  x ve y'yi çarpar x'e atar
            x/=y;  //24÷3 x'i y'ye böler ve x'e atar
            //*******************

            //Artırma(Increation) ve Azaltma(Decreation) Operatorleri
            x++; // x'i birle toplar
            x--; // x'ten bir çıkartır.

            //İlişkisel operatörler ve If kullanımı
            int firstNumber=3;
            int secondNumber=6;

            if(firstNumber<secondNumber){
                System.out.println("Second number is bigger than first number");
            }
            else if(firstNumber>secondNumber){
                System.out.println("Second number is smaller than first number");
            }
            else if(firstNumber==secondNumber){
                System.out.println("Second number is equal first number");
            }
            else if(firstNumber<=secondNumber){
                System.out.println("Second number is bigger than first number");
            }
            else if(firstNumber<=secondNumber){
                System.out.println("Second number is bigger than first number or first number is equal second");
            }
            else System.out.println("All of if statements are wrong");
            //burda ilk sayı, ikinci sayıdan küçük olduğu için ilk if statement'ı gerçekleşecek

            //******************************

            //Mantıksal operatörler
            //AND,OR,NOT,XOR

            //----
            //AND operatörü,eğer 2 conditionda doğruysa true değer döndürür. Simgesi '&&'dir.
            boolean andOperator= ("example".length()==7) && (1<10); // returns true
            andOperator= ("example".length()==7) && (10<1); // returns false
            andOperator= ("example".length()==5) && (1<10); // returns false
            //----

            //----
            //OR operator. Doğru değer döndürmesi için en az bir tane conditionun doğru olması yeterlidir.
            //Simgesi '||' dir
            boolean orOperator= ("example".length()==7) || (1<10); // returns true
            orOperator= ("example".length()==7) || (10<1); // returns true
            orOperator= ("example".length()==5) || (1<10); // returns false
            //----

            //----
            //NOT operatörüde true değerleri false, false değerleri true döndürür.
            //Simgesi !'dir.

            boolean notOperator= !(1<10); //returns false
            notOperator=!(1>10); //returns true
            //----

            //********************************



        }


    }




