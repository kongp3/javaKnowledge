package com.cto.edu.thread;

/**
 * 存在两个线程：主线程和线程t
   Join，这里所说的调用方就是主线程，主线程调用线程t的Join方法，导致主线程阻塞，
      直到t线程执行完毕，才返回到主线程中。
      简单理解，在主线程中调用t.Join()，也就是在主线程中加入了t线程的代码，
      必须让t线程执行完毕之后，主线程（调用方）才能正常执行。
 *
 */
public class JoinThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(){
			@Override
			public void run() {
				for(int i =0;i<100;i++){
					System.out.println("a:" + i);
				}
			}
		};
		t.start();
		
		bmethod();
		// 注意观察执行顺序
		t.join();
		cmethod();

	}
	
	public static void bmethod(){
		System.out.println(":bmethod:");
	}
	
	public static void cmethod(){
		System.out.println(":cmethod:");
	}

}
