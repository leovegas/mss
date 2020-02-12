package com.luv2code.springboot.thymeleafdemo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Companies {
	
	@JsonProperty("id")
	private int id;
	@JsonProperty("logo_path")
    private String logo_path;
	@JsonProperty("name")
    private String name;
	@JsonProperty("origin_country")
    private String origin_country;
    
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogo_path() {
		return logo_path;
	}
	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin_country() {
		return origin_country;
	}
	public void setOrigin_country(String origin_country) {
		this.origin_country = origin_country;
	}




}
