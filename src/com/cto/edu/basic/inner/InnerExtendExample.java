package com.cto.edu.basic.inner;

// 测试通过内部类实现多继承等
class Example1 {
	public String name() {
		return "Example1 name()";
	}
}

class Example2 {
	public int age() {
		return 1;
	}
}

class Example3 {
	public int age() {
		return 1;
	}
}

class InnerExtendExample {
	 private String id = "id";
	 private static String name = "name";
	 //一般的非内部类，是不允许有 private 与protected权限的，
	 // 但内部类可以，所以我们能通过内部类来隐藏我们的信息。
	 private class test1 extends Example1 {
		public String name() {
			System.out.println("调用外部类的成员变量，id：" + id);
			System.out.println("调用外部类的静态变量，name：" + name);
			return super.name();
		}
	}

	private class test2 extends Example2 {
		public int age() {
			return super.age();
		}
	}

	public String name() {
		return new test1().name();
	}

	public int age() {
		return new test2().age();
	}

	public static void main(String args[]) {
		InnerExtendExample ie = new InnerExtendExample();
		System.out.println("获得父类Example1的方法，姓名:" + ie.name() );
		System.out.println("获得父类Example2的方法，年龄:" + ie.age());
	}
	
}