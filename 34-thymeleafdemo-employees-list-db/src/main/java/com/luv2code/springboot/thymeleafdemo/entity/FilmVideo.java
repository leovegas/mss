package com.luv2code.springboot.thymeleafdemo.entity;

import java.util.List;

public class FilmVideo {
	
	public FilmVideo(int id, List<FilmVideoDescription> results) {
		this.id = id;
		this.results = results;
	}	
	
	public FilmVideo() {
	}

	private int id;
	private List<FilmVideoDescription> results;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<FilmVideoDescription> getResults() {
		return results;
	}

	public void setResults(List<FilmVideoDescription> results) {
		this.results = results;
	}
	
	

}
