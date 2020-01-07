package com.cto.edu.basic.reflect;

import java.lang.reflect.Constructor;

/* 
 * 利用反射获取构造方法测试
 * 通过Class对象可以获取某个类中的：构造方法、成员变量、成员方法；并访问成员； 
 *  
 * 1.获取构造方法： 
 *      1).批量的方法： 
 *          public Constructor[] getConstructors()：所有"公有的"构造方法 
            public Constructor[] getDeclaredConstructors()：获取所有的构造方法(包括私有、受保护、默认、公有) 
      
 *      2).获取单个的方法，并调用： 
 *          public Constructor getConstructor(Class... parameterTypes):获取单个的"公有的"构造方法： 
 *          public Constructor getDeclaredConstructor(Class... parameterTypes):获取"某个构造方法"可以是私有的，或受保护、默认、公有； 
 *       
 *          调用构造方法： 
 *          Constructor-->newInstance(Object... initargs) 
 */  
public class ConstructorsTest {  
    public static void main(String[] args) throws Exception {  
        //加载Class对象  
        Class cla = Class.forName("com.cto.edu.basic.Student");  
          
        System.out.println("**********************所有公有构造方法*********************************");  
        Constructor[] conArray = cla.getConstructors();  
        for(Constructor c : conArray){  
            System.out.println(c);  
        }  
        System.out.println();
          
          
        System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");  
        conArray = cla.getDeclaredConstructors();  
        for(Constructor c : conArray){  
            System.out.println(c);  
        }  
        System.out.println();
        System.out.println("*****************获取公有、无参的构造方法*******************************");  
//      Constructor con = cla.getConstructor();  
        Constructor con = cla.getConstructor(null);  
        //1>、因为是无参的构造方法所以类型是一个null,不写也可以：这里需要的是一个参数的类型，切记是类型  
        //2>、返回的是描述这个无参构造函数的类对象。  
        System.out.println("con = " + con);  
        
        //调用构造方法  
        Object obj = con.newInstance();  
        
        System.out.println();
        System.out.println("******************获取私有构造方法，并调用*******************************");  
        con = cla.getDeclaredConstructor(int.class);  
        System.out.println(con);  
        //调用构造方法  
        con.setAccessible(true);//暴力访问(忽略掉访问修饰符)  
        obj = con.newInstance(20);  
    }  
      
}  