package com.luv2code.springboot.thymeleafdemo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {
	
	//@JsonProperty("adult")
	private boolean adult;
	//@JsonProperty("backdrop_path")
	private String backdrop_path;
	//@JsonProperty("belongs_to_collection")
	Belongs_to_collection belongs_to_collection;
	//@JsonProperty("budget")
	private String budget;
	//@JsonProperty("genres")
	private List<Genres> genres;
	//@JsonProperty("homepage")	
	private String homepage;
	//@JsonProperty("id")
	private String id;
	//@JsonProperty("imdb_id")
	private String imdb_id;
	//@JsonProperty("original_language")
	private String original_language;
	//@JsonProperty("original_title")
	private String original_title;
//	@JsonProperty("overview")
	private String overview;
//	@JsonProperty("popularity")
	private String popularity;
//	@JsonProperty("poster_path")
	private String poster_path;
	//@JsonProperty("production_companies")
	private List<Companies> production_companies;
	//@JsonProperty("production_countries")
	private List<Countries> production_countries;
	//@JsonProperty("release_date")
	private String release_date;
	//@JsonProperty("revenue")
	private String revenue;
	//@JsonProperty("runtime")
	private String runtime;
	//@JsonProperty("spoken_languages")
	private List<Languages> spoken_languages;
	//@JsonProperty("status")
	private String status;
	//@JsonProperty("tagline")
	private String tagline;
	//@JsonProperty("title")
	private String title;
	//@JsonProperty("video")
	private boolean video;
	//@JsonProperty("vote_average")
	private String vote_average;
	//@JsonProperty("vote_count")
	private String vote_count;
	
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public String getBackdrop_path() {
		return backdrop_path;
	}
	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}
	public Belongs_to_collection getBelongs_to_collection() {
		return belongs_to_collection;
	}
	public void setBelongs_to_collection(Belongs_to_collection belongs_to_collection) {
		this.belongs_to_collection = belongs_to_collection;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public List<Genres> getGenres() {
		return genres;
	}
	public void setGenres(List<Genres> genres) {
		this.genres = genres;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImdb_id() {
		return imdb_id;
	}
	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}
	public String getOriginal_language() {
		return original_language;
	}
	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}
	public String getOriginal_title() {
		return original_title;
	}
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getPopularity() {
		return popularity;
	}
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	public List<Companies> getProduction_companies() {
		return production_companies;
	}
	public void setProduction_companies(List<Companies> production_companies) {
		this.production_companies = production_companies;
	}
	public List<Countries> getProduction_countries() {
		return production_countries;
	}
	public void setProduction_countries(List<Countries> production_countries) {
		this.production_countries = production_countries;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String getRevenue() {
		return revenue;
	}
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public List<Languages> getSpoken_languages() {
		return spoken_languages;
	}
	public void setSpoken_languages(List<Languages> spoken_languages) {
		this.spoken_languages = spoken_languages;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isVideo() {
		return video;
	}
	public void setVideo(boolean video) {
		this.video = video;
	}
	public String getVote_average() {
		return vote_average;
	}
	public void setVote_average(String vote_average) {
		this.vote_average = vote_average;
	}
	public String getVote_count() {
		return vote_count;
	}
	public void setVote_count(String vote_count) {
		this.vote_count = vote_count;
	}
	
	
	
}
