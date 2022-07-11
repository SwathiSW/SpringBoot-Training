package com.springboot_database_design.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5085684692785412579L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;

	private String customerName, customerAddress;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customers")
	private List<SalesFact> salesFacts;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<SalesFact> getSalesFacts() {
		return salesFacts;
	}

	public void setSalesFacts(List<SalesFact> salesFacts) {
		this.salesFacts = salesFacts;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", salesFacts=" + salesFacts + "]";
	}

}
