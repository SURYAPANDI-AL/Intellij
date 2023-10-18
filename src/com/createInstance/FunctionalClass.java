package com.createInstance;

public class FunctionalClass {
    public static void main(String[] args) {
        //creating instance of the functional interface using lambda function
        Runnable runnable=()->
            System.out.println("running ....");
        Thread myThread = new Thread(runnable);
        myThread.start();

        /*Runnable runnable = () -> {
            for (int i=0;i<10;i++){
                System.out.println("runnable method");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();*/
    }
}
