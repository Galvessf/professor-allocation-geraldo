package com.project.professor.allocation.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.professor.allocation.entity.Course;
import com.project.professor.allocation.repository.CourseRepository;

@Service
@Component
public class CourseService {
	private final CourseRepository CourseRepository;

	public CourseService(CourseRepository CourseRepository) {
		super();
		this.CourseRepository = CourseRepository;
	}

	public List<Course> findAll(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public Course save(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	public Course update(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}