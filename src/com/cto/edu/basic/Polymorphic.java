package com.cto.edu.basic;

// 测试多态
public class Polymorphic{
	public static void main(String[] args) {
		show(new Cat()); // 以 Cat 对象调用 show 方法
		show(new Dog()); // 以 Dog 对象调用 show 方法

		System.out.println("======================");
		Animal a = new Cat(); // 向上转型,父类引用指向子类对象
		a.eat(); // 调用的是 Cat 的 eat
		Cat c = (Cat) a; // 向下转型
		c.work(); // 调用的是 Cat 的 work
	}

	public static void show(Animal a) {
		a.eat();
		// 类型判断
		if (a instanceof Cat) { // 猫做的事情
			Cat c = (Cat) a;
			c.work();
		} else if (a instanceof Dog) { // 狗做的事情
			Dog c = (Dog) a;
			c.work();
		}
	}
}

abstract class Animal {
	abstract void eat();
	
	void sleep(){
		System.out.println("sleep==============");
	}
}

class Cat extends Animal {
	public String name = "cat name";
	public void eat() {
		System.out.println(name);
		System.out.println("吃鱼");
	}

	public void work() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("吃骨头");
	}

	public void work() {
		System.out.println("看家");
	}
}