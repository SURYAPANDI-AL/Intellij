package com.access;

public class Demo {
	// instance variable.
	public int publicInstanceVariable = 100;
	protected int protectedInstanceVariable = 200;
	int defaultInstanceVariable = 300;
	private int privateInstanceVariable = 400;

	// methods
	protected String protectedMethod() {
		return "I am a protected method";
	}

	private String privateMethod() {
		return "I am a private method";
	}

	String defaultMethod() {
		return "I am a default method";
	}

	public String publicMethod() {
		return "I am a public method";
	}

	private class Inner {
		public void innerClassMethod() {
			System.out.println("this is the current innner class main method");

			System.out.println(defaultInstanceVariable + privateInstanceVariable + protectedInstanceVariable
					+ publicInstanceVariable);

			System.out.println(
					privateMethod() + "\n" + defaultMethod() + "\n" + publicMethod() + "\n" + protectedMethod());

		}
	}

	public static void main(String[] args) {
		System.out.println("this is the current class main method");
		Demo demo = new Demo();
		System.out.println(demo.defaultInstanceVariable + demo.privateInstanceVariable + demo.protectedInstanceVariable
				+ demo.publicInstanceVariable);

		System.out.println(demo.privateMethod() + "\n" + demo.defaultMethod() + "\n" + demo.publicMethod() + "\n"
				+ demo.protectedMethod());
		Inner inner = demo.new Inner();
		inner.innerClassMethod();
	}
}
