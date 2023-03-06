package com.springboot.learnjpahibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.springboot.learnjpahibernate.course.springdatajpa.Course;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		//repository.insert();
		repository.save(new Course(1, "Learn AWS JPA", "in28minutes"));
		repository.save(new Course(2, "Learn AZURE JPA", "in28minutes"));
		repository.save(new Course(3, "Learn DEVOPS JPA", "in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn AZURE JPA"));
		
	}

}
