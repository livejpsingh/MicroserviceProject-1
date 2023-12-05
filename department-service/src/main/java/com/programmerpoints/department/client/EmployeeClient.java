package com.programmerpoints.department.client;

import com.programmerpoints.department.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {

    @GetExchange("/employee/department/{id}")
    public List<Employee> findByDepartment(@PathVariable("id") Long departmentId);


}
