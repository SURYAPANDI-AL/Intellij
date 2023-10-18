package com.test;

import com.access.Demo;

public class ChildClass extends Demo{
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		System.out.println("this is class - child class in another package");
		System.out.println(childClass.protectedInstanceVariable + childClass.publicInstanceVariable);

		System.out.println( childClass.publicMethod() + "\n"
				+ childClass.protectedMethod());
	}
}
