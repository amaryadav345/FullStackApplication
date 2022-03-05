package com.example.demo.service;


import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int saveStudent(Student student){
        return jdbcTemplate.update("insert into student (name,last_name,gender) values (?,?,?)",new Object[]{student.getName(),student.getLastName(),student.getGender()});
       // return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents(){
        return jdbcTemplate.query("SELECT * FROM student",new BeanPropertyRowMapper<Student>(Student.class));
    }

 /*   public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }*/

    @Override
    public String greetings(){
        return "Hello Amar";
    }

    @Override
    public Student getByID(int id) {

        return jdbcTemplate.queryForObject("select * from Student where id=?",new BeanPropertyRowMapper<Student>(Student.class),id);
    }

    @Override
    public int updateStudent(Student student,int id){

        return jdbcTemplate.update("update student set gender=? where id=? ",new Object[]{student.getGender(), id });
    }


}
