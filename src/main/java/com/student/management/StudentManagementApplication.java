package com.student.management;

import com.student.management.entity.Student;
import com.student.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Ram", "singh", "ram444@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Rishu", "pandey", "rishu@gmail.com");
//		studentRepository.save(student2);
	}
}
