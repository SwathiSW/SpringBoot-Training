package com.springboot_database_design.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SalesFact")
public class SalesFact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7203031132275365942L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer salesId;

	private Float amount, quantity, cost;

	@ManyToOne(cascade = CascadeType.ALL)
	private Customers customers;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Dates dates;

	@ManyToOne(cascade = CascadeType.ALL)
	private Products products;

	@ManyToOne(cascade = CascadeType.ALL)
	private Stores stores;

	public Integer getSalesId() {
		return salesId;
	}

	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public Dates getDates() {
		return dates;
	}

	public void setDates(Dates dates) {
		this.dates = dates;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public Stores getStores() {
		return stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
