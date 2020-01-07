package com.cto.edu.basic;

// 测试Class.forName和classloader的区别
public class ClassloaderAndForNameTest {

	public static void main(String[] args) {
		String className = "com.cto.edu.basic.ClassLoadObject";
		System.out.println("以下是测试Classloader的效果：");
		testClassloader(className);

		System.out.println("========================");
		System.out.println("以下是测试Class.forName的效果：");
		testForName(className);
		
	}

	private static void testClassloader(String className) {
		Class<?> c;
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		try {
			c = loader.loadClass(className);
			System.out.println("testClassloader： " + c.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void testForName(String className) {

		try {
			Class c = Class.forName(className);
			System.out.println("testForName：" + c.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}