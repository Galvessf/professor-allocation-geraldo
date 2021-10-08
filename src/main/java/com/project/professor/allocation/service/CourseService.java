package com.project.professor.allocation.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.professor.allocation.repository.CourseRepository;

@Service
@Component
public class CourseService {
	private final CourseRepository CourseRepository;

	public CourseService(CourseRepository CourseRepository) {
		super();
		this.CourseRepository = CourseRepository;
	}
}