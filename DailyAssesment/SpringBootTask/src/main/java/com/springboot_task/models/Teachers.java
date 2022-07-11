package com.springboot_task.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Teachers")
public class Teachers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3751001576456959207L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long teacherId;

	@Column(name = "TeacherName", nullable = true)
	private String name;

	@Column(name = "PhoneNumber", nullable = true)
	private Integer phoneNumber;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name ="student_roll_number")
	private Student student;

	public Long gettId() {
		return teacherId;
	}

	public void settId(Long tId) {
		this.teacherId = tId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Teachers [tId=" + teacherId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", student=" + student
				+ "]";
	}

}
