package com.cto.edu.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试创建线程池的使用
 */
public class ThreadPoolExecutorTest {

	public static void main(String[] args) {

		// 创建一个可缓存线程池，如果线程池长度超过处理需要，
		// 可灵活回收空闲线程，若无可回收，则新建线程。
		// ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		// for (int i = 0; i < 10; i++) {
		// final int index = i;
		// try {
		// Thread.sleep(index * 1000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// cachedThreadPool.execute(new Runnable() {
		// public void run() {
		// System.out.println("index:" + index);
		// }
		//
		// });
		// }
		// cachedThreadPool.shutdown();

		// //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
		// ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		// for (int i = 0; i < 10; i++) {
		// final int index = i;
		// fixedThreadPool.execute(new Runnable() {
		// public void run() {
		// try {
		// // 因为线程池大小为3，每个任务输出index后sleep 2秒，所以每两秒打印3个数字。 //
		// // 定长线程池的大小最好根据系统资源进行设置。如Runtime.getRuntime().availableProcessors()
		// System.out.println("index:" + index);
		// Thread.sleep(2000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// }
		// });
		// }
		// fixedThreadPool.shutdown();

		// // 表示延迟1秒后每3秒执行一次。
//		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
//		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
//			public void run() {
//				System.out.println("delay 1 seconds, and excute every 3 seconds");
//			}
//		}, 1, 3, TimeUnit.SECONDS);
//		scheduledThreadPool.shutdown();

		// 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，相当于顺序执行各个任务
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			singleThreadExecutor.execute(new Runnable() {
				public void run() {
					try {
						System.out.println("index:" + index);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
		singleThreadExecutor.shutdown();

	}

}