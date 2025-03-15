package com.example.restexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restexample.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees,Long>{

}
