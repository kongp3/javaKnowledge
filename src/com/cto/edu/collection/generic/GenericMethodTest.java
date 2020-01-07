package com.cto.edu.collection.generic;

// 测试泛型方法
public class GenericMethodTest {
	
	// 泛型方法 printArray
	public static <E> void printArray(E[] inputArray) {
		// 输出数组元素
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		// 创建不同类型数组： Integer, Double 和 Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("整型数组元素为:");
		printArray(intArray); // 传递一个整型数组,用泛型
		printIntegerArray(intArray); // 传递一个整型数组，不用泛型

		System.out.println("\n双精度型数组元素为:");
		printArray(doubleArray); // 传递一个双精度型数组,用泛型
		printDoubleArray(doubleArray); // 传递一个双精度型数组，不用泛型

		System.out.println("\n字符型数组元素为:");
		printArray(charArray); // 传递一个字符型数组,用泛型
		printCharacterArray(charArray); // 传递一个字符型数组，不用泛型
	}
	
	// 下面是不使用泛型方法时的写法，主要是参数不同
	public static  void printIntegerArray(Integer[] inputArray) {
		// 输出数组元素
		System.out.println("不使用泛型时Integer[]：");
		for (Integer element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	public static  void printDoubleArray(Double[] inputArray) {
		// 输出数组元素
		System.out.println("不使用泛型时Double[]：");
		for (Double element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	public static  void printCharacterArray(Character[] inputArray) {
		// 输出数组元素
		System.out.println("不使用泛型时Character[]：");
		for (Character element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

}