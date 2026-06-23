package com.example.demo.service;


import com.example.demo.entity.department;
import com.example.demo.repository.departmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class departmentService {

    @Autowired
    private departmentRepository repository;


    // GET ALL
    public List<department> getAllDepartments() {
//        return repository.findAll();
       List<department> ff=new ArrayList<>();
       return ff;
    }

}
