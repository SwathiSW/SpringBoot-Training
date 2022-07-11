package com.springboot_login_module_from_database.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department extends AuditModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8866973516570761931L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deptID;

	private Long deptName;

	public Long getDeptID() {
		return deptID;
	}

	public void setDeptID(Long deptID) {
		this.deptID = deptID;
	}

	public Long getDeptName() {
		return deptName;
	}

	public void setDeptName(Long deptName) {
		this.deptName = deptName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(deptID, deptName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(deptID, other.deptID) && Objects.equals(deptName, other.deptName);
	}

	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptName=" + deptName + ", getDeptID()=" + getDeptID()
				+ ", getDeptName()=" + getDeptName() + ", hashCode()=" + hashCode() + ", getCreatedAt()="
				+ getCreatedAt() + ", getUpdatedAt()=" + getUpdatedAt() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

}
