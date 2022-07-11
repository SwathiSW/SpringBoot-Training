package com.springboot_hibernate_relationship_design_1.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5547301922468499013L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	private String name, shortDescription, fullDescription, size, colour;
	@ManyToOne
	private Sales sales;
	@ManyToMany
	@JoinTable(name = "products_stores", joinColumns = { @JoinColumn(name = "products_productidd") }, inverseJoinColumns = {
			@JoinColumn(name = "stores_storid") })
	private List<Stores> stores;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	public List<Stores> getStores() {
		return stores;
	}

	public void setStores(List<Stores> stores) {
		this.stores = stores;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", name=" + name + ", shortDescription=" + shortDescription
				+ ", fullDescription=" + fullDescription + ", size=" + size + ", colour=" + colour + ", sales=" + sales
				+ ", stores=" + stores + ", getProductId()=" + getProductId() + ", getName()=" + getName()
				+ ", getShortDescription()=" + getShortDescription() + ", getFullDescription()=" + getFullDescription()
				+ ", getSize()=" + getSize() + ", getColour()=" + getColour() + ", getSales()=" + getSales()
				+ ", getStores()=" + getStores() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
