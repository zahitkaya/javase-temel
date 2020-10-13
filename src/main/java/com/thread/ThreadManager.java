package com.thread;

public class ThreadManager implements Runnable {
    private int id;
    public ThreadManager(int id){
        this.id=id;
    }

    public static void main(String[] args) {

        ThreadManager threadManager=new ThreadManager(20);
        Thread myThread=new Thread(threadManager);
        myThread.start();

        ThreadManager t=new ThreadManager(5);
        ThreadManager t2=new ThreadManager(10);
        t.run();
        t2.run();

    }

    @Override
    public void run() {
       try {
           for (int i=0;i<20;i++){
               Thread.sleep(1000);
               System.out.println(id);
           }

       }
       catch (InterruptedException e){
           System.err.println(e);
       }
    }
}

/*
Start ve run farkı
Start bir obje üzerinde bir kere çağırabilir, run istediğimiz kadar çağırılabilir.
Start thread clasında tanımlanmış bir method, run ise Runnable interfacesinde tanımlanmıştır
Eğer objeyi oluşturduğumuz sınıfın Superi Thread sınıfıysa startı direkt objeyi kullanarak çağırabiliriz.

 */
