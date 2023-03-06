//package com.springboot.learnjpahibernate.course.jdbc;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CourseJdbcCommandLineRunner implements CommandLineRunner {
//
//	@Autowired
//	private CourseJdbcRepository repository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		//repository.insert();
//		repository.insert(new Course(1, "Learn AWS Now", "in28minutes"));
//		repository.insert(new Course(2, "Learn AZURE Now", "in28minutes"));
//		repository.insert(new Course(3, "Learn DEVOPS Now", "in28minutes"));
//		
//		repository.delete(1);
//		
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
//		
//	}
//	
//	
//
//}
