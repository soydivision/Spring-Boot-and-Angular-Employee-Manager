package com.github.passmesomesugar.employee_management_system.service;

import com.github.passmesomesugar.employee_management_system.exceptions.UserNotFoundException;
import com.github.passmesomesugar.employee_management_system.model.Employee;
import com.github.passmesomesugar.employee_management_system.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User was not found,id: " + id));

    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }

}
