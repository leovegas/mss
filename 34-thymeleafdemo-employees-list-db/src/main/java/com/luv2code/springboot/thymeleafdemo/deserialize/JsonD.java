package com.luv2code.springboot.thymeleafdemo.deserialize;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luv2code.springboot.thymeleafdemo.entity.FilmEntity;
import com.luv2code.springboot.thymeleafdemo.entity.FilmVideo;
import com.luv2code.springboot.thymeleafdemo.entity.Movie;

public class JsonD {	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	private String url;
	
	Movie movie;
	FilmVideo filmVideo;
	FilmEntity filmEntity;

	public FilmEntity getFilmEntity() {
		return filmEntity;
	}

	public void setFilmEntity(FilmEntity filmEntity) {
		this.filmEntity = filmEntity;
	}

	public FilmVideo getFilmVideo() {
		return filmVideo;
	}

	public void setFilmVideo(FilmVideo filmVideo) {
		this.filmVideo = filmVideo;
	}

	public JsonD(String url) {
		this.url = url;
	}
	
	public void Deser(int flag) {		
	
			//create ObjectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();

    //read json file and convert to customer object
     try {    	 
    	URL www = new URL(url);
    	//URL wwwVideoInfo = new URL(url);
    	if (flag==0)
		filmEntity = objectMapper.readValue(www, FilmEntity.class);    	
    	if (flag==1)
		movie = objectMapper.readValue(www, Movie.class);
    	if (flag==2)
    	filmVideo = objectMapper.readValue(www, FilmVideo.class);
    	
		
	} catch (IOException e) {
		e.printStackTrace();
	}
     
	
	}

	

}
