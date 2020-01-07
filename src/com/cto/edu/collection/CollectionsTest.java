package com.cto.edu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsTest {
	public static void main(String[] args) {
		ArrayList nums = new ArrayList();
		nums.add(8);
		nums.add(-3);
		nums.add(2);
		nums.add(9);
		nums.add(-2);
		
		System.out.println("集合是否为空：" + nums.isEmpty());
		
		System.out.println("默认顺序：" + nums);
		Collections.reverse(nums);
		System.out.println("反转后顺序：" + nums);
		
		Collections.sort(nums);
		System.out.println("排序后顺序：" + nums);
		
		Collections.shuffle(nums);
		System.out.println("混淆后顺序：" + nums);
		// 下面只是为了演示定制排序的用法，将int类型转成string进行比较
		Collections.sort(nums, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String s1 = String.valueOf(o1);
				String s2 = String.valueOf(o2);
				return s1.compareTo(s2);
			}

		});
		System.out.println("指定排序后顺序：" + nums);
		System.out.println("最大的值是：" + Collections.max(nums));
		System.out.println("最小的值是：" + Collections.min(nums));
	}
}