package com.cto.edu.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// 反序列化文件到对象
public class DeserializeDemo {
	public static void main(String[] args) {
		Employee e = null;
		try {
			FileInputStream fileIn = new FileInputStream("./employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			// 从流中取出下一个对象，并将对象反序列化
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
		// 当对象被序列化时，属性 SSN 的值为11233，但是因为该属性是短暂的，
		// 该值没有被发送到输出流。所以反序列化后 Employee 对象的 SSN 属性为 0。
		System.out.println("SSN: " + e.SSN);
		System.out.println("Number: " + e.number);
	}
}