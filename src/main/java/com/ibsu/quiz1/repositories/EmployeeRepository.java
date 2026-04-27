package com.ibsu.quiz1.repositories;

import com.ibsu.quiz1.entities.Employee;
import com.ibsu.quiz1.entities.EmployeeSummary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Requirement 5: Interface-based projection
    List<EmployeeSummary> findAllProjectedBy();
}
