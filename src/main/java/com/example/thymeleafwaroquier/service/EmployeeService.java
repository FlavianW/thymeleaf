package com.example.thymeleafwaroquier.service;

import com.example.thymeleafwaroquier.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Long id);
} 