package com.example.employee.management.system.service;


import org.springframework.stereotype.Service;

import com.example.employee.management.system.model.Employee;
import com.example.employee.management.system.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee addEmployee(Employee emp) {
        return repository.save(emp);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee updateEmployee(int id, Employee emp) {
        Employee existingEmp = repository.findById(id).orElse(null);
        if (existingEmp != null) {
            existingEmp.setName(emp.getName());
            existingEmp.setEmail(emp.getEmail());
            existingEmp.setDepartment(emp.getDepartment());
            return repository.save(existingEmp);
        }
        return null;
    }

    @Override
    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}
