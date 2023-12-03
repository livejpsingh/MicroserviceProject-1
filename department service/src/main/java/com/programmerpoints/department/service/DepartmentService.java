package com.programmerpoints.department.service;

import com.programmerpoints.department.model.Department;
import com.programmerpoints.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);

    }
}
