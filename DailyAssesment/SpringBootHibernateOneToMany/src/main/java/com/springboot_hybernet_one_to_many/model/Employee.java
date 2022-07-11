package com.springboot_hybernet_one_to_many.model;

import java.io.Serializable;
//import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
//	@OneToMany(cascade = CascadeType.ALL) // To create a Table
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee") // To create a column
//	private List<Phone> phones; // To allow duplicates
	private Set<Phone> phones; // To not allow duplicates

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

	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

//	public List<Phone> getPhones() {
//		return phones;
//	}
//
//	public void setPhones(List<Phone> phones) {
//		this.phones = phones;
//	}

}
