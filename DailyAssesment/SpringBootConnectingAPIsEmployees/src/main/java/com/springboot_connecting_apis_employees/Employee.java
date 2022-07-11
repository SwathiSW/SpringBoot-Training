package com.springboot_connecting_apis_employees;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 793660022989883743L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eId;

	private String employeeName, employeeLocation;
	private Long employeePhoneNumber;

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

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	public Long getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}

	public void setEmployeePhoneNumber(Long employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", employeeName=" + employeeName + ", employeeLocation=" + employeeLocation
				+ ", employeePhoneNumber=" + employeePhoneNumber + "]";
	}

}
