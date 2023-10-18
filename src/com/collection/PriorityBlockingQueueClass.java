package com.collection;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueClass {

    static PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.setName("takeThread");
        thread.start();
        //System.out.println(priorityBlockingQueue);
        MyThread2 thread2 = new MyThread2();
        thread2.setName("putThread");
        thread2.start();

    }
}

class MyThread extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        PriorityBlockingQueueClass.priorityBlockingQueue.put(50);
    }
}


class MyThread2 extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName());
        try {
            System.out.println(PriorityBlockingQueueClass.priorityBlockingQueue.take());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        PriorityBlockingQueueClass.priorityBlockingQueue.put(32);
    }
}