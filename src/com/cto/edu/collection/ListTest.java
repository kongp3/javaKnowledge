package com.cto.edu.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *  并集，交集等测试 
 */
public class ListTest {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");

		List<String> list2 = new ArrayList<String>();
		list2.add("C");
		list2.add("B");
		list2.add("D");
		
		List<String> oldList1 = new ArrayList<String>();
		oldList1.addAll(list1);
		List<String> oldList2 = new ArrayList<String>();
		oldList2.addAll(list2);
		
		List allList = new ArrayList<String>();
		// 并集
		list1.addAll(list2);
		System.out.println(list1);
		// 去重复取并集
		list2.removeAll(list1);
		System.out.println(list2);
		list2.addAll(list1);
		System.out.println(list2);
		// 交集
		oldList1.retainAll(oldList2);
		System.out.println(oldList1);
		// 差集
		list1.removeAll(list2);
		System.out.println(list1);
	}
}
