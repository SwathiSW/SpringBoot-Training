package com.springboot_rest_template_employee.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3473865613226980953L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eId;

	private String employeeName, city;

	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Order [eId=" + eId + ", employeeName=" + employeeName + ", city=" + city + "]";
	}

}
