package com.collection;

import java.util.*;


public class MapClass {

    public static void main(String[] args) {
        /*HashMap*/
        /*MapInterface methods*/

        /*
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("apple",2);
        hashMap.put("jack",3);
        hashMap.put("coco",4);
        hashMap.put("mango",6);
        hashMap.put("sweet",2);

        print(hashMap);

        hashMap.clear();
        print(hashMap);

        Map<String,Integer> hashMap2 = new HashMap<>();
        hashMap2.put("apple",2);//null
        hashMap2.put("jack",3);//null
        hashMap2.put("coco",4);//null
        hashMap2.put("mango",6);//null
        hashMap2.put("sweet",2);//null

        hashMap.putAll(hashMap2);
        print(hashMap);

        System.out.println(hashMap.size());//5

        System.out.println(hashMap.compute("coco",(key,value)->value*3));//12
        print(hashMap);

        System.out.println(hashMap.computeIfAbsent("banana",key->3));//3
        System.out.println(hashMap.computeIfAbsent("banana",key->8));//3
        print(hashMap);

        System.out.println(hashMap.computeIfPresent("banana",(key,value)->8));//8
        System.out.println( hashMap.computeIfPresent("coffee",(key,value)->10));//null
        print(hashMap);

        hashMap.compute("coffee",(key,value)->3);//if not null pointer exception while using value for logic //3
        print(hashMap);

        System.out.println(hashMap.containsKey("mango"));//true

        System.out.println(hashMap.containsValue(3));//false

        Set<Map.Entry<String,Integer>> set =hashMap.entrySet();
        System.out.println(set);

        System.out.println(hashMap.get("banana").equals(3));//true

        hashMap.forEach((key,value)->{
            String s = key + "s";
            int i = value + 3;
            System.out.println(s+" "+i);
        });//void
        System.out.println(hashMap.getOrDefault("bamboo",7));

        System.out.println(hashMap2.isEmpty());//true

        Set<String> keySet = hashMap.keySet();
        System.out.println(keySet);

        ArrayList<Integer> valuesList = new ArrayList<>(hashMap.values());
        System.out.println(valuesList);

        System.out.println(hashMap.merge("coco",4,(existingValue,newValue)->newValue));//4
        print(hashMap);
        hashMap.merge("candy",4,(existingValue,newValue)->newValue);//4
        print(hashMap);

        System.out.println(hashMap.put("candy",6));//4
        System.out.println(hashMap.put("grape",3));//null
        print(hashMap);
        System.out.println(hashMap.remove("grape",3));//true
        print(hashMap);
        System.out.println(hashMap.remove("candy"));//6
        print(hashMap);

        System.out.println(hashMap.replace("jack",42));//3
        System.out.println(hashMap.replace("jack",42,3));//true

        hashMap.replaceAll((key,value)-> key.length());//void
        print(hashMap);
*/
        //in addition, HashMap class has the clone() method;

        //linked hashmap has the removeEldestEntry protected method

        CustomLinkedHashMap<Integer,Integer> customLinkedHashMap = new CustomLinkedHashMap<>(5);
        for(int i=0;i<10;i++){
            customLinkedHashMap.put(i,i+10);
            System.out.println(customLinkedHashMap);
        }

    }

    private static void print(Map<String, Integer> map) {
        System.out.println(map);
    }


}

class CustomLinkedHashMap<K,V> extends LinkedHashMap<K,V>{
    int size ;
    public CustomLinkedHashMap(int size){
        super(size,0.75f,true);
        this.size=size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size()>size;

    }
}
