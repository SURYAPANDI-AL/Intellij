package com.createInstance;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class NonPrameterizedMethodInvoke {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fully qualified class name:");
        String className = scanner.next();
        Class<?> clazz = Class.forName(className);
        Object object= clazz.newInstance();
        System.out.println("Enter the method in the class : ");
        String methodName = scanner.next();
        System.out.println("Enter the parameter count : ");
        int count = scanner.nextInt();
        Class<?> [] parameterTypes = new Class[count];
        for(int i=0;i<count;i++){
            System.out.println("enter the "+(i+1)+"- parameter type : ");
            String input = scanner.next();
            Class<?> inputType = getvalidType(input);
            parameterTypes[i]=inputType;
        }
        Method method = clazz.getMethod(methodName,parameterTypes);
//        System.out.println(method.getGenericReturnType());
        Object[] parameterObjects = new Object[count];
        for(int i=0;i<count;i++){
            System.out.println("enter the "+(i+1)+"- parameter  : ");
            String arg = scanner.next();
            parameterObjects[i]=parseArgument(arg,parameterTypes[i]);
        }
        Object result = method.invoke(object,parameterObjects);
        if(result != null){
            System.out.println(result.toString());
        }
    }

    private static Class<?> getvalidType(String input) throws ClassNotFoundException {
        switch(input){
            case "int":
                return int.class;
            case "float":
                return float.class;
            case "double":
                return double.class;
            case "boolean":
                return boolean.class;
            default:
                return Class.forName(input);
        }
    }

    private static Object parseArgument(String arg, Class<?> parameterType) throws ClassNotFoundException {
        if (parameterType == int.class || parameterType.equals(Class.forName("java.lang.Integer"))) {
            return Integer.parseInt(arg);
        } else if (parameterType == double.class || parameterType.equals(Class.forName("java.lang.Double"))) {
            return Double.parseDouble(arg);
        } else if (parameterType == boolean.class|| parameterType.equals(Class.forName("java.lang.Boolean"))) {
            return Boolean.parseBoolean(arg);
        } else {
            return arg;
        }
    }
}
