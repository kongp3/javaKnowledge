package com.cto.edu.collection.hashequal;

// 让两个对象equals方法比较相等，但hashCode值不相等
public class Student2 {
	private int age;
	private String name;
	// 静态变量，共享，目的是让hashcode每次都不一样
	private static int index = 10;

	public Student2() {
	}

	public Student2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		// index++使每次hashcode的值都不一样
		result = prime * result + (age + index++);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("hashCode :" + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}