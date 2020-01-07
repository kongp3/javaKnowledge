package com.cto.edu.basic.inner;

/**
 * 静态内部类虽然是外部类的成员，但是在未创建外部类的对象的情况下，可以直接创建静态内部类的对象。
 * 静态内部类可以引用外部类的静态成员变量和静态方法，但不能引用外部类的普通成员。
 */
public class Outter {
	static String staticVar = "staitc var静态变量";
	String instinceVar = "普通成员变量";
	static {
		System.out.println("静态代码块执行：" + staticVar);
		System.out.println("===========================");
	}

	static void test() {
		System.out.println("外部类的静态方法执行");
	}

	static class Inner {
		static {
			// 内部类的静态代码块在外部类初始化的时候，不会被初始化
			System.out.println("静态内部类的静态代码块");
		}
		public void test2() {
			System.out.println("staticVar的值为：" + staticVar);// 直接引用外部类的静态成员变量
			test();// 直接引用外部类的静态方法
			// System.out.println(instinceVar); // 试图引用外部类的非静态成员变量，不能通过编译
			System.out.println("静态内部类的方法执行");
		}
	}

	public static void main(String[] args) {
		new Outter();
		Inner in = new Inner();// 静态内部类的对象可以直接创建，无需先创建外部类的对象
		in.test2();
	}
}