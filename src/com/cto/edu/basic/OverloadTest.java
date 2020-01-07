package com.cto.edu.basic;

// 重载(Overload)测试
public class OverloadTest{
	
	public void queryUser(int id) {
	}

	public int queryUser(String name) {
		return 1;
	}
	
	public void queryUser(int id,String name) {
	}

}
