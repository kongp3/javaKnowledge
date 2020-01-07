package com.cto.edu.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 测试TreeSet存储自定义对象，并对对象排序的两种方式
 */
public class TreeSetStudentTest {

	public static void main(String[] args) {
		System.out.println("下面是元素实现Comparable接口=====");
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(new Student("zhangsan01", 25));
		ts.add(new Student("zhangsan02", 21));
		ts.add(new Student("zhangsan03", 18));
		ts.add(new Student("zhangsan04", 26));
		ts.add(new Student("zhangsan04", 27));
		ts.add(new Student("zhangsan04", 27));
		ts.add(new Student("zhangsan05", 50));

		Iterator<Student> it = ts.iterator();
		while (it.hasNext()) {
			Student stu = (Student) it.next();
			System.out.println("姓名：" + stu.getName() + " 年龄：" + stu.getAge());
		}
		
		
		System.out.println("下面是用自定义比较器类来实现比较的=====");
		TreeSet<Student> tsc = new TreeSet<Student>(new MyCompare());
		tsc.add(new Student("zhangsan01", 25));
		tsc.add(new Student("zhangsan02", 21));
		tsc.add(new Student("zhangsan03", 18));
		tsc.add(new Student("zhangsan04", 26));
		tsc.add(new Student("zhangsan04", 27));
		tsc.add(new Student("zhangsan04", 27));
		tsc.add(new Student("zhangsan05", 50));
		
		Iterator<Student> itc = tsc.iterator();
		while (itc.hasNext()) {
			Student stu = (Student) itc.next();
			System.out.println("姓名：" + stu.getName() + " 年龄：" + stu.getAge());
		}

	}

}

class Student implements Comparable<Object> {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
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
        System.out.println("hashCode : "+ result);  
        return result;  
    }  

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Object obj) {
		if (!(obj instanceof Student))
			throw new RuntimeException("不是学生对象");

		// 先按照年龄，之后看名称
		Student stu = (Student) obj;
		if (this.age > stu.age)
			return 1;
		if (this.age == stu.age)
			return this.name.compareTo(stu.name);
		return -1;
	}
}

// 自定义比较类
class MyCompare implements Comparator<Object>   {  
    public int compare(Object o1,Object o2) {  
        Student s1 = (Student) o1;  
        Student s2 = (Student) o2;  
        // 先按名称，之后看年龄
        int num = s1.getName().compareTo(s2.getName());  
        if( num == 0 )  
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));  
        return num;  
    }  
}  