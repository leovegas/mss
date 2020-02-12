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
@RequestMapping("/employees")
public class SearchController {
	
	@GetMapping("/search")
	public String searchPage(@ModelAttribute("film") Film theFilm,
			Model theModel) {				
		
		theModel.addAttribute("film", theFilm);			
		
		return "/employees/search-form";
	}

	
	
	@GetMapping("/action")
	public String searchEmployee(@ModelAttribute("film") Film theFilm,
			Model theModel) {				
		
		theModel.addAttribute("film", theFilm);	
		
		Finder f = new Finder(theFilm.getFirstName());
		
		
		JsonD jdFirst = new JsonD(f.outUrl());
		
		jdFirst.Deser(0);	
		
		String movie_id = String.valueOf(jdFirst.getFilmEntity().getResults().get(0).getId());	
		
		String fullUrl =  "https://api.themoviedb.org/3/movie/"+movie_id+"?api_key=36ee14f924ebe5d44900f1d0244cc704&language=en-US";
		
		JsonD jd = new JsonD(fullUrl);
		
		jd.Deser(1);			
		
	//	theModel.addAttribute("jd", jd.getMovie());			

		String posterUrl = "https://image.tmdb.org/t/p/w500"+jd.getMovie().getPoster_path();
		
		String overview = jd.getMovie().getOverview();		
		
		theModel.addAttribute("posterurl", posterUrl);	
		
		theModel.addAttribute("overview", overview);
		
		theModel.addAttribute("movie_id", movie_id);
		
		String movie_video_url = "https://api.themoviedb.org/3/movie/"+movie_id+"/videos?api_key=36ee14f924ebe5d44900f1d0244cc704&language=en-US";
		
        JsonD jdVideo = new JsonD(movie_video_url);		
        
		jdVideo.Deser(2);			
						
		System.out.print(jdVideo.getFilmVideo().getResults().get(0).getKey());
		
		String trailer_url = "https://www.youtube.com/embed/"+jdVideo.getFilmVideo().getResults().get(0).getKey();
		
		theModel.addAttribute("trailer_url", trailer_url);
		
		return "/employees/search-form";
	}

}
