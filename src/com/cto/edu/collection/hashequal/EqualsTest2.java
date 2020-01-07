package com.cto.edu.collection.hashequal;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

// 测试让两个对象equals方法比较相等，但hashCode值不相等
public class EqualsTest2 {
	public static void main(String[] args) {
		LinkedList<Student2> list = new LinkedList<Student2>();
		Set<Student2> set = new HashSet<Student2>();
		Student2 stu1 = new Student2(1, "张三");
		Student2 stu2 = new Student2(1, "张三");
		System.out.println("stu1 == stu2 : " + (stu1 == stu2));
		// 如果不在容器中，就是看对应的equals方法是否相等，与hashcode()没关系
		System.out.println("stu1.equals(stu2) : " + stu1.equals(stu2));
		list.add(stu1);
		list.add(stu2);
		System.out.println("list size:" + list.size());
		
		// 必须是在hash容器中先hashCode()，如果hashCode()相同，再用equals()验证，
		// 如果hashCode()都不同，则肯定不同
		System.out.println("下面的HashSet的内容=====");
		set.add(stu1);
		set.add(stu2);
		System.out.println("set size:" + set.size());
	}

}