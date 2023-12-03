package com.programmerpoints.department.controller;

import com.programmerpoints.department.model.Department;
import com.programmerpoints.department.service.DepartmentService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {



    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
        public Department saveDepartment(Department department){

            return departmentService.saveDepartment(department);
        }


}
