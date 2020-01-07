package com.cto.edu.collection.hashequal;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class EqualsTest {
	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		Set<Student> set = new HashSet<Student>();
		Student stu1 = new Student(1, "张三");
		Student stu2 = new Student(1, "张三");
		System.out.println("stu1 == stu2 : " + (stu1 == stu2));
		System.out.println("stu1.equals(stu2) : " + stu1.equals(stu2));
		list.add(stu1);
		list.add(stu2);
		System.out.println("list size:" + list.size());

		System.out.println("下面的HashSet的内容=====");
		set.add(stu1);
		set.add(stu2);
		System.out.println("set size:" + set.size());
		
		// 修改学生的年龄，hashcode的值会改变
		// 当我们将某个对象存到set中时，如果该对象的属性参与了hashcode的计算，
		// 那么以后就不能修改该对象参与hashcode计算的那些属性了，否则会引起意向不到的错误的。
		stu1.setAge(40);
		System.out.println("删除元素stu1是否成功: " + set.remove(stu1));
		System.out.println("操作删除元素后set size:" + set.size());
	}

}