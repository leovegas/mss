package com.luv2code.springboot.thymeleafdemo.entity;

import java.util.List;

public class PopularMovies {
	
	private int page;
	private int total_results;
	private int total_pages;
	List<PopularMovie> results;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotal_results() {
		return total_results;
	}
	public void setTotal_results(int total_results) {
		this.total_results = total_results;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public List<PopularMovie> getResults() {
		return results;
	}
	public void setResults(List<PopularMovie> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "PopularMovies [page=" + page + ", total_results=" + total_results + ", total_pages=" + total_pages
				+ ", results=" + results + "]";
	}
	
	

}
