package com.example.restexample.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.restexample.entity.Employees;
import com.example.restexample.dto.EmployeeDto;
import com.example.restexample.mapper.EmployeeMapper;
import com.example.restexample.service.impl.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService  employeeservice;
	//adding employee
	@PostMapping
	public ResponseEntity<EmployeeDto> createemployee(@RequestBody EmployeeDto employeedto){
		EmployeeDto savedEmployee=employeeservice.createEmployee(employeedto);
	    return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	
	//getting specific employee by id
	@GetMapping("/find/{id}")
	public ResponseEntity<EmployeeDto> getEmpById(@PathVariable("id") Long employeeid) {
	    EmployeeDto employeedto=employeeservice.getemployee(employeeid);
        return ResponseEntity.ok(employeedto);		
	}

}
