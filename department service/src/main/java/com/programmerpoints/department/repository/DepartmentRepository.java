package com.programmerpoints.department.repository;

import com.programmerpoints.department.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
