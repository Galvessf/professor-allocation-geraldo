package com.project.professor.allocation.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.professor.allocation.repository.DepartmentRepository;

@Service
@Component
public class DepartmentService {
	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}
}
