package com.collection;

import java.util.*;

public class SpliteratorClass {

    public static void main(String[] args) {
        /*//ArrayList
        List<Integer> list= new ArrayList<>();
        for(int i=1;i<=20;i++){
            list.add(i);
        }

        Spliterator<Integer> spliterator = list.spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();
        spliterator.forEachRemaining(System.out::print);
        System.out.println();
        spliterator1.forEachRemaining(System.out::print);*/

        /* //LinkedList
        List<Integer> list= new LinkedList<>();
        for(int i=1;i<=20;i++){
            list.add(i);
        }

        Spliterator<Integer> spliterator = list.spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();
        spliterator.forEachRemaining(System.out::print);
        System.out.println();
        spliterator1.forEachRemaining(System.out::print);*/

        /* //Queue implemented using linked list
        Queue<Integer> list= new LinkedList<>();
        for(int i=1;i<=20;i++){
            list.add(i);
        }

        Spliterator<Integer> spliterator = list.spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();
        spliterator.forEachRemaining(System.out::print);
        System.out.println();
        spliterator1.forEachRemaining(System.out::print);*/


        /*Queue<Integer> queue= new PriorityQueue<>();
        for(int i=1;i<=20;i++){
            queue.add(i);
        }

        Spliterator<Integer> spliterator = queue.spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();
        spliterator.forEachRemaining(System.out::print);
        System.out.println();
        spliterator1.forEachRemaining(System.out::print);*/
    }
}
