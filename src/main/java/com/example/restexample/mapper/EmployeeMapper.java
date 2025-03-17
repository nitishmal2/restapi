package com.example.restexample.mapper;

import com.example.restexample.dto.EmployeeDto;
import com.example.restexample.entity.Employees;

public class EmployeeMapper {
	public static EmployeeDto maptoemployeedto(Employees employee) {
		return new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail()
				);
	}
	public static Employees maptoemployee(EmployeeDto employeedto) {
		return new Employees (
				employeedto.getId(),
				employeedto.getFirstName(),
				employeedto.getLastName(),
				employeedto.getEmail()
				);
	}

}
