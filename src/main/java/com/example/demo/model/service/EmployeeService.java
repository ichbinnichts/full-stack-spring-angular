package com.example.demo.model.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.repo.EmployeeRepository;
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
