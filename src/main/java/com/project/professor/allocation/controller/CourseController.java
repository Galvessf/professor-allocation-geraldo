package com.project.professor.allocation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.professor.allocation.service.CourseService;

@RestController
@RequestMapping(path = "/departments")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        super();
        this.courseService = courseService;
    }

	public CourseService getCourseService() {
		return courseService;
	}
}