package org.employee;


public class EmployeeDetails { // block or body of the class
	
	private void empName() {
		System.out.println("Employee name : Anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	private void recentMethod() {
		System.out.println("recent code created");
	}
	
	private void empId() {
		System.out.println("emp id : 1111");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> ca556151eb1361d8ad90a690a526e6d99603cd24
	
	//main method
	public static void main(String[] args) {
		
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
		e.empMobile();
		
	}
	

}
