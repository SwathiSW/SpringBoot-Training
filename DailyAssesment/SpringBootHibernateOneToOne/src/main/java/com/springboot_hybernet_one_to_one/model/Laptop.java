package com.springboot_hybernet_one_to_one.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3467344934715695571L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long lid;
	private String model, brand, processor, ram;

	public Long getLid() {
		return lid;
	}

	public void setLid(Long lid) {
		this.lid = lid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, lid, model, processor, ram);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(lid, other.lid)
				&& Objects.equals(model, other.model) && Objects.equals(processor, other.processor)
				&& Objects.equals(ram, other.ram);
	}

}
