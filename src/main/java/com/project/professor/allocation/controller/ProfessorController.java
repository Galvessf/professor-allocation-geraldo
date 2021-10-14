package com.project.professor.allocation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.professor.allocation.service.ProfessorService;

@RestController
@RequestMapping(path = "/departments")
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        super();
        this.professorService = professorService;
    }

	public ProfessorService getProfessorService() {
		return professorService;
	}
}