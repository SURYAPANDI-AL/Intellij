package com.collection;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class CollectionPractice {

    public static void main(String[] args) throws InterruptedException {

        //collection interface

        Collection collection = new ArrayList<>();
        //add
        collection.add('a');
        collection.add('a');
        collection.add(32);
        printCollectionUsingIterator(collection);
        //add all
        collection.addAll(collection);
        printCollectionUsingIterator(collection);
        //remove
        collection.remove('a');
        printCollectionUsingIterator(collection);
        //remove all
        collection.removeAll(collection);
        printCollectionUsingIterator(collection);
        //check empty;
        boolean isEmpty=collection.isEmpty();
        System.out.println(isEmpty);
        //to array
        collection.add('a');
        collection.add('a');
        Object[] array=collection.toArray();
        System.out.println(array.toString());
        //contains
        System.out.println(collection.contains(5));
        //contains all
        System.out.println(collection.containsAll(collection));
        //size
        System.out.println(collection.size());
        //iterator



        //List;
        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add(1,7);
        list.addAll(collection);
        list.remove(3);
        System.out.println("the element in the index 2 is : "+list.get(2));
        list.set(1, 3);
        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf('a'));
        //we can add regardless of the generics in list only by add all.
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }


        //Enumeration
        Vector v = new Vector();
        for(int i=0;i<10;i++) {
            v.add(i);
        }

        System.out.println("using enumeration");
        Enumeration e = v.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        //tree set
        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }

        });
        set.add(1);
        set.add(20);
        set.add(3);
        //set.add(null);
        System.out.println(set);
        System.out.println(set.comparator());

        System.out.println("hello my world");
        Map<Object, Object> map1 = new HashMap<>(Collections.emptyMap());
        map1.put(1,1);
        System.out.println(map1);


        //hashmap
        Map<Integer,Character> map = new HashMap<>();
        for(int i=1;i<=10;i++) {
            map.put(i, (char)(96+i));
        }

        for(Map.Entry<Integer,Character> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //hashtable
        Hashtable<Integer, String> hashTable = new Hashtable<>();
        for(int i=1;i<=5;i++) {
            hashTable.put(i, (char)(96+i)+"good");
        }

        System.out.println(hashTable);

        Enumeration<Integer> enumerate = hashTable.keys();

        while(enumerate.hasMoreElements()) {
            int key = enumerate.nextElement();
            System.out.println(key +" "+hashTable.get(key));
        }

        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();
        priorityBlockingQueue.take();
        priorityBlockingQueue.add(50);

    }


    static void printCollectionUsingIterator(Collection collection) {
        Iterator it = collection.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+"\t");
        }
        System.out.println();
    }
}
