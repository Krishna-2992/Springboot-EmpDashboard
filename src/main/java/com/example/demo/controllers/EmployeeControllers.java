package com.example.demo.controllers;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class EmployeeControllers {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(path="/")
    public String checkWorking() {
        return "working";
    }

    @GetMapping(path="/employee")
    public List<Employee> index() {
        return employeeRepository.findAll();
    }

    @PostMapping(path="/employee")
    public Employee create(@RequestBody Map<String, String> body){
        String name = body.get("name");
        int salary = Integer.parseInt(body.get("salary"));
        return employeeRepository.save(new Employee(name, salary));
    }

    @PostMapping(path="/employee/{id}")
    public Optional<Employee> getAllEmployeeById(@PathVariable String id) {
        int empId = Integer.parseInt(id);
        return employeeRepository.findById(empId);
    }
}
