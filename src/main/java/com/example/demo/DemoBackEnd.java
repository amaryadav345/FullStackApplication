package com.example.demo;



import com.example.demo.service.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBackEnd {

	public static void main(String[] args) {
		SpringApplication.run(DemoBackEnd.class, args);

		System.out.println("Sample Program started");


	//	StudentServiceImpl studentServiceimpl = new StudentServiceImpl();

	//	System.out.println("Student data is "+ studentServiceimpl.getAllStudents());
	}

}
