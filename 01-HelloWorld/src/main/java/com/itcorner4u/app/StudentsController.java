package com.itcorner4u.app;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {
	
	@RequestMapping("/getData")
	public String getMessage() {
		return "Hi, Welcome to my session!";
	}
	
//	@RequestMapping(value = "/getEmployee", produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//	public Employee getEmployee(@RequestParam(name="id") int empID, @RequestParam String name, @RequestParam(name = "salary") int empSalary) {
//		Employee employee = new Employee();
//			employee.setEmpID(empID);
//			employee.setName(name);
//			employee.setSalary(empSalary);
//		return employee;
//	}
	
	@RequestMapping(value = "/getEmployee/{userID}/{name}/test/{salary}", produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Employee getEmployee(@RequestBody Employee payload, @PathVariable("userID") int empID, @PathVariable String name, @PathVariable("salary") int empSalary) {
		
		System.out.println("Name: "+payload.getName());
		
		Employee employee = new Employee();
			employee.setEmpID(empID);
			employee.setName(name);
			employee.setSalary(empSalary);
			
			Address address = new Address();
			address.setState("CA");
			address.setStreet("Street 101");
			address.setZip("123");
			
			employee.setAddress(address);
			
		return employee;
	}
	
	
}
