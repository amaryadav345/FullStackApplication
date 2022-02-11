package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public  String add(@RequestBody Student student){
        studentService.saveStudent(student);

        return  "Student record saved successfully";
    }
    @GetMapping("/getAll")
    public List<Student> list(){

        return studentService.getAllStudents();
    }

    @GetMapping("/greet")
    public String  greet(){
        return studentService.greetings();
    }



}
