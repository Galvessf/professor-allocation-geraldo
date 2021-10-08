package com.project.professor.allocation.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.professor.allocation.repository.ProfessorRepository;

@Service
@Component
public class ProfessorService {
	private final ProfessorRepository professorRepository;

	public ProfessorService(ProfessorRepository professorRepository) {
		super();
		this.professorRepository = professorRepository;
	}
}