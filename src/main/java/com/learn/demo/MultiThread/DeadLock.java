package com.learn.demo.MultiThread;

public class DeadLock {
    String resource1 = "database";
    String resource2 = "log";

    Thread t1 = new Thread("Thread 1"){
      public void run() {
          while(true) {
              synchronized (resource1) {
                  synchronized (resource2) {
                      System.out.println(resource1 + " " + resource2);
                  }
              }
          }
      }
    };

    Thread t2 = new Thread(() -> {
        while(true){
            synchronized (resource2){
                synchronized (resource1){
                    System.out.println(resource2 + " " + resource1);
                }
            }
        }
    });

    public static void start() {
        DeadLock dl = new DeadLock();
//        dl.t2.setPriority(10);
        dl.t1.start();
        try {
            dl.t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dl.t2.start();
        try {
            dl.t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("Thread:%s Priority:%s", Thread.currentThread().getName(), Thread.currentThread().getPriority()));
        System.out.println(String.format("Thread:%s Priority:%s", dl.t1.getName(), dl.t1.getPriority()));
        System.out.println(String.format("Thread:%s Priority:%s", dl.t2.getName(), dl.t2.getPriority()));
    }
}
