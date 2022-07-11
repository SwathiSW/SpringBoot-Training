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
@Table(name = "Products")
public class Products implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7175817911553992901L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;

	private String productDescription, productDepartment;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "products")
	private List<SalesFact> salesfact;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductDepartment() {
		return productDepartment;
	}

	public void setProductDepartment(String productDepartment) {
		this.productDepartment = productDepartment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<SalesFact> getSalesfact() {
		return salesfact;
	}

	public void setSalesfact(List<SalesFact> salesfact) {
		this.salesfact = salesfact;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productDescription=" + productDescription
				+ ", productDepartment=" + productDepartment + ", salesfact=" + salesfact + "]";
	}

}
