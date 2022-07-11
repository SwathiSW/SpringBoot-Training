package com.springboot_circuit_breaker;

import java.io.Serializable;

public class SearchRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5689425950077290603L;

	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
