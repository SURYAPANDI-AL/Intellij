package com.createInstance;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.sql.SQLOutput;
import java.util.*;

public class RunTimeClass {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Enter the fully qualified name of the class");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
//        String name = "com.createInstance.MyClass";
        Class<?> clazz;
        try {
            clazz = Class.forName(name);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Object object;
        try {
            object = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
//        System.out.println( object.getClass());

        Method [] methods = object.getClass().getDeclaredMethods();

        for(int i=0;i<methods.length;i++){
            System.out.println(methods[i]);
        }
        System.out.println("enter the method name:");
        String methodName = scanner.next();
        System.out.println("enter the parameter count");
        int count = scanner.nextInt();
        Class<?> [] myTypes =new Class[count];
        for(int i=0;i<count;i++){
            System.out.println("enter the type of "+(i+1)+" parameter: ");
            String className = scanner.next();
            myTypes[i]= Class.forName(className);
        }

        Method method;

        try {
            method = clazz.getMethod(methodName, myTypes);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(Arrays.toString(method.getParameters()));
        Object[] parameterObjects = new Object[count];
        for(int i=0;i<count;i++){
            System.out.println("Enter the value one by one");
            String input = scanner.next();

        }
        Object returnValue;
        try {
            returnValue = method.invoke(object,parameterObjects);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        if(returnValue != null){
            System.out.println(returnValue.toString());
        }
    }
}
