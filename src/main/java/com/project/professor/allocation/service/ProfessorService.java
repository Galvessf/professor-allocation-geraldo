package com.project.professor.allocation.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.professor.allocation.entity.Professor;
import com.project.professor.allocation.repository.ProfessorRepository;

@Service
@Component
public class ProfessorService {
	private final ProfessorRepository professorRepository;

	public ProfessorService(ProfessorRepository professorRepository) {
		super();
		this.professorRepository = professorRepository;
	}

	public Professor findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Professor> findAll(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Professor> findByDepartment(Long departId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Professor save(Professor professor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Professor update(Professor professor) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public ProfessorRepository getProfessorRepository() {
		return professorRepository;
	}
}