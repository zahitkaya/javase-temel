package com.var.arg;

public class VarArgeExamples {

    static void sampleMethod(int ...a){
        int sum=0;
        System.out.println(a.length);
        for(int i:a){
            sum=i+sum;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        sampleMethod(1,2,3,4,5,6);
    }
}
