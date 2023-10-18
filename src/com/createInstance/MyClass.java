package com.createInstance;

import java.io.Serializable;

public class MyClass implements Cloneable, Serializable {

    private int var = 10;
    public void method(){
        System.out.println(var);
        System.out.println("method called");
    }

    public void method1(int i){
        System.out.println(var);
        System.out.println("method called");
    }

    public void method2(Integer i){
        System.out.println(var);
        System.out.println("method called");
    }

    public void method2(Double i,Double j){
        System.out.println(var);
        System.out.println("method called");
    }
    public void method2(Float i){
        System.out.println(var);
        System.out.println("method called");
    }
    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    @Override
    public MyClass clone() {
        try {
            return (MyClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
