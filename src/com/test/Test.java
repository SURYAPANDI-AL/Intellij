package com.test;
import com.access.Demo;
public class Test {
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println("this is the TestClass in another package");
		System.out.println(demo.publicInstanceVariable);
		System.out.println(demo.publicMethod());
		//demo.privateMethod();
	}
}
