package com.project.professor.allocation.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.professor.allocation.repository.AllocationRepository;

@Service
@Component
public class AllocationService {
	private final AllocationRepository AllocationRepository;

	public AllocationService(AllocationRepository AllocationRepository) {
		super();
		this.AllocationRepository = AllocationRepository;
	}
}
