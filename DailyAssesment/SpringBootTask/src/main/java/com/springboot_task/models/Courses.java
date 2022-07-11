package com.springboot_task.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Courses implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1772978403863902891L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;

	@Column(name = "CourseName", nullable = true)
	private String courseName;

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + "]";
	}

}
