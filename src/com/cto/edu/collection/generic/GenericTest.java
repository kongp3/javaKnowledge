package com.cto.edu.collection.generic;

import java.util.ArrayList;
import java.util.List;

// 测试类型通配符
public class GenericTest {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		List<Integer> age = new ArrayList<Integer>();
		List<Number> number = new ArrayList<Number>();

		name.add("zhangsan");
		age.add(10);
		number.add(311);

		getData(name);
		getData(age);
		getData(number);
		// 存放其他类型的list也是可以调用的
		
		
		
		System.out.println("test <? extends T > :");
//		 getUperNumber(name); // 编译报错
		getUperNumber(age);// 2
        getUperNumber(number);// 3
        
        
    	System.out.println("test <? super T > :");
        getLowerInteger(age);
        getLowerInteger(number);

	}

	/**
	 * 因为getData()方法的参数是List类型的，所以name，age，number都可以作为这个方法的实参， 这就是通配符的作用
	 * 
	 * @param data
	 */
	public static void getData(List<?> data) {
		System.out.println("data :" + data.get(0));
	}
	

	public static void getUperNumber(List<? extends Number> data) {
		System.out.println("data :" + data.get(0));
	}
	
	public static void getLowerInteger(List<? super  Integer> data) {
		System.out.println("data :" + data.get(0));
	}
}
