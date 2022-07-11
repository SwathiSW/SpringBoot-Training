package com.springboot_hibernate_relationship_design_1.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
public class Regions implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -196143387538139570L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long regionId;
	private String Name;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "regions")
	private Set<Countries> countries;

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Set<Countries> getCountries() {
		return countries;
	}

	public void setCountries(Set<Countries> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "Regions [regionId=" + regionId + ", Name=" + Name + ", countries=" + countries + ", getRegionId()="
				+ getRegionId() + ", getName()=" + getName() + ", getCountries()=" + getCountries() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
