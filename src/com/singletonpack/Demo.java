package com.singletonpack;

public class Demo {
	SingletonExample singletonInstance ;
	public Demo() {
		//singletonInstance = new SingletonExample();
		singletonInstance = SingletonExample.getInstance();
	}
	public static void main(String[] args) {
		Demo demo= new Demo();
		System.out.println(demo.singletonInstance.method());
	}
}
