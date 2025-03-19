package com.example.employee.management.system.service;


import com.example.employee.management.system.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee emp);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(int id, Employee emp);
    void deleteEmployee(int id);
}

