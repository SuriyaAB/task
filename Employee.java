package org.test;

public class Employee {
	static Employee e;
	public static Employee getInstance() {
	if (e==null) {
		e=new Employee();//obj create
	}
	System.out.println(System.identityHashCode(e));
	return e;
	}
	public void empId() {
	System.out.println("123");
	}
	public void empName() {
		System.out.println("Abi");
	}
	public static void main(String[] args) {
	Employee e=getInstance();
	Employee e1 = new Employee();
	e.empId();
	e.empName();
	}
	

}
