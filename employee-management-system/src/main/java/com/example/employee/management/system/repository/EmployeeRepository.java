package com.example.employee.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.management.system.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
