package com.springboot_task.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1064153100716867148L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long rollNumber;

	@Column(name = "StudentName", nullable = true)
	private String name;

	@Column(name = "PhoneNumber", nullable = true)
	private Integer phoneNumber;

	@OneToOne(cascade = CascadeType.ALL)
	private Courses course;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="student_roll_number")
	private List<Teachers> teacher;

	public Long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
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

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public List<Teachers> getTeachers() {
		return teacher;
	}

	public void setTeachers(List<Teachers> teachers) {
		this.teacher = teachers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", phoneNumber=" + phoneNumber + ", course="
				+ course + ", teachers=" + teacher + "]";
	}

}
