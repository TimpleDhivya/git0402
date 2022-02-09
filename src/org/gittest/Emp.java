package org.gittest;

public class Emp {
	private void empName() {
		System.out.println("dhivya");

	}
	private void empId() {
		System.out.println("1234");
	}
	
	private void empNative() {
		System.out.println("salem");
	}
	
	public static void main(String[] args) {
		Emp e = new Emp();
		e.empId();
		e.empName();
		e.empNative();
	}

}
