package com.project.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.entity.employee;
import com.project.employee.services.employeeServices;

@RestController
@RequestMapping("/employees")
public class employeeController {
	 
	@Autowired
	    private employeeServices employeeService;
	
	 @PostMapping
	    public ResponseEntity<employee> addEmployee(@RequestBody employee emp) {
	        employee savedEmployee = employeeService.addEmployee(emp);
	        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	    }
	   @GetMapping
	    public ResponseEntity<List<employee>> getAllEmployees() {
	        List<employee> employees = employeeService.getAllEmployees();
	        return new ResponseEntity<>(employees, HttpStatus.OK);
	    }
	   @GetMapping("/{ohr}")
	    public ResponseEntity<employee> getEmployeeById(@PathVariable Long ohr) {
	        employee emp = employeeService.getEmployeeById(ohr);
	        return new ResponseEntity<>(emp, HttpStatus.OK);
	    }
	    @PutMapping("/{ohr}")
	    public ResponseEntity<employee> updateEmployee(@RequestBody employee emp, @PathVariable Long ohr) {
	        employee updatedEmployee = employeeService.updateemp(emp, ohr);
	        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
	    }
	    @DeleteMapping("/{ohr}")
	    public ResponseEntity<String> deleteEmployee(@PathVariable Long ohr) {
	        employeeService.deleteuser(ohr);
	        return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
	    }
}
