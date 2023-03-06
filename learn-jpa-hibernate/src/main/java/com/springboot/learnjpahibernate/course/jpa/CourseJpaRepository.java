//package com.springboot.learnjpahibernate.course.jpa;
//
//import org.springframework.stereotype.Repository;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//
//@Repository
//@Transactional // you need to add this annotation for jpa entity manager
//public class CourseJpaRepository {
//	
//	//@Autowired
//	@PersistenceContext // this is more specific instead of @Autowired
//	private EntityManager entityManager;
//
//	
//	public void insert(Course course) {
//		entityManager.merge(course);
//	}
//	
//	public Course findById(long id) {
//		return entityManager.find(Course.class, id);
//	}
//	public void deleteById(long id) {
//		 Course course  = entityManager.find(Course.class, id);
//		 entityManager.remove(course);
//	}
//}
