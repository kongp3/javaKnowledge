package com.cto.edu.io;

/**
 * ，一个类的对象要想序列化成功，必须满足两个条件：
    该类必须实现 java.io.Serializable 对象。
    该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
 *
 */
public class Employee implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1711416842377499978L;
	
	public String name;
	public String address;
	public transient int SSN; // 注意这个，用transient关键字标记的成员变量不参与序列化过程
	public int number;

	public void mailCheck() {
		System.out.println("mail a check to " + name + " " + address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}