package com.example.restexample.service.impl;

import org.springframework.stereotype.Service;

import com.example.restexample.dto.EmployeeDto;


@Service
public interface EmployeeService {
		   EmployeeDto createEmployee(EmployeeDto employeeDto);
		   EmployeeDto getemployee(Long id);
		  // EmployeeDto getemployeebyid(Long )
		

}
