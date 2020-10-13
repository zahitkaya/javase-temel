package com.thread;

public class Timer extends Thread {
    private int remainingTime;
    private String alarmName;

    public Timer(int remainingTime,String alarmName){
        this.alarmName=alarmName;
        this.remainingTime=remainingTime;
    }

    public static void main(String[] args) {
        Timer alarm=new Timer(60,"İlk alarm");
        Timer alarm2=new Timer(80,"İkinci alarm");
        alarm.start();
        alarm2.start();
    }

    @Override
    public void run() {
        try{
            while(remainingTime>=0){
                System.out.println();
                System.out.println(alarmName+" Zamanın bitmesine "+ remainingTime +" saniye kaldı");
                System.out.println();
                Thread.sleep(1000);
                remainingTime--;
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
