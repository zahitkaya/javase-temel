package com.exceptions;

public class TryCath {
    public static void main(String[] args) {

        int[] sampleArray=new int[3];
        try {
            sampleArray[3]=4;

        }
        catch (Exception e){
            System.out.println("Array 3 elemanlı hatanın adı:"+e.toString());
        }
        finally {
            System.out.println("Try catch bitti"); //finally try catch bittikten sonra çalışır
        }

        try {
            System.out.println(5/0);
        }
        catch (Exception e){
            System.out.println("Bir sayıyı 5'e bölemezsin");
            System.out.println(e.toString()); //hatayı gösterir
        }

        checkAge(15);

    }

    static void checkAge(int age){
        //throwu neden hata verdiğini belirtmek için kullanırız.
        if(age>17) System.out.println("İçeri girebilirsin");
        else {
            throw new ArithmeticException("İçeri girebilmen için 18 yaşından büyük olmalısın");
        }
    }




}
