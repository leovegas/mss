package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.thymeleafdemo.deserialize.JsonD;
import com.luv2code.springboot.thymeleafdemo.entity.Film;
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

	
	
	@GetMapping("/action")
	public String searchEmployee(@ModelAttribute("film") Film theFilm,
			Model theModel) {				
		
		theModel.addAttribute("film", theFilm);	
		Finder f = new Finder(theFilm.getFirstName());			//get string query from the form

		JsonD jdFirst = new JsonD(f.outUrl());			//get json using string query		

		jdFirst.Deser(0);				// invoke deserilalize method
		
		System.out.print("TEST");
		
		String movie_id = String.valueOf(jdFirst.getFilmEntity().getResults().get(0).getId());			
		
		String fullUrl =  "https://api.themoviedb.org/3/movie/"+movie_id+"?api_key=36ee14f924ebe5d44900f1d0244cc704&language=en-US";
		
		JsonD jd = new JsonD(fullUrl);			//get json from using id query we get from jDfirst instance

		jd.Deser(1);						// invoke deserilalize method
		
		theModel.addAttribute("jd", jd.getMovie());			
		
		theModel.addAttribute("release_date", jd.getMovie().getRelease_date().substring(0, 4));	
		
		theModel.addAttribute("countries", jd.getMovie().getProduction_countries().toString());	
		
		theModel.addAttribute("companies", jd.getMovie().getProduction_companies().toString());	

		String posterUrl = "https://image.tmdb.org/t/p/w500"+jd.getMovie().getPoster_path();
		
		String overview = jd.getMovie().getOverview();		
		
		theModel.addAttribute("posterurl", posterUrl);	
		
		theModel.addAttribute("overview", overview);
		
		theModel.addAttribute("movie_id", movie_id);
		
		String movie_video_url = "https://api.themoviedb.org/3/movie/"+movie_id+"/videos?api_key=36ee14f924ebe5d44900f1d0244cc704&language=en-US";
		
        JsonD jdVideo = new JsonD(movie_video_url);		//get json to get trailer video url
        
		jdVideo.Deser(2);			//deser method						
		
		String trailer_url = "https://www.youtube.com/embed/"+jdVideo.getFilmVideo().getResults().get(0).getKey();
		
		theModel.addAttribute("trailer_url", trailer_url);
		
		return "/mss/search-form";
	}

}
