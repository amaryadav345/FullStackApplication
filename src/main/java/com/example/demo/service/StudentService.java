package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    public int saveStudent(Student student);
    public List<Student> getAllStudents();
    public String greetings();
    public Student getByID(int id);
    public int updateStudent(Student student,int id);
}
