package com.project.professor.allocation.entity;

import java.time.DayOfWeek;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Allocation {

	@Id
	private Long id;
	private DayOfWeek day;
	private Date start;
	private Date end;
	
	public Allocation(Long id, DayOfWeek day, Date start, Date end) {
		super();
		this.id = id;
		this.day = day;
		this.start = start;
		this.end = end;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Allocation [id=" + id + ", day=" + day + ", start=" + start + ", end=" + end + ", getId()=" + getId()
				+ ", getDay()=" + getDay() + ", getStart()=" + getStart() + ", getEnd()=" + getEnd() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
		
}
