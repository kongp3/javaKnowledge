package com.cto.edu.basic;

/**
 * 可见性测试
 * public：修饰的成员可以在任何范围内直接访问，只是一种最宽松的访问控制等级。
 * 需要注意的，所谓的直接访问仍需要先创建或获得一个相应类的对象然后才可以使用”对象名.成员“的方式访问其属性或调用其方法，
 * 但是出于信息封装和隐藏的需要一般不提倡把成员声明为public的，而构造方法和需要外界直接调用的普通方法则适合声明为public.
 * 
   protected：修饰的成员可以在其所在类中、同一包中及子类中（无论子类在不在同一个包）被直接访问，
      但不能在位于不同包中的非子类中被直接访问，这里需要特别声明：在位于不同包的子类中必须是子类的对象才能直接访问其父类的protected成员，
      而父类自身的对象反而不能访问其所在类中声明的protected成员。
   
   default：缺省访问修饰符的成员只能在其所在类中或包中直接访问，在不同包中即使是不同包的子类也不能直接访问。
   private：成员只能在所在类中被直接访问，是4种访问等级最高的一个。
 *
 */
public class VisibilityTest  extends Person{
	
	public void visibility(){
		this.getName();
	}

	public static void main(String[] args) {
		
		Person p = new Person();
		p.getName();
	}

}
