package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class AdminController {
    @Autowired
    AdminRepository adminRepository;
    @GetMapping("/")
    public Iterable<Employee> getEmployee(){
        return adminRepository.findAll();
    }
}
