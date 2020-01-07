package com.cto.edu.basic;

public class Student {
	
	private String id;
	
	public String name;
	
	private int age;
	
	private String tellphone;
	
	private String email;
	
	private int score; // 成绩
	
	
    //无参构造方法  
    public Student(){  
        System.out.println("调用了公有、无参构造方法执行了。。。");  
    }  
      
    //有一个参数的构造方法  
    public Student(String name){  
        System.out.println("姓名：" + name);  
    }  
      
    //有多个参数的构造方法  
    public Student(String name ,int age){  
        System.out.println("姓名："+name+"年龄："+ age);//这的执行效率有问题，以后解决。  
    }  
      
    //受保护的构造方法  
    protected Student(int id,int age){  
        System.out.println("受保护的构造方法 id = " + id + ",age:" + age);  
    }  
      
    //私有构造方法  
    private Student(int age){  
        System.out.println("私有的构造方法 ,年龄："+ age);  
    }  
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(20);
		s.setName("zhangsan");
		System.out.println(s.getAge() + "," + s.getName() + "," +  s.age);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTellphone() {
		return tellphone;
	}

	public void setTellphone(String tellphone) {
		this.tellphone = tellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
