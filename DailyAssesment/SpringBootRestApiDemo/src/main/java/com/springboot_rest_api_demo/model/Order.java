package com.springboot_rest_api_demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3473865613226980953L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String orderName, brand;
	private int orderId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName + ", brand=" + brand + ", orderId=" + orderId + "]";
	}

}
