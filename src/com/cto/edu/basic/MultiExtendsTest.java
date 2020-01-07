package com.cto.edu.basic;

// 测试间接的实现多继承
public class MultiExtendsTest extends D implements A, B, C {

	@Override
	public void work() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		MultiExtendsTest m = new MultiExtendsTest();
		m.show();
	}

}

interface A {
	public void eat();
}

interface B {
	public void sleep();
}

interface C {
	public void work();
}

class D{
	public void show(){
		System.out.println("===show===");
	}
}
