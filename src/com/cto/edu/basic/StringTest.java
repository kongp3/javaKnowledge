package com.cto.edu.basic;

public class StringTest {
	public static void main(String[] args) {
		String name = " 2344,dsfsdf";
		System.out.println(name);
		System.out.println(name.trim()); // 去除空字符串
		System.out.println(name.concat("ddd")); // 连接字符串
		
		System.out.println(name.toUpperCase()); // 转换成大写字符串
		System.out.println(name.toLowerCase()); // 转换成小写字符串
		System.out.println(name.length()); // 获得字符串的长度
		System.out.println(name.charAt(5)); // 从字符串中取出指定位置的字符
		System.out.println(name.substring(0, name.length())); //截取字符串 
		String[] s = name.split(","); // 按照指定字符分割 
		for(String st: s){
			System.out.println(st);
		}
		System.out.println(name.contains("44"));// 看是否包含指定的字符串
	}
}
