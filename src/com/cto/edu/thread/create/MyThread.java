package com.cto.edu.thread.create;

//继承Thread类
public class MyThread extends Thread {

	@Override
	public void run() {
		  System.out.println(getName());    
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			new MyThread().start();
		}
		
		//  内部类 方式
		new Thread(){
			@Override
			public void run() {
				for (int x = 0; x < 10; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}.start();
	}
    
}
