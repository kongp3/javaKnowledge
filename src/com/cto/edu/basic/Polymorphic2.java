package com.cto.edu.basic;

/**
 * 测试多态
 * 只有类的方法才有多态的概念，类中成员变量没有多态的概念
 * 成员变量的取值不取决于创建对象的类型，取决于所定义变量的类型，是在编译时确定的。
 *
 */
public class Polymorphic2 {
	public static void main(String[] args) {
		show(new Animal2()); // 以 Animal2 对象调用 show 方法
		show(new Cat2()); // 以 Cat2 对象调用 show 方法
		show(new Dog2()); // 以 Dog2 对象调用 show 方法

		System.out.println("======================");
		Animal2 a = new Cat2(); // 向上转型,父类引用指向子类对象
		System.out.println(a.name); // 成员变量是无法实现多态的
		a.eat(); // 调用的是 Cat2 的 eat
		Cat2 c = (Cat2) a; // 向下转型
		c.work(); // 调用的是 Cat2 的 work
	}

	public static void show(Animal2 a) {
		a.eat();
		// 类型判断
		if (a instanceof Cat2) { // 猫做的事情
			Cat2 c = (Cat2) a;
			c.work();
		} else if (a instanceof Dog2) { // 狗做的事情
			Dog2 c = (Dog2) a;
			c.work();
		}
	}
}

class Animal2 {
  public String name = "Animal2 name";
  void eat(){
	  System.out.println(name);
  };
}

class Cat2 extends Animal2 {
	public String name = "cat2 name";
	public void eat() {
		System.out.println(name);
		System.out.println("吃鱼");
	}

	public void work() {
		System.out.println("抓老鼠");
	}
}

class Dog2 extends Animal2 {
	public void eat() {
		System.out.println("吃骨头");
	}

	public void work() {
		System.out.println("看家");
	}
}