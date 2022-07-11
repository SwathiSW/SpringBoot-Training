package com.springboot_database_design.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Dates")
public class Dates implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7113095939233156035L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dateId;

	private Integer year, month, quarter;

	private Date fullDate;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dates")
	private List<SalesFact> salesFacts;

	public Integer getDateId() {
		return dateId;
	}

	public void setDateId(Integer dateId) {
		this.dateId = dateId;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getQuarter() {
		return quarter;
	}

	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}

	public Date getFullDate() {
		return fullDate;
	}

	public void setFullDate(Date fullDate) {
		this.fullDate = fullDate;
	}

	public List<SalesFact> getSalesFacts() {
		return salesFacts;
	}

	public void setSalesFacts(List<SalesFact> salesFacts) {
		this.salesFacts = salesFacts;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Dates [dateId=" + dateId + ", year=" + year + ", month=" + month + ", quarter=" + quarter
				+ ", fullDate=" + fullDate + ", salesFacts=" + salesFacts + "]";
	}

}
