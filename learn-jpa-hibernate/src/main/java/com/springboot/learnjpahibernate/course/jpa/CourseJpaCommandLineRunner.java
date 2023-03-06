//package com.springboot.learnjpahibernate.course.jpa;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import com.springboot.learnjpahibernate.course.jpa.Course;
//
//@Component
//public class CourseJpaCommandLineRunner implements CommandLineRunner {
//
//	@Autowired
//	private CourseJpaRepository repository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		//repository.insert();
//		repository.insert(new Course(1, "Learn AWS JPA", "in28minutes"));
//		repository.insert(new Course(2, "Learn AZURE JPA", "in28minutes"));
//		repository.insert(new Course(3, "Learn DEVOPS JPA", "in28minutes"));
//		
//		repository.deleteById(1);
//		
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
//		
//	}
//
//}
