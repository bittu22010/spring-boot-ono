package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringStudentappOnetooneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentappOnetooneApplication.class, args);
	}
    private IStudentService studentService;
    @Autowired
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public void run(String... args) throws Exception {
		Address address = new Address("Sasaram","Karghar");
		Student student = new Student ("Bittu", "CSE", address);
		studentService.addStudent(student);
		
	}

}
