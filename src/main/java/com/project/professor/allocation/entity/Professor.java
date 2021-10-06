package com.project.professor.allocation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {

	@Id
	private Long id;
	private String name;
	private String cpf;
	
	public Professor(Long id, String name, String cpf) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", cpf=" + cpf + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getCpf()=" + getCpf() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
