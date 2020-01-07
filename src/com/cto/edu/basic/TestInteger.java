package com.cto.edu.basic;

// 测试Integer和int的区别
public class TestInteger {

	public static void main(String[] args) {
		int i = 128;
		Integer i2 = 128;
		Integer i3 = new Integer(128);
		System.out.println(i == i2); // Integer会自动拆箱为int，所以为true
		System.out.println(i == i3); // true，理由同上
		Integer i4 = 127;// 编译时被翻译成：Integer i4 = Integer.valueOf(127);  -128  -  127
		Integer i5 = 127;
		System.out.println(i4 == i5);// true
		Integer i6 = 128; // Integer.valueOf(128) new一个对象，分配内存空间
		Integer i7 = 128; // 分配内存空间
		System.out.println(i6 == i7);// false
		Integer i8 = new Integer(127);
		System.out.println(i5 == i8); // false
		Integer i9 = new Integer(128);
		Integer i10 = new Integer(128);
		System.out.println(i9 == i10); // false

		/*
		 * int i = 128; Integer localInteger1 = Integer.valueOf(128); 
		 * Integer localInteger2 = new Integer(128); 
		 * System.out.println(i == localInteger1.intValue()); 
		 * System.out.println(i ==
		 * localInteger2.intValue()); Integer localInteger3 =
		 * Integer.valueOf(127); Integer localInteger4 = Integer.valueOf(127);
		 * System.out.println(localInteger3 == localInteger4); Integer
		 * localInteger5 = Integer.valueOf(128); Integer localInteger6 =
		 * Integer.valueOf(128); System.out.println(localInteger5 ==
		 * localInteger6); Integer localInteger7 = new Integer(127);
		 * System.out.println(localInteger4 == localInteger7); Integer
		 * localInteger8 = new Integer(128); Integer localInteger9 = new
		 * Integer(128); System.out.println(localInteger8 == localInteger9);
		 */
	}

}