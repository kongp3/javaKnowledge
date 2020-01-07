package com.cto.edu.basic.inner;

/**
 * 局部内部类只能在方法内部中使用，一旦方法执行完毕，局部内部类就会从内存中删除。
  必须注意：如果局部内部类中要使用他所在方法中的局部变量，那么就需要将这个局部变量定义为final的。
 *
 */
public class Outter2 {
	
	int a = 10;
	
	public void test() {
		final int c = 5;
		System.out.println("执行外部类的方法");
		class Inner {
			int b = 20;
			void test1() {
				System.out.println("执行局部内部类的方法，b:" + b);
				/**
				 * 注意：如果局部内部类中要使用他所在方法中的局部变量，
				 * 那么就需要将这个局部变量定义为final的。
				 */
				System.out.println("调用方法的局部变量final，c：" + c);
			}
		}
		Inner inner = new Inner();
		inner.test1();
	}

	public static void main(String[] args) {
		Outter2 outter = new Outter2();
		outter.test();
	}
}