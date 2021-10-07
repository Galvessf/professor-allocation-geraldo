package com.project.professor.allocation.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professor.allocation.entity.Department;

@DataJpaTest
@AutoConfigureTestDatabase (replace = Replace.NONE)
@Rollback(false)

@TestPropertySource(locations ="classpath:application.properties")
public class DepartmentRepositoyTest {

	
	@Autowired
	DepartmentRepository repository;
	
	@Test
	public void findByid () {
		Department search  = repository.findById(12L).orElse(null);
		System.out.println(search);
	}
	
	@Test
	public void create() {
		Department mamute = new Department(null, "Mamute"); 
		Department mamute2 = repository.save(mamute);
		System.out.println(mamute2);
	
	}
	
	@Test
	public void update() {
		Department mamute = new Department(5L, "Mamute2"); 
		Department mamute2 = repository.save(mamute);
		System.out.println(mamute2);
	
	}
	
	@Test
	public void deleteById() {
		repository.deleteById(1L);
	
	}
	
	@Test
	public void mamute() {
	List <Department>list = repository.findByNameContainingIgnoreCase("mamute");
	System.out.println(list);
	}
}
