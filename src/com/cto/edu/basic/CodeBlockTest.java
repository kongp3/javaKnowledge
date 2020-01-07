package com.cto.edu.basic;

// 测试Java程序初始化的顺序
public class CodeBlockTest {
	public static void main(String[] args) {
		Child child = new Child();
	}
}

class Father {
	public static String fatherStr1 = "fatherStr1（静态字段初始化值）";

	public String fatherStr2 = "fatherStr2（字段初始化值）";
	static {
		System.out.println("父类静态代码块：" + fatherStr1 +",静态变量已经初始化");
		fatherStr1 = "fatherStr1（静态代码块赋值）";
	}
	{
		System.out.println("父类构造代码块fatherStr1：" + fatherStr1);
		System.out.println("父类构造代码块fatherStr2：" + fatherStr2);
		fatherStr2 = "fatherStr2（构造代码块赋值）";
	}

	public Father() {
		System.out.println("父类构造函数：" + fatherStr2);
		fatherStr2 = "fatherStr2（构造函数赋值）";
	}
}

class Child extends Father {
	public static String childStr1 = "childStr1（静态字段初始化值）";
	public String childStr2 = "childStr2（字段初始化值）";
	static {
		System.out.println("子类静态代码块：" + childStr1 + ",静态变量已经初始化");
		childStr1 = "childStr1（静态代码块赋值）";
	}
	{
		System.out.println("子类构造代码块childStr1：" + childStr1);
		System.out.println("子类构造代码块childStr2：" + childStr2);
		childStr2 = "childStr2（构造代码块赋值）";
	}

	public Child() {
		System.out.println("子类构造函数：" + childStr2);
		childStr2 = "childStr2（构造函数赋值）";
	}
}
/*父类静态代码块：fatherStr1（静态字段初始化值）,静态变量已经初始化
子类静态代码块：childStr1（静态字段初始化值）,静态变量已经初始化
父类构造代码块fatherStr1：fatherStr1（静态代码块赋值）
父类构造代码块fatherStr2：fatherStr2（字段初始化值）
父类构造函数：fatherStr2（构造代码块赋值）
子类构造代码块childStr1：childStr1（静态代码块赋值）
子类构造代码块childStr2：childStr2（字段初始化值）
子类构造函数：childStr2（构造代码块赋值）*/
