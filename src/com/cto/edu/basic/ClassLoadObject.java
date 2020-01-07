package com.cto.edu.basic;

public class ClassLoadObject {
	
	public static String s = "";
	
	public static String s1 = getString();
	
	static {
		System.out.println("静态代码块执行了");
	}

	private static String getString() {
		s = "1234";
		System.out.println("静态方法执行，给静态变量赋值后，s：" + s);
		return s;
	}

	public static void test() {
		System.out.println("普通静态方法执行");
	}

	{
		System.out.println("普通的构造代码块执行");
	}

	public ClassLoadObject() {
		System.out.println("构造方法执行");
	}
}