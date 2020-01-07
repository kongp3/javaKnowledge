package com.cto.edu.collection;

import java.util.HashSet;
import java.util.Iterator;

// Set的使用(不允许有重复的对象),可以是null,但只能放入一个null
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		String a = new String("A");
		String b = new String("B");
		String E = new String("E");
		String F = new String("F");
		String c = new String("B");
		String h = null;
		String i = null;
		hashSet.add(a);
		hashSet.add(b);
		hashSet.add(E);
		hashSet.add(F);
		hashSet.add(h);
		hashSet.add(i);
		System.out.println("hashSet得长度：" + hashSet.size());
		
		// 元素B已经存在，插入时不在插入
		String cz = hashSet.add(c) ? "此对象不存在" : "已经存在";
		System.out.println("测试是否可以添加对象: " + cz);
		
		// 测试其中是否已经包含某个对象
		System.out.println("hashSet中包含A：" + hashSet.contains("A"));
		Iterator<String> iter = hashSet.iterator();
		while (iter.hasNext()) {
			System.out.println("hashSet中的元素：" + iter.next());
		}
		// 测试某个对象是否可以删除
		System.out.println("删除不存在的元素e:" + hashSet.remove("e"));
		System.out.println("删除存在的元素E:" + hashSet.remove("E"));
		System.out.println();
		// 如果你想再次使用iter变量,必须重新更新,重新获取
		iter = hashSet.iterator();
		while (iter.hasNext()) {
			System.out.println("删除存在的元素E后:" + iter.next());
		}
	}
}