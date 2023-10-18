package com.collection;


import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        /*
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add(5);
        }
        System.out.println(set);
        set.add(55);
        set.add(15);
        set.add(35);
        set.add(25);
        System.out.println(set);
        */

/*

        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add(5);
        }
        System.out.println(set);
        set.add(55);
        set.add(15);
        set.add(35);
        set.add(25);
        set.add(null);
        System.out.println(set);
*/

/*
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add(5);
        }
        System.out.println(set);
        set.add(55);
        set.add(65);
        set.add(75);
        set.add(95);
        set.add(15);
        set.add(35);
        set.add(25);
        set.add(50);
        //set.add(null);
        System.out.println(set);

        System.out.println(set.floor(30));
        System.out.println(set.ceiling(55));
        System.out.println(set.higher(95));
        System.out.println(set.lower(30));


        //inclusive boolean methods also available subSet(index,boolean inclusive);
        //the parameters are not the index because index based because it doesn't implement random access
        //there the value ranges
        System.out.println(set.subSet(0,50));//inclusive $ exclusive
        System.out.println(set.tailSet(50));// inclusive
        System.out.println(set.headSet(50));// exclusive

        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());

        //iterating through the set in descending order
        Iterator<Integer> iterator = set.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(set.descendingSet());
*/

    }
}
