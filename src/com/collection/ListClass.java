package com.collection;

import java.util.*;

public class ListClass {
    public static void main(String[] args) {
        //list methods on arraylist
        //interface methods

       /* List<Integer> list = new ArrayList<>();
        for(int i=1;i<=20;i++){
            System.out.println("the element added : "+list.add(i));
        }
        System.out.println("The list is empty : "+list.isEmpty());
        System.out.println("the size of the list : "+list.size());
        System.out.println("the list contains num 2 : "+list.contains(2));
        System.out.println(Arrays.toString(list.toArray()));
        List<Integer> list2 = new ArrayList<>();
        for(int i=1;i<=10;i++){
            System.out.println("the element added : "+list2.add(i));
        }
        System.out.println("MyList contains all element in the list : "+ new HashSet<>(list).containsAll(list2));

        list.addAll(5,list2); //starting index.
        System.out.println(Arrays.toString(list.toArray()));

        list.retainAll(list2);
        System.out.println(Arrays.toString(list.toArray()));

        list.replaceAll(e -> e+100);
        System.out.println(Arrays.toString(list.toArray()));*/

        //ArrayListMethods
      /*  System.out.println(" the array list method");
        ArrayList<Integer> arrayList = new ArrayList<>();
        //isEmpty() size() contains() toArray() are override
        for(int i=1000;i<=1020;i++){
            System.out.println("the element added : "+arrayList.add(i));
        }

        System.out.println("the index of the 1002 : "+arrayList.indexOf(1002));
        System.out.println("the last accorance of : "+arrayList.lastIndexOf(1002));

        System.out.println("set 1002 to 2001  "+ arrayList.set(2,2001));
        System.out.println("get the 2 value : "+arrayList.get(2));
        System.out.println("remove int value : "+arrayList.remove(2));
        System.out.println("remove Integer value : "+arrayList.remove(new Integer(1000)));
        //sublist();
        System.out.println(Arrays.toString(arrayList.subList(2,6).toArray()));
        System.out.println(Arrays.toString(arrayList.toArray()));
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer;
            }
        });
        System.out.println(Arrays.toString(arrayList.toArray()));*/


        //LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=0;i<10;i++){
            linkedList.add(i);
        }
        linkedList.add(3,20);
        System.out.println(linkedList);
        linkedList.addAll(linkedList);
        System.out.println(linkedList);
        linkedList.addAll(2,linkedList);
        System.out.println(linkedList);
        linkedList.addFirst(10000);
        System.out.println(linkedList);
        linkedList.addLast(10000);
        System.out.println(linkedList);
        System.out.println(linkedList.element());
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf(10000));
        System.out.println(linkedList);
        System.out.println(linkedList.lastIndexOf(10000));
        System.out.println(linkedList.offer(10000));
        System.out.println(linkedList.offerFirst(10000));
        System.out.println(linkedList.offerLast(10000));
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.pop());
        linkedList.push(120);

        System.out.println(linkedList.remove());
        System.out.println(linkedList.remove(3));
        System.out.println(linkedList.remove(new Integer(120)));
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeFirstOccurrence(10000));
        System.out.println(linkedList.removeLastOccurrence(10000));
        linkedList.clear();

        //vector has all the same method as arraylist in adding with element return void



    }
}
