package com.cto.edu.basic.reflect;

import com.cto.edu.basic.Student;

// 获取Class对象的三种方式测试
public class GetClassTest {

	public static void main(String[] args) {
		// 第一种方式获取Class对象
		Student stu1 = new Student();
		// 获取Class对象
		Class stuClass = stu1.getClass();
		System.out.println(stuClass.getName());

		// 第二种方式获取Class对象
		Class stuClass2 = Student.class;
		// 判断第一种方式获取的Class对象和第二种方式获取的是否是同一个
		System.out.println("第一种和第二种方式的class是否相等：" + (stuClass == stuClass2));

		// 第三种方式获取Class对象,一般都是用这种方式，强烈推荐这种方式
		try {
			// 注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
			Class stuClass3 = Class.forName("com.cto.edu.basic.Student");
			// 判断三种方式是否获取的是同一个Class对象
			System.out.println("第二种和第三种方式的class是否相等：" + (stuClass3 == stuClass2));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
