package com.cg.smms.application;

import java.time.LocalDate;

import com.cg.smms.entities.Employee;
import com.cg.smms.repository.EmployeeRepository;
import com.cg.smms.repository.IEmployeeRepository;
import com.cg.smms.service.EmployeeService;
import com.cg.smms.service.IEmployeeService;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		IEmployeeService  serviceEmp= new EmployeeService();
//		Create
//		emp.setId(504);
		emp.setName("John");
		emp.setDob(LocalDate.of(2000, 1, 1));
		emp.setSalary(10000);
		emp.setAddress("Delhi");
		emp.setDesignation("Worker");
		serviceEmp.addEmployee(emp);
		
//		search
		
		emp = serviceEmp.searchEmployee(505);
		System.out.println("ID:"+emp.getId());
		System.out.println("Name:"+emp.getName());
		
//		update
		
//		emp = serviceEmp.searchEmployee(501);
//		emp.setName("Sachin");
//		serviceEmp.updateEmployee(emp);
		
//		delete
//		serviceEmp.deleteEmployee(504);
//		System.out.println("504 Emp deleted");
		
	}

}
