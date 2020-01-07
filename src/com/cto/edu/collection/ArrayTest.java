package com.cto.edu.collection;

import java.util.ArrayList;
import java.util.HashMap;

// 初始化容量测试
public class ArrayTest {

	public static void main(String[] args) {
		// 打断点跟踪下
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("size = " + list.size());
		list.add("1");
		System.out.println("size = " + list.size());
		list.add("2");
		System.out.println("size = " + list.size());

		HashMap<String, String> hm = new HashMap<>();
		hm.put("1", "1234");
		System.out.println(hm.size());

	}

}
