package org.employee;


public class EmployeeDetails { // block or body of the class
	
	private void empName() {
		System.out.println("Employee name : Anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	//main method
	public static void main(String[] args) {
		
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
		e.empMobile();
		
	}
	

}
