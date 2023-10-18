package com.access;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("this is class - demo2 in the same package");
		Demo demo = new Demo();
		System.out.println(demo.defaultInstanceVariable + demo.protectedInstanceVariable
				+ demo.publicInstanceVariable);

		System.out.println( demo.defaultMethod() + "\n" + demo.publicMethod() + "\n"
				+ demo.protectedMethod());
	}

}
