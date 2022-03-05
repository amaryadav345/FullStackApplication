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

    @GetMapping("/getByID/{id}")
    public Student getStudentById(@PathVariable int id){
         return  studentService.getByID(id);

        //return "Student Record fetched successfully";
    }

    @PutMapping("/updStud/{id}")
    public String updateStudentData(@RequestBody Student student,@PathVariable int id){
        return "Updated records count is "+studentService.updateStudent(student,id);
    }


}
