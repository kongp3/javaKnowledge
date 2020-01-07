package com.cto.edu.basic.inner;

/**
 *   匿名内部类的定义与对象的创建合并在一起，匿名内部类一般通过如下形式定义，并且在定义的同时进行对象的实例化。
     new 类或者接口的名字(){
        //匿名内部类的主体，大括号中是匿名内部类的主体，这个主体就是类或者接口的实现，
         * 如果是类，那么匿名内部类是该类的子类，
         * 如果是接口，匿名内部类需要完成接口的实现。
     }
 *
 */
public class Outter3 {
	public static void main(String[] args) {
		Person person = new Person();
		person.show(new Message() {
			public void show() {
				System.out.println("在匿名内部类中");
			}
		});

		// 比较经典的创建线程的一种方式
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("new Thread");// 输出:new Thread 2
			}
		});
		t2.start();

	}
}

class Person {
	public void show(Message message) {
		message.show();
	}
}

class Message {
	public void show() {
		System.out.println("在Message类中");
	}
}
