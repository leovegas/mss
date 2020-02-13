package com.luv2code.springboot.thymeleafdemo.search;

public class Finder {
	
	public Finder(String query) {
		this.query = query;
	}
		
	private String query;	

	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	
	
	public String outUrl() {
		return "https://api.themoviedb.org/3/search/movie?api_key=36ee14f924ebe5d44900f1d0244cc704&language=en-US&query="+query+"&page=1&include_adult=false";
	}
	
	
	
	

}
