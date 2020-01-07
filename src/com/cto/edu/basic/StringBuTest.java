package com.cto.edu.basic;

// String,StringBuilder,StringBuffer简单使用测试
public class StringBuTest {

	public static void main(String[] args) {
		String s1 = "233";
		s1 = s1 + "wwww";
		System.out.println(s1);

		StringBuilder sbd = new StringBuilder();
		sbd.append("StringBuilder").append("12").append("34").append("56");
		System.out.println("StringBuilder:" + sbd.toString());

		StringBuffer sbf = new StringBuffer();
		sbf.append("stringbuffer").append("12").append("34").append("56");
		System.out.println("StringBuffer:" + sbf.toString());

		StringBuilder sb = new StringBuilder("1111199999");
		StringBuffer sbffer = new StringBuffer("1111199999");

		// 下面是验证线程安全的测试
		// 循环创建多个线程，测试StringBuilder
//		for (int i = 0; i < 100; i++) {
//			new Thread(new MyThread(sb)).start();
//		}
		
		// 循环创建多个线程，测试StringBuffer
		for (int i = 0; i < 100; i++) {
			new Thread(new MyThreadSbf(sbffer)).start();
		}
	}

	private static class MyThread implements Runnable {
		// 定义成员属性
		private StringBuilder sb;

		// 构造函数，参数初始化
		private MyThread(StringBuilder sb) {
			this.sb = sb;
		}

		public void run() {
			// 循环可以增加出现线程不安全的情况
			for (int i = 0; i < 100; i++) {
				sb.reverse();
			}
			// 输出sb字符串(默认调用了toString())
			System.out.println(sb);
		}
	}
	
	private static class MyThreadSbf implements Runnable {
		// 定义成员属性
		private StringBuffer sb;

		// 构造函数，参数初始化
		private MyThreadSbf(StringBuffer sb) {
			this.sb = sb;
		}

		public void run() {
			// 循环可以增加出现线程不安全的情况发生
			for (int i = 0; i < 100; i++) {
				sb.reverse();
			}
			// 输出sb字符串(默认调用了toString())
			System.out.println(sb);
		}
	}
}
