package com.programmerpoints.department.controller;

import com.programmerpoints.department.client.EmployeeClient;
import com.programmerpoints.department.model.Department;
import com.programmerpoints.department.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {


    private  static  final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeClient employeeClient;

    @PostMapping
    public Department add(@RequestBody Department department) {
        LOGGER.info("Add Department ");
        return departmentRepository.addDepartment(department);
    }
    @GetMapping
    public List<Department> findAll() {
        LOGGER.info("Department find:");
        return  departmentRepository.findAll();
    }
    @GetMapping("/{id}")
    public Department findById(@PathVariable  Long id) {
        LOGGER.info("Department find: id{}",id);
        return  departmentRepository.findById(id);
    }

    @GetMapping("with-employees")
    public List<Department> findAllWithEmployee(){
     LOGGER.info("Department find");
        return departmentRepository.findAll();
        }



}
