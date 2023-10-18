package com.collection;



import java.util.*;
import java.util.Collection.*;

public class IterationClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }

       /* Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
*/
      /*
        ListIterator<Integer> iterator1 = list.listIterator();

        while (iterator1.hasNext()) {
            int i =iterator1.next();
            if (i % 2 == 0)
                iterator1.remove();
            System.out.print(i+" ");
        }
        System.out.println();
        while (iterator1.hasPrevious()) {
            System.out.print(iterator1.previous()+" ");

        }
        System.out.println();
        while (iterator1.hasNext()){
            int i=iterator1.next();
            iterator1.add(i+1);
            //iterator1.next();
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(list);*/

       /* Hashtable<Integer,String> hashtable = new Hashtable<>();

        for(int i=1;i<=20;i++){
            hashtable.put(i,"the number "+i);
        }

        Enumeration<Integer> enumeration = hashtable.keys();

        while(enumeration.hasMoreElements()){
            int element = enumeration.nextElement();
            System.out.println(element+" "+hashtable.get(element));
        }*/

        /*Vector<Integer> vector = new Vector<>();
        for(int i=1;i<=20;i++){
            vector.add(i);
        }

        Iterator<Integer> iterator = vector.iterator();
        iterator.forEachRemaining(System.out::println);
        */
    }
}