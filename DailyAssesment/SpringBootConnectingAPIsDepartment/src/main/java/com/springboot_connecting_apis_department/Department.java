package com.springboot_connecting_apis_department;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2043897252817103154L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dId;

	private String departmentName;
	private Long departmentNumber;

	public Long getdId() {
		return dId;
	}

	public void setdId(Long dId) {
		this.dId = dId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Long getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(Long departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", departmentName=" + departmentName + ", departmentNumber="
				+ departmentNumber + "]";
	}

}
