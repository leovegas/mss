package com.luv2code.springboot.thymeleafdemo.entity;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilmEntity {		

	public FilmEntity() {
	}

	public FilmEntity(String page, String total_results, String total_pages, List<FilmDescription> results) {
		this.page = page;
		this.total_results = total_results;
		this.total_pages = total_pages;
		this.results = results;
	}

	@Override
	public String toString() {
		return "FilmEntity [page=" + page + ", total_results=" + total_results + ", total_pages=" + total_pages
				+ ", results=" + results + "]";
	}

	public String getPage() {
		return page;
	}
	
	public void setPage(String page) {
		this.page = page;
	}

	public String getTotal_results() {
		return total_results;
	}

	public void setTotal_results(String total_results) {
		this.total_results = total_results;
	}

	public String getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}

	public List<FilmDescription> getResults() {
		return results;
	}

	public void setResults(List<FilmDescription> results) {
		this.results = results;
	}

	private String page;
	private String total_results;
	private String total_pages;
	private List<FilmDescription> results;

	

}
