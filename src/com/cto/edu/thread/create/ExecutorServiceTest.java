package com.cto.edu.thread.create;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 用线程池的方式创建线程，并获得返回值
// Java线程池结合Future、Callable获得线程返回结果
public class ExecutorServiceTest {

	private final int NUMBER = 4;

	public void ExecutorService() {
		// 创建容量为NUMBER的线程池。
		ExecutorService pool = Executors.newFixedThreadPool(NUMBER);
		// 接收返回值结果
		ArrayList<Future<String>> futures = new ArrayList<Future<String>>();

		for (int i = 0; i < 10; i++) {
			// 自己的业务线程，实际工作中改成对应的业务逻辑
			AThread t = new AThread(i);
			Future<String> f = pool.submit(t);
			futures.add(f);
		}

		System.out.println("....开始获取结果中...");
		// Future的get方法在获取结果时候将进入阻塞，阻塞直到Callable中的call返回。
		for (Future<String> f : futures) {
			try {
				// if(f.isDone())
				System.out.println(f.get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(".....结束得到结果....");

		// 关闭线程池。
		pool.shutdown();
	}

	public static void main(String[] args) {
		new ExecutorServiceTest().ExecutorService();
	}

	// 业务线程
	private class AThread implements Callable<String> {

		// 可做为参数传过来
		private int id;

		public AThread(int id){
			this.id = id;
		}

		@Override
		public String call() {
			// 执行相应的逻辑
			System.out.println("线程:" + id + " 运行..");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("线程:" + id + " -> 结束.");
			return "返回的字符串" + id;
		}
	}
}