package com.project.professor.allocation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.entity.Department;
import com.project.professor.allocation.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        super();
        this.departmentRepository = departmentRepository;
    }

    public List<Department> findAll(Long long1) {
        if (long1 == null) {
            return departmentRepository.findAll();
        } else {
            return departmentRepository.findByNameContainingIgnoreCase(long1);
        }
    }

    public Department findById(Long name) {
        return departmentRepository.findById(name).orElse(null);
    }

    public Department save(Department department) {
        department.setId(null);
        return saveInternal(department);
    }

    public Department update(Department department) {
        Long id = department.getId();
        if (id != null && departmentRepository.existsById(id)) {
            return saveInternal(department);
        } else {
            return null;
        }
    }

    public void deleteById(Long id) {
        if (id != null && departmentRepository.existsById(id)) {
            departmentRepository.deleteById(id);
        }
    }

    public void deleteAll() {
        departmentRepository.deleteAllInBatch();
    }

    private Department saveInternal(Department department) {
        department = departmentRepository.save(department);
        return department;
    }

	public List<Department> findAll(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}