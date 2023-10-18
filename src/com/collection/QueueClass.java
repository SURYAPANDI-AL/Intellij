package com.collection;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueClass {
    public static void main(String[] args) throws InterruptedException {
        /*
        first in first out.
         */
/*
        Queue<Integer> queue = new LinkedList<>();

        //add() remove() element() throws exception
        //offer() poll() peek() return the special value

        System.out.println(queue.poll());
//        System.out.println(queue.offer(3));
        System.out.println(queue.add(2));
        System.out.println(queue.remove());// NoSuchElementException
        System.out.println(queue.peek());
//        System.out.println(queue.element());// NoSuchElementException
        queue.add(null);
        queue.add(1);
        System.out.println(queue);


 */
        /*PriorityQueue*/
/*
        Queue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer1, Integer integer2) {
                if((integer1%2 == 0  && integer2%2 == 0) || (integer1%2 != 0  && integer2%2 != 0)){
                    return integer2-integer1;
                }else if (integer1%2 == 0){
                    return -1;
                }else {
                    return 1;
                }
            }
        });

        for(int i=25;i>0;i--){
            priorityQueue.offer(i);
        }

        System.out.println(priorityQueue);

        while(!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll()+" ");
        }
        System.out.println();

 */

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for(int i=12;i<29;i++){
            arrayDeque.offer(i);
        }

        System.out.println(arrayDeque);
        while(!arrayDeque.isEmpty()){
            if(arrayDeque.size()%2==0){
                arrayDeque.pollFirst();
            }else{
                arrayDeque.pollLast();
            }
            System.out.println(arrayDeque);
        }


/*

        BlockingQueue<Integer> blockingQueue = new PriorityBlockingQueue<>();
        System.out.println(blockingQueue.take());
        blockingQueue.put(3);
        blockingQueue.add(2);

*/
        /* SplitIterator*/

/*

        int [] array = new int[]{1,2,3,4,5,6,7,8,9,0};

        Spliterator<Integer> spliterator= Arrays.spliterator(array,0,7);

        Spliterator<Integer> spliterator1 = spliterator.trySplit();

        spliterator.forEachRemaining(System.out::println);
        System.out.println();
        spliterator1.forEachRemaining(System.out::println);
*//*
        List<Integer> dataList = new ArrayList<>();

        // Populate the data list with some values
        for (int i = 1; i <= 20; i++) {
            dataList.add(i);
        }

        Spliterator<Integer> spliterator = dataList.spliterator();

        // Try to split the data into two
        Spliterator<Integer> spliterator2 = spliterator.trySplit();

        // Process the first part
        System.out.print("First Part: ");
        spliterator.forEachRemaining(System.out::print);
        System.out.println();

        // Process the second part (if the split was successful)
        if (spliterator2 != null) {
            System.out.print("Second Part: ");
            spliterator2.forEachRemaining(System.out::print);
            System.out.println();
        } else {
            System.out.println("No further split possible.");
        }
*/
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }

        Spliterator<Integer> spliterator3 = list.spliterator();
        Spliterator<Integer> spliterator4= spliterator3.trySplit();
        spliterator3.forEachRemaining(System.out::print);
        System.out.println();
        spliterator4.forEachRemaining(System.out::print);

/*

        spliterator = list.spliterator();

        // Try to split the data into two
        spliterator2 = spliterator.trySplit();

        // Process the first part
        System.out.print("First Part: ");
        spliterator.forEachRemaining(System.out::print);
        System.out.println();

        // Process the second part (if the split was successful)
        if (spliterator2 != null) {
            System.out.print("Second Part: ");
            spliterator2.forEachRemaining(System.out::print);
            System.out.println();
        } else {
            System.out.println("No further split possible.");
        }
*/


    }

}
