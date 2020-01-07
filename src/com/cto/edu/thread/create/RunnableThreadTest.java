package com.cto.edu.thread.create;

// 实现runnable接口
public class RunnableThreadTest implements Runnable {

	public void run() {
		System.out.println("run:" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		System.out.println("main:"+ Thread.currentThread().getName());
		RunnableThreadTest rt = new RunnableThreadTest();
		new Thread(rt, "线程1").start();

		// 用内部类的方式创建线程，实现runnable接口
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 0; x < 10; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}).start();
	}

}