package com.github.passmesomesugar.employee_management_system.repo;

import com.github.passmesomesugar.employee_management_system.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
