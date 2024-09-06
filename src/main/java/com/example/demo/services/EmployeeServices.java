package com.example.demo.services;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public class EmployeeServices {

//    @Autowired
//    EmployeeRepository employeeRepository;
//
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//    public Employee createEmployee(@RequestBody Map<String, String> body){
//        String name = body.get("name");
//        int salary = Integer.parseInt(body.get("salary"));
//        return employeeRepository.save(new Employee(name, salary));
//    }
}
