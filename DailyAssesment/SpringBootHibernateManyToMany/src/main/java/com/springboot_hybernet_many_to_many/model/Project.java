package com.springboot_hybernet_many_to_many.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6116602877170941471L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	private String title;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "projects")
	private Set<Employee> employees;

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}