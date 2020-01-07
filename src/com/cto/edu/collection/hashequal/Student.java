package com.cto.edu.collection.hashequal;

// 学生类  
public class Student {
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
        System.out.println("hashCode : "+ result);  
        return result;  
    }     
}