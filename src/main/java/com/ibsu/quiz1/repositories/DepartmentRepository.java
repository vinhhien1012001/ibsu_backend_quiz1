package com.ibsu.quiz1.repositories;

import com.ibsu.quiz1.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Requirement 4 JOINT FETCH all Departments
    @Query("SELECT d FROM departments d LEFT JOIN FETCH d.employees ")
    List<Department> findAllWithEmployees();
}
