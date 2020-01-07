package com.cto.edu.basic;

/**
 * 子类不能继承父类的构造器（构造方法或者构造函数），但是父类的构造器带有参数的，
 * 则必须在子类的构造器中显式地通过super关键字调用父类的构造器并配以适当的参数列表。
 * 
 * 如果父类有无参构造器，则在子类的构造器中用super调用父类构造器不是必须的，
 * 如果没有使用super关键字，系统会自动调用父类的无参构造器。
 *
 */
class SuperClass {
	private int num;

	SuperClass() {
		System.out.println("SuperClass()父类默认构造函数被调用");
	}

	SuperClass(int num) {
		System.out.println("SuperClass(int num)父类有参构造函数被调用");
		this.num = num;
	}
}

class SubClass extends SuperClass {
	private int num;

	SubClass() {
		super(300); // 显示调用父类构造函数
		System.out.println("SubClass子类默认构造函数被调用");
	}

	public SubClass(int num) {
		super();
		System.out.println("子类有参构造函数被调用SubClass(int num):" + num);
		this.num = num;
	}
}

public class TestSuperSub {
	public static void main(String args[]) {
		SubClass subC = new SubClass();
		SubClass subC2 = new SubClass(100);
	}
}