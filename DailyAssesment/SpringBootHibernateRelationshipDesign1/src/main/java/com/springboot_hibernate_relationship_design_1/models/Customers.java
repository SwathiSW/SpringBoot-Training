package com.springboot_hibernate_relationship_design_1.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 719105217618283540L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;
	private String firstName, lastName, email;
	private long phone;
	private int countryId;
	@ManyToOne
	private Countries countries;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customers")
	private List<Sales> sales;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	public List<Sales> getSales() {
		return sales;
	}

	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + ", countryId=" + countryId + ", countries=" + countries
				+ ", sales=" + sales + ", getCustomerId()=" + getCustomerId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone()
				+ ", getCountryId()=" + getCountryId() + ", getCountries()=" + getCountries() + ", getSales()="
				+ getSales() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
