package com.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("surya",1);
        linkedHashMap.put("jack",1);
        linkedHashMap.put("wizard",1);
        System.out.println(linkedHashMap);
        String name = "jack";
        linkedHashMap.put(name,linkedHashMap.getOrDefault(name,0)+1);
        System.out.println(linkedHashMap);
        name = "archer";
        linkedHashMap.put(name,linkedHashMap.getOrDefault(name,0)+1);
        System.out.println(linkedHashMap);

    }
}
