package com.springboot_hybernet_one_to_many.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	private String comment, phoneNumber;
	@ManyToOne
	private Employee employee;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Enumerated(EnumType.STRING)
	private PHONE_TYPE phone_TYPE;

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public PHONE_TYPE getPhone_TYPE() {
		return phone_TYPE;
	}

	public void setPhone_TYPE(PHONE_TYPE phone_TYPE) {
		this.phone_TYPE = phone_TYPE;
	}

}