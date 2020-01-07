package com.cto.edu.thread;

// 测试启动一个线程Thread是用run()还是start()? 注意观察执行顺序
public class ThreadTest {
	
	public static void main(String[] args) {
		Runner1 runner1 = new Runner1();
		Runner2 runner2 = new Runner2();
		// 分配新的 Thread 对象。
		Thread thread1 = new Thread(runner1);
		Thread thread2 = new Thread(runner2);
		
		// 注意观察执行顺序
		System.out.println("start time:" + System.currentTimeMillis());
		thread1.start(); // 执行start，thread1与thread2交叉执行
		thread2.start();
//		thread1.run(); //执行run，thread1与thread2顺序执行
//		thread2.run();
		System.out.println("end time:" + System.currentTimeMillis());

	}
}

// 实现了Runnable接口，jdk就知道这个类是一个线程
class Runner1 implements Runnable {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("进入Runner1运行状态:" + i);
		}
	}
}

//实现了Runnable接口，jdk就知道这个类是一个线程
class Runner2 implements Runnable { 
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("进入Runner2运行状态:" + i);
		}
	}
}