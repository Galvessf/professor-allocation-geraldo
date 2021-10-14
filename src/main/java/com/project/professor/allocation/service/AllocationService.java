package com.project.professor.allocation.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.professor.allocation.entity.Allocation;
import com.project.professor.allocation.repository.AllocationRepository;

@Service
@Component
public class AllocationService {
	private final AllocationRepository AllocationRepository;

	public AllocationService(AllocationRepository AllocationRepository) {
		super();
		this.AllocationRepository = AllocationRepository;
	}

	public static List<Allocation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Allocation> findByProfessor(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Allocation> findByCourse(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Allocation save(Allocation allocation) {
		// TODO Auto-generated method stub
		return null;
	}

	public Allocation update(Allocation allocation) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public AllocationRepository getAllocationRepository() {
		return AllocationRepository;
	}
}
