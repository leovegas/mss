package com.luv2code.springboot.thymeleafdemo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Languages {

	public String getIso_639_1() {
		return iso_639_1;
	}
	public void setIso_639_1(String iso_639_1) {
		this.iso_639_1 = iso_639_1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("iso_639_1")
	private String iso_639_1;
	@JsonProperty("name")
	private String name;
	
	
	
}
