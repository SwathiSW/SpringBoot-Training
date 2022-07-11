package com.springboot_login_module_from_database.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.userdetails.User;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public abstract class AuditModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5889433234321702292L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, updatable = false)
	@CreatedDate
	private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false)
	@LastModifiedDate
	private Date updatedAt;

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdAt, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuditModel other = (AuditModel) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(updatedAt, other.updatedAt);
	}

	@Override
	public String toString() {
		return "AuditModel [createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", getCreatedAt()=" + getCreatedAt()
				+ ", getUpdatedAt()=" + getUpdatedAt() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

}
