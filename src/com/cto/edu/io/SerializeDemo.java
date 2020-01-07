package com.cto.edu.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// 序列化保存对象到文件
public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "zhangsan";
		e.address = "beijing haidian";
		e.SSN = 11233;
		e.number = 10;
		try {
			FileOutputStream fileOut = new FileOutputStream("./employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			// 序列化一个对象，并将它发送到输出流
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized object is saved in ./employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}