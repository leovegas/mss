package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.thymeleafdemo.deserialize.JsonD;
import com.luv2code.springboot.thymeleafdemo.entity.Countries;
import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.entity.Film;
import com.luv2code.springboot.thymeleafdemo.entity.FilmDescription;
import com.luv2code.springboot.thymeleafdemo.entity.Genres;
import com.luv2code.springboot.thymeleafdemo.entity.Movie;
import com.luv2code.springboot.thymeleafdemo.http.GetResponse;
import com.luv2code.springboot.thymeleafdemo.search.Finder;

@Controller
@RequestMapping("/mss")
public class SearchController {
	
		

	@GetMapping("/search")
	public String searchPage(@ModelAttribute("film") Film theFilm,
			Model theModel) {				
		
		theModel.addAttribute("film", theFilm);			
		
		return "/mss/search-index";
	}
	
	@GetMapping("/list")
	public String showList(@ModelAttribute("film") Film theFilm,
			Model theModel) {	
		
		List<Movie> movies = new ArrayList<>();
		List<String> genres = new ArrayList<>();
		List<String> countries = new ArrayList<>();


		
		theModel.addAttribute("film", theFilm);	
		
		theModel.addAttribute("film", theFilm);	
		Finder f = new Finder(theFilm.getFirstName());			//get string query from the form

		if (theFilm.getFirstName().isEmpty()) return "/mss/search-index";		

		JsonD jdFirst = new JsonD(f.outUrl());			//get json using string query		

		jdFirst.Deser(0);	
		
		for (int i=0;i<jdFirst.getFilmEntity().getResults().size();i++) {
		
		String movie_id = String.valueOf(jdFirst.getFilmEntity().getResults().get(i).getId());			
		
		String fullUrl =  "https://api.themoviedb.org/3/movie/"+movie_id+"?api_key=36ee14f924ebe5d44900f1d0244cc704&language=en-US";		
		
		JsonD jd = new JsonD(fullUrl);			//get json from using id query we get from jDfirst instance

		jd.Deser(1);
		
		movies.add(jd.getMovie());
		genres.add(jd.getMovie().getGenres().toString().replaceAll("^\\[|\\]$", ""));
		countries.add(jd.getMovie().getProduction_countries().toString().replaceAll("^\\[|\\]$", ""));

		
		}	

		List<FilmDescription> moviesList = jdFirst.getFilmEntity().getResults();
		
		List<String> posters = new ArrayList<>();
		List<String> overviews = new ArrayList<>();
		
		for (FilmDescription iter: moviesList) {
			posters.add("https://image.tmdb.org/t/p/w500"+iter.getPoster_path());
		}
		
		theModel.addAttribute("posters", posters);
		theModel.addAttribute("moviesList", moviesList);
		theModel.addAttribute("movies", movies);
		theModel.addAttribute("genres", genres);
		theModel.addAttribute("countries",countries);


		
		return "/mss/search-list";
	}
	
	@GetMapping("/goToPageWithId")
	public String showFormForUpdate(@RequestParam("id") int movie_id, @ModelAttribute("film") Film theFilm,
									Model theModel) {	
		
        String fullUrl =  "https://api.themoviedb.org/3/movie/"+movie_id+"?api_key=36ee14f924ebe5d44900f1d0244cc704&language=en-US";		
		
		JsonD jd = new JsonD(fullUrl);			//get json from using id query we get from jDfirst instance

		jd.Deser(1);		
			
		theModel.addAttribute("jd", jd.getMovie());			
		
		theModel.addAttribute("release_date", jd.getMovie().getRelease_date().substring(0, 4));	
		
		theModel.addAttribute("countries", jd.getMovie().getProduction_countries().toString());	
		if (jd.getMovie().getProduction_countries().toString()==null) {theModel.addAttribute("countries", "No information");}
		
		theModel.addAttribute("companies", jd.getMovie().getProduction_companies().toString());	
		if (jd.getMovie().getProduction_countries().toString()==null) {theModel.addAttribute("companies", "No information");}

		String posterUrl = "https://image.tmdb.org/t/p/w500"+jd.getMovie().getPoster_path();
		
		String overview = jd.getMovie().getOverview();		
		
		theModel.addAttribute("posterurl", posterUrl);	
		
		theModel.addAttribute("overview", jd.getMovie().getOverview());
		
		theModel.addAttribute("movie_id", jd.getMovie().getId());
		
		String movie_video_url = "https://api.themoviedb.org/3/movie/"+jd.getMovie().getId()+"/videos?api_key=36ee14f924ebe5d44900f1d0244cc704&language=en-US";
		
        JsonD jdVideo = new JsonD(movie_video_url);		//get json to get trailer video url        
      
		jdVideo.Deser(2);			//deser method						
		
		if (!jdVideo.getFilmVideo().getResults().isEmpty()) {			
			
			String trailer_url = "https://www.youtube.com/embed/"+jdVideo.getFilmVideo().getResults().get(0).getKey();
			theModel.addAttribute("trailer_url", trailer_url);
		}
		
		
		return "/mss/search-form";		
	}

	
	
	@GetMapping("/action")
	public String searchEmployee(@ModelAttribute("movie") Movie theMovie,
			Model theModel) {		
		
		System.out.println(theMovie.getId());
				
//		theModel.addAttribute("film", theFilm);	
//		Finder f = new Finder(theFilm.getFirstName());			//get string query from the form
//		System.out.print(theFilm.getFirstName());		
//
//		if (theFilm.getFirstName().isEmpty()) return "/mss/search-index";		
//
//		JsonD jdFirst = new JsonD(f.outUrl());			//get json using string query		
//
//		jdFirst.Deser(0);				// invoke deserilalize method		
//		
//		String movie_id = String.valueOf(jdFirst.getFilmEntity().getResults().get(0).getId());	
//		
//		if (movie_id==null) {movie_id="No information";}
//		
//		String fullUrl =  "https://api.themoviedb.org/3/movie/"+movie_id+"?api_key=36ee14f924ebe5d44900f1d0244cc704&language=en-US";		
//		
//		JsonD jd = new JsonD(fullUrl);			//get json from using id query we get from jDfirst instance
//
//		jd.Deser(1);						// invoke deserilalize method		
//				
//		boolean has_video = jd.getMovie().isVideo();		
		
		theModel.addAttribute("jd", theMovie);			
		
		theModel.addAttribute("release_date", theMovie.getRelease_date().substring(0, 4));	
		
		theModel.addAttribute("countries", theMovie.getProduction_countries().toString());	
		if (theMovie.getProduction_countries().toString()==null) {theModel.addAttribute("countries", "No information");}
		
		theModel.addAttribute("companies", theMovie.getProduction_companies().toString());	
		if (theMovie.getProduction_countries().toString()==null) {theModel.addAttribute("companies", "No information");}

		String posterUrl = "https://image.tmdb.org/t/p/w500"+theMovie.getPoster_path();
		
		String overview = theMovie.getOverview();		
		
		theModel.addAttribute("posterurl", theMovie.getPoster_path());	
		
		theModel.addAttribute("overview", theMovie.getOverview());
		
		theModel.addAttribute("movie_id", theMovie.getId());
		
		String movie_video_url = "https://api.themoviedb.org/3/movie/"+theMovie.getId()+"/videos?api_key=36ee14f924ebe5d44900f1d0244cc704&language=en-US";
		
        JsonD jdVideo = new JsonD(movie_video_url);		//get json to get trailer video url        
      
		jdVideo.Deser(2);			//deser method						
		
		if (!jdVideo.getFilmVideo().getResults().isEmpty()) {			
			
			String trailer_url = "https://www.youtube.com/embed/"+jdVideo.getFilmVideo().getResults().get(0).getKey();
			theModel.addAttribute("trailer_url", trailer_url);
		}
		
		
		return "/mss/search-form";
	}

}
