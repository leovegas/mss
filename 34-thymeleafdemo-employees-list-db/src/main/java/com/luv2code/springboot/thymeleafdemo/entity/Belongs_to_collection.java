package com.luv2code.springboot.thymeleafdemo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Belongs_to_collection {
	
	
	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("poster_path")
	private String poster_path;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	public String getBackdrop_path() {
		return backdrop_path;
	}
	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}
	@JsonProperty("backdrop_path")
	private String backdrop_path;
	
}
