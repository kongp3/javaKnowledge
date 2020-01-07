package com.cto.edu.collection.generic;

// 测试有界的类型参数
public class MaximumTest {
	// 比较三个值并返回最大值
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // 假设x是初始最大值
		if (y.compareTo(max) > 0) {
			max = y; // y 更大
		}
		if (z.compareTo(max) > 0) {
			max = z; // 现在 z 更大
		}
		return max; // 返回最大对象
	}

	public static void main(String args[]) {
		System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n", 3, 4, 5, maximum(3, 4, 5));
		
		// 如果不实现Comparable接口的类调用方法，编译就会报错了
		System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n", 3, 4, 5, maximum(new User(3,""),new User(4,""), new User(5,"")).getAge());

		System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

		System.out.printf("%s, %s 和 %s 中最大的数为 %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
	}
}

class User implements Comparable<User>{
	
	private Integer age;
	private String name;
	
	public User(Integer age,String name){
		this.age = age;
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(User o) {
		return this.age.compareTo(o.age);
	}
}