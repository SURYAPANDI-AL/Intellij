package com.collection;

import java.util.Comparator;
import java.util.TreeMap;


public class TreeMapClass {

    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>(new CustomComparator<>());
        treeMap.put("apple",2);
        treeMap.put("jack",3);
        treeMap.put("coco",4);
        treeMap.put("mango",6);
        treeMap.put("sweet",2);
        print(treeMap);

        System.out.println(treeMap.ceilingEntry("apple"));//greater than or equal to
        System.out.println(treeMap.ceilingKey("b"));//greater than or equal to
        System.out.println(treeMap.comparator());

        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.descendingMap());

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.pollFirstEntry());

        System.out.println(treeMap.floorEntry("s"));//nearest less than or equal to
        System.out.println(treeMap.floorKey("s"));//nearest less than or equal to

        System.out.println(treeMap.headMap("j"));//less than
        System.out.println(treeMap.headMap("jack",false));//less than
        System.out.println(treeMap.headMap("jack",true));//less and equal

        System.out.println(treeMap.higherEntry("k"));//higher
        System.out.println(treeMap.higherKey("k"));//higher

        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.pollLastEntry());

        System.out.println(treeMap.lowerEntry("k"));//lower
        System.out.println(treeMap.lowerKey("k"));//lower
        System.out.println(treeMap.navigableKeySet());
        System.out.println(treeMap.subMap("a","k"));
        System.out.println(treeMap.subMap("apple",false,"sweet",true));
        System.out.println(treeMap.tailMap("jack"));//equal and remaining
        System.out.println(treeMap.tailMap("jack",false));
        
    }

    private static void print(TreeMap<String, Integer> treeMap) {
        System.out.println(treeMap);
    }
}

class CustomComparator<Sting> implements Comparator<Sting> {



    @Override
    public int compare(Sting key1, Sting key2) {
        return key2.toString().compareTo(key1.toString());
    }
}
