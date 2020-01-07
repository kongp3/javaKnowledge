package com.cto.edu.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


/**
 *  实现Callable接口
 *  1】创建Callable接口的实现类，并实现call()方法，然后创建该实现类的实例（从java8开始可以直接使用Lambda表达式创建Callable对象）。
	2】使用FutureTask类来包装Callable对象，该FutureTask对象封装了Callable对象的call()方法的返回值
	3】使用FutureTask对象作为Thread对象的target创建并启动线程（因为FutureTask实现了Runnable接口）
	4】调用FutureTask对象的get()方法来获得子线程执行结束后的返回值
 *
 */
public class CallableThreadTest implements Callable<Integer> {

	public static void main(String[] args) {
		CallableThreadTest ctt = new CallableThreadTest();
		FutureTask<Integer> ft = new FutureTask<Integer>(ctt);
		System.out.println(Thread.currentThread().getName() + "===== ");
		
		new Thread(ft, "有返回值的线程").start();
		try {
			System.out.println("子线程的返回值：" + ft.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Integer call() throws Exception {
		for (int i=0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return 20;
	}

}