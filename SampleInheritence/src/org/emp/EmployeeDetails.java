package org.emp;
import org.flip.FlipKart;

	public class EmployeeDetails extends FlipKart{
		public void empName() {
		System.out.println("Employee name : Vishali");
		}
		public void empId() {
		System.out.println("Employee Id : 79078");
		}
		public void empRole() {
		System.out.println("Employee Role : developer ");
		}
		public static void main(String[] args) {

		EmployeeDetails ed= new EmployeeDetails();
		ed.cmpName();
		ed.cmpId();
		ed.empName();
		ed.empId();
		ed.empRole();
		ed.login();
		ed.homepage();
		ed.smartphone();
		}
		}