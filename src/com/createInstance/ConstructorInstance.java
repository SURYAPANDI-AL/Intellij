package com.createInstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorInstance {
    public static void main(String[] args) {
        MyClass myClass;
        try {
            Constructor<MyClass> constructor = MyClass.class.getDeclaredConstructor();
            myClass = constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        myClass.method();

       /* MyClass myClass;
        try{
            Constructor<MyClass> constructor = MyClass.class.getDeclaredConstructor();
            myClass = constructor.newInstance();
        }catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e){
            throw new RuntimeException(e);
        }
        myClass.method();*/
    }
}
