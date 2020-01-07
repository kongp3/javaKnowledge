package com.cto.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("beijing");
		list.add("shanghai");
		list.add("guangzhou");
		list.add("tangshan");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String item = it.next();
			if (item.equals("shanghai")) {
				it.remove();
			}
		}

		Iterator<String> it2 = list.iterator();
		while (it2.hasNext()) {
			String item = it2.next();
			System.out.println("Iterator:" + item);
		}

		
		List<String> list2 = new ArrayList<String>();
		list2.add("beijing");
		list2.add("shanghai");
		list2.add("guangzhou");
		list2.add("tangshan");
		ListIterator<String> iter = list2.listIterator();
		String first = iter.next();

		System.out.println("first:" + first);
		iter.add("tianjing");

		// 遍历List元素
		System.out.println("遍历List中元素，方法一：");
		for (String str : list2)
			System.out.println(str + "   ");

		iter = list2.listIterator();
		System.out.println("遍历List中元素，方法二：");
		while (iter.hasNext()) {
			System.out.println("下一个元素索引：" + iter.nextIndex());
			System.out.println("下一个元素：" +iter.next());
		}
	}

}