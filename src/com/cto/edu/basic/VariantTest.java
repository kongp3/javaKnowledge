package com.cto.edu.basic;

// 静态变量和实例变量的区别
public class VariantTest {
	public static int staticVar = 0;
	public int instanceVar = 0;

	public VariantTest() {
		staticVar++;
		instanceVar++;
		System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
	}
	
	public static void main(String[] args) {
		VariantTest v1 = new VariantTest();
		VariantTest v2 = new VariantTest();
		VariantTest v3 = new VariantTest();
		VariantTest v4 = new VariantTest();
		VariantTest v5 = new VariantTest();
	}
}
