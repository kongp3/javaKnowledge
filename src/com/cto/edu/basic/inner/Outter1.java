package com.cto.edu.basic.inner;

/**
 * 成员内部类可以调用外部类的所有成员，但只有在创建了外部类的对象后，才能调用外部的成员。
 * 它与一个实例绑定在了一起，不可以定义静态的属性和方法
 *
 */
public class Outter1 {
	static int a = 1;
	int b = 0;

	public static void test1() {
		System.out.println("外部类的静态方法");
	}

	public void test2() {
		System.out.println("外部类的非静态方法");
	}

	class Inner {
		// static String aa; // 不可以定义静态的属性和方法
		public void test() {
			System.out.println("在成员内部类的方法中");
			test1();// 调用外部类的静态方法
			test2();// 调用外部类的非静态方法
			System.out.println("访问外部类的静态成员变量和非静态成员变量:" + (a + b));// 访问外部类的静态成员变量和非静态成员变量
		}
	}

	public static void main(String[] args) {
		// Inner in = new Inner(); // 成员内部类的对象不能直接创建，编译会报错
		Outter1 out = new Outter1(); // 先创建外部类的对象
		Inner in = out.new Inner(); // 注意：！成员内部类的对象必须通过外部类的对象创建
		in.test(); // 调用内部类的方法
	}
}