package com.springboot_query_annotation_demo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
@NamedQuery(name = "emp_list", query = "from Employee where id=:eId")
@NamedQueries({ 
		@NamedQuery(name = "emp_list1", query = "from Employee where name=:name"),
		@NamedQuery(name = "emp_list2", query = "from Employee where address=:address"),
		@NamedQuery(name = "emp_update", query = "update Employee set phone = :phone where address=:address"),
		@NamedQuery(name = "emp_delete", query = "Delete Employee where name=:name")
		})
@NamedNativeQuery(
		name = "emp_list3",
		query = "select * from EMPLOYEE where name=:name",
		resultClass = Employee.class)

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4865883162961829320L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eId;

	private String name, address;
	private Integer phone;

	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

}
