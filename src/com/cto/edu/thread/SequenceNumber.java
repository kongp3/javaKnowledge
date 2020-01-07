package com.cto.edu.thread;

import java.util.concurrent.atomic.AtomicInteger;

// 测试ThreadLocal方法及使用示例
public class SequenceNumber {
	
	 private static final AtomicInteger uniqueId = new AtomicInteger(0);
	 
	 private  int i =0;

	 public int getCurrentThreadId() {
         return uniqueId.incrementAndGet();
     }
	 
	 // 和使用synchronized的方式的区别
	 public synchronized int getCurrentThreadIdSync() {
         return ++i;
     }
	 
	 
	// 通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
		public Integer initialValue() {
			return 0;
		}
	};

	// 获取下一个序列值
	public int getNextNum() {
		seqNum.set(seqNum.get() + 1);
		return seqNum.get();
	}

	public static void main(String[] args) {
		SequenceNumber sn = new SequenceNumber();

		// 3个线程共享sn，各自产生序列号
		TestClient t1 = new TestClient(sn);
		TestClient t2 = new TestClient(sn);
		TestClient t3 = new TestClient(sn);
		t1.start();
		t2.start();
		t3.start();
	}

	private static class TestClient extends Thread {
		private SequenceNumber sn;

		public TestClient(SequenceNumber sn) {
			this.sn = sn;
		}

		public void run() {
			// 每个线程打出3个序列值
			for (int i = 0; i < 30; i++) {
//				System.out.println("thread[" + Thread.currentThread().getName() + "] sn[" + sn.getNextNum() + "]");
//				System.out.println("thread getCurrentThreadId[" + Thread.currentThread().getName() + "] sn[" + sn.getCurrentThreadId() + "]");
				System.out.println("thread getCurrentThreadIdSync[" + Thread.currentThread().getName() + "] sn[" + sn.getCurrentThreadIdSync() + "]");
			}
		}
	}
}