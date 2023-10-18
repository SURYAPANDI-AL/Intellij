package com.createInstance;

public class CloneClass {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.setVar(100);
        myClass.method();
        MyClass myClass1=myClass.clone();
        myClass1.method();
        myClass.setVar(200);
        myClass.method();
        myClass1.method();

        /*MyClass myClass = new MyClass();
        MyClass myClass1 = myClass.clone();
        System.out.println(myClass.equals(myClass1));*/
    }
}
