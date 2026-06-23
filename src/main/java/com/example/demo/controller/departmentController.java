package com.example.demo.controller;


import com.example.demo.entity.department;
import com.example.demo.service.departmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/department")
@CrossOrigin
public class departmentController {


    @Autowired
    private departmentService service;

    // ✅ GET ALL
    @GetMapping
    public ResponseEntity<List<department>> getAlldepartments() {
        List<department> list = service.getAllDepartments();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/chat")
    public String chat(
            @RequestParam(required = false) MultipartFile file,
            @RequestParam(required = false) String message)
    {
        if (file != null) {
            System.out.println(file.getOriginalFilename());
        }

        System.out.println(message);

        return "Migration analysis started...";
    }

}
