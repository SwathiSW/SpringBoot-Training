package com.springboot_hibernate_relationship_design_1.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "currencies")
public class Currencies implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8660238394391817652L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long currencyId;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private CountriesCurrencies countriesCurrencies;
	@ManyToOne
	private Sales sales;

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	public Long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public CountriesCurrencies getCountriesCurrencies() {
		return countriesCurrencies;
	}

	public void setCountriesCurrencies(CountriesCurrencies countriesCurrencies) {
		this.countriesCurrencies = countriesCurrencies;
	}

	@Override
	public String toString() {
		return "Currencies [currencyId=" + currencyId + ", name=" + name + ", countriesCurrencies="
				+ countriesCurrencies + ", sales=" + sales + ", getSales()=" + getSales() + ", getCurrencyId()="
				+ getCurrencyId() + ", getName()=" + getName() + ", getCountriesCurrencies()="
				+ getCountriesCurrencies() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
