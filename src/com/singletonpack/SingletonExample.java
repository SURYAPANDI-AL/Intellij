package com.singletonpack;

public class SingletonExample {
	public static SingletonExample singletonExample;
	private SingletonExample() {
		
	}
	public static SingletonExample getInstance() {
		if(singletonExample==null)
			singletonExample = new SingletonExample();
		return singletonExample;
	}
	
	public String method() {
		return "method in singleton class is called.";
	}
}
