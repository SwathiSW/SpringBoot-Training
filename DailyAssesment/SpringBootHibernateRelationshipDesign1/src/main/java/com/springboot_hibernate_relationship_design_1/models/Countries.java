package com.springboot_hibernate_relationship_design_1.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5754689545712054378L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long countryId;
	private String name;
	private long regionId;
	@OneToOne
	private CountriesCurrencies countriesCurrencies;
	@ManyToOne
	private Regions regions;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "countries")
	private Set<Customers> customers;

	public Set<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customers> customers) {
		this.customers = customers;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRegionId() {
		return regionId;
	}

	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

	public Regions getRegions() {
		return regions;
	}

	public void setRegions(Regions regions) {
		this.regions = regions;
	}

	public CountriesCurrencies getCountriesCurrencies() {
		return countriesCurrencies;
	}

	public void setCountriesCurrencies(CountriesCurrencies countriesCurrencies) {
		this.countriesCurrencies = countriesCurrencies;
	}

	@Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", name=" + name + ", regionId=" + regionId
				+ ", countriesCurrencies=" + countriesCurrencies + ", regions=" + regions + ", customers=" + customers
				+ ", getCustomers()=" + getCustomers() + ", getCountryId()=" + getCountryId() + ", getName()="
				+ getName() + ", getRegionId()=" + getRegionId() + ", getRegions()=" + getRegions()
				+ ", getCountriesCurrencies()=" + getCountriesCurrencies() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
