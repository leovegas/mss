package com.luv2code.springboot.thymeleafdemo.http;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class GetResponse {
	
	
	public static boolean isAvailable(String url1) {
		
	 try {
		 URL url = new URL(url1);
		 HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		 connection.setRequestMethod("GET");
		 connection.connect();

		 int code = connection.getResponseCode();
		 
	System.out.println(code);	
			
	 }
	 catch (Exception exc) {
		 System.out.print(exc.getMessage());
	 }
	 
	 return true;
	

}


}
