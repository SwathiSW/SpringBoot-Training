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
@Table(name = "Stores")
public class Stores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4679953098335641071L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer storeId;

	private String storeDescription, storeAddress;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "stores")
	private List<SalesFact> salesFact;

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreDescription() {
		return storeDescription;
	}

	public void setStoreDescription(String storeDescription) {
		this.storeDescription = storeDescription;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public List<SalesFact> getSalesFact() {
		return salesFact;
	}

	public void setSalesFact(List<SalesFact> salesFact) {
		this.salesFact = salesFact;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Stores [storeId=" + storeId + ", storeDescription=" + storeDescription + ", storeAddress="
				+ storeAddress + ", salesFact=" + salesFact + "]";
	}

}
