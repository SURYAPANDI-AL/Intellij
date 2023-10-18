package com.collection;

import java.util.EnumMap;
import java.util.EnumSet;

enum Color{
    RED,BLUE,GREEN;
        }
public class EnumClass {
    public static void main(String[] args) {
        EnumMap<Color,Color> map = new EnumMap<>(Color.class);
        map.put(Color.RED,Color.BLUE);
        map.put(Color.BLUE,Color.BLUE);
        map.put(Color.GREEN,Color.BLUE);
        System.out.println(map);

        EnumSet<Color> set = EnumSet.allOf(Color.class);
        System.out.println(set);
    }
}
