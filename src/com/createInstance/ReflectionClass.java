package com.createInstance;

public class ReflectionClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*Class<?> clazz=  Class.forName("com.createInstance.MyClass");
        Object object = clazz.newInstance();
        MyClass myClass=(MyClass) object;
        myClass.method();*/

        Class<?> clazz = Class.forName("com.createInstance.MyClass");
        MyClass myClass = (MyClass)clazz.newInstance();
        myClass.method();
    }
}
