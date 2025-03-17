package com.example.restexample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restexample.dto.EmployeeDto;
import com.example.restexample.entity.Employees;
import com.example.restexample.exception.Resourcenotfoundexception;
import com.example.restexample.mapper.EmployeeMapper;
import com.example.restexample.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
//@Transactional
public class EmployeeServiceImpl implements EmployeeService  {
	@Autowired
	private EmployeeRepository employeerepository;
	 public EmployeeServiceImpl(EmployeeRepository employeerepository) {
		 this.employeerepository=employeerepository;
	 }
     
     
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employees employee=EmployeeMapper.maptoemployee(employeeDto);
		Employees savedemployee=employeerepository.save(employee);
		return EmployeeMapper.maptoemployeedto(savedemployee);
	}
//	@Override
//	public EmployeeDto getemployee(Long id) {
//		
//	}


	@Override
	public EmployeeDto getemployee(Long employeeid) {
		
//		  Employees employee=EmployeeMapper.maptoemployee(employeedto); Employees
//		  getempl=employeerepository.getById(id); return
//		  EmployeeMapper.maptoemployeedto(getemply);
		 Employees employee=employeerepository.findById(employeeid).orElseThrow(()-> new Resourcenotfoundexception("Employee doesn't exist with give id :"+employeeid));
		 return EmployeeMapper.maptoemployeedto(employee); 
	}
	
	

}
