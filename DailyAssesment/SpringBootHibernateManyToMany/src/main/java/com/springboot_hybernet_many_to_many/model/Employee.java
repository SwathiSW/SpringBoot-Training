package com.springboot_hybernet_many_to_many.model;

import java.io.Serializable;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7108602029108606198L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eid;
	private String name, address;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Employee_Project", joinColumns = { @JoinColumn(name = "employee_eid") }, inverseJoinColumns = {
			@JoinColumn(name = "project_pid") })
	private Set<Project> projects = new HashSet<Project>();

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

}
