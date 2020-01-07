package com.cto.edu.collection.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 有些对象本身就已经支持自比较，如 String、Integer，Float、Double等
public class ComparableDefaultImpl {

	public static void main(String[] args) {
		int[] intArray = { 13, 35, 0, 4, -17, 9, 1, 3 };
		// 直接依据int值的大小来排序的
		Arrays.sort(intArray);
		System.out.println("下面是Arrays.sort排序");
		for (int i = 0; i < intArray.length; i++){
			System.out.println(intArray[i]);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(10);
		list.add(-2);
		list.add(-29);
		list.add(5);
		list.add(87);
		list.add(12);
		list.add(452);
		Collections.sort(list);
		System.out.println("下面是Collections.sort排序");
		for(Integer i : list){
			System.out.println(i);
		}
		
	}

}
