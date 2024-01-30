package com.project.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.employee.Repository.employeeRepository;
import com.project.employee.entity.employee;
import com.project.employee.globalexception.usernotfoundexception;

@Service
public class employeeServices {
	@Autowired
	private employeeRepository employeeRepo;
	
	 public employee addEmployee(employee emp) {
	        return employeeRepo.save(emp);
	    }
	 public List<employee> getAllEmployees() {
	        return employeeRepo.findAll();
	    }
	 public employee getEmployeeById(long ohr) {
	        return employeeRepo.findById(ohr)
	        		.orElseThrow(()->new usernotfoundexception("USER NOT FOUND"+ohr));
	    }
	 public employee updateemp(employee emp, Long ohr) {
		 employee exemp=employeeRepo.findById(ohr)
				 .orElseThrow(()->new usernotfoundexception("USER NOT FOUND"+ohr));
		 exemp.setName(emp.getName());
		 exemp.setDesignation(emp.getDesignation());
		 exemp.setLocation(emp.getLocation());
		 return employeeRepo.save(exemp);
	 }
	 public void deleteuser(Long ohr) {
		 employeeRepo.deleteById(ohr);
	 }
}
