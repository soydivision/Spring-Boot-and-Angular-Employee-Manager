package com.github.passmesomesugar.employee_management_system.repo;

import com.github.passmesomesugar.employee_management_system.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {



}
