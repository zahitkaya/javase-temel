/*
Projede 10 luk tabandaki bir sayıyı 2 lik tabanda yazdırmaya çalıştım.
 */

package com.company;

public class SimpleProject {
    public static boolean isEven(int number){
        if(number%2==0)
            return true;

        return false;
    }
    public static void main(String[] args) {


        int number=19; //Dönüştüreceğimiz 10luk sayı tabanındaki sayı
        String binaryNumber=""; //Dönüştürdüğümüz 2 lik sayı tabanındaki sayı

        while(number>0){
            if(isEven(number)){
                number=number/2;
                binaryNumber="0"+binaryNumber;

            }
            else{
                binaryNumber="1"+binaryNumber;
                number=(number-1)/2;
            }



        }

        System.out.println(binaryNumber);

    }
}
