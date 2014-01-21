package fr.lps2ima.university.service;

import java.util.List; 

public interface CourseServiceI {

	List<Course> findAll();
	Course findById(Integer id);
	void save(Course course);
	
}
