package com.luv2code.springboot.thymeleafdemo.entity;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmDescription {	

	@Override
	public String toString() {
		return "FilmDescription [popularity=" + popularity + ", vote_count=" + vote_count + ", video=" + video
				+ ", poster_path=" + poster_path + ", id=" + id + ", adult=" + adult + ", backdrop_path="
				+ backdrop_path + ", original_language=" + original_language + ", original_title=" + original_title
				+ ", genre_ids3=" + Arrays.toString(genre_ids) + ", title=" + title + ", vote_average="
				+ vote_average + ", overview=" + overview + ", release_date=" + release_date + "]";
	}
	@JsonProperty("popularity")
	private String popularity;
	@JsonProperty("vote_count")
	private int vote_count;
	@JsonProperty("video")
	private boolean video;
	@JsonProperty("poster_path")
	private String poster_path;
	@JsonProperty("id")
	private int id;
	@JsonProperty("adult")
	private boolean adult;
	@JsonProperty("backdrop_path")
	private String backdrop_path;
	@JsonProperty("original_language")
	private String original_language;
	@JsonProperty("original_title")
	private String original_title;
	@JsonProperty("genre_ids")
	private int[] genre_ids;
	@JsonProperty("title")
	private String title;
	@JsonProperty("vote_average")
	private String vote_average;
	@JsonProperty("overview")
	private String overview;
	@JsonProperty("release_date")
	private String release_date;
	public String getPopularity() {
		return popularity;
	}
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}
	public int getVote_count() {
		return vote_count;
	}
	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}
	public boolean isVideo() {
		return video;
	}
	public void setVideo(boolean video) {
		this.video = video;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int[] getGenre_ids() {
		return genre_ids;
	}
	public void setGenre_ids(int[] genre_ids) {
		this.genre_ids = genre_ids;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVote_average() {
		return vote_average;
	}
	public void setVote_average(String vote_average) {
		this.vote_average = vote_average;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	
	

}