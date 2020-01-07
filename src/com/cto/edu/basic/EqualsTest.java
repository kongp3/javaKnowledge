package com.cto.edu.basic;

// "=="和equals测试
public class EqualsTest {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 2;
		System.out.println(a == b); // true
		System.out.println(a == c); // false
		
		String s1 = new String("str"); 
		String s2 = new String("str"); 
		
		System.out.println("s1 == s2: " + (s1 == s2)); // false,比较的是内存地址，引用
		System.out.println("s1 equals s2: " + (s1.equals(s2))); // true
		
		// 对象的比较一般重写equals和hashcode方法
		Student stu1 = new Student(1, "张三");
		Student stu2 = new Student(1, "张三");
		System.out.println("stu1 == stu2 : " + (stu1 == stu2)); // false
		System.out.println("stu1.equals(stu2) : " + stu1.equals(stu2)); // true
	}
	
	static class Student {
		private int age;
		private String name;

		public Student() {
		}

		public Student(int age, String name) {
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
		
		/**
		 * 年龄和名称都相等的时候
		 */
		@Override  
	   public boolean equals(Object obj) {  
	       if (this == obj)  
	           return true;  
	       if (obj == null)  
	           return false;  
	       if (getClass() != obj.getClass())  
	           return false;  
	       Student other = (Student) obj;  
	       if (age != other.age)  
	           return false;  
	       if (name == null) {  
	           if (other.name != null)  
	               return false;  
	       } else if (!name.equals(other.name))  
	           return false;  
	       return true;  
	   }  
		
		@Override  
	   public int hashCode() {
	       final int prime = 31;  
	       int result = 1;  
	       result = prime * result + age;  
	       result = prime * result + ((name == null) ? 0 : name.hashCode());  
	       return result;  
	   }     
	}
	
    
}


