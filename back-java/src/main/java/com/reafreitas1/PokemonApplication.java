package com.reafreitas1;


import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import org.json.JSONObject;
import org.json.JSONArray;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);

		try{
            PokemonApplication.call_me();
        }catch (Exception e) {
            e.printStackTrace();
        }
	}

	public static void call_me() throws Exception {
		//electric, ice, water, grass, ground, fire... 

		String url = "https://pokeapi.co/api/v2/type/electric";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		new InputStreamReader(con.getInputStream()));

		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}

		in.close();

		System.out.println(response.toString());
		JSONObject myResponse = new JSONObject(response.toString());
		System.out.println("name: "+myResponse.getString("name"));
		
		JSONArray jArray = new JSONArray(obj.toString());
		
		for(int i = 0; i < jArray.length(); i++){
			JSONObject o = jArray.getJSONObject(i);
			String name = o.getString("name");
        	int id = o.getInt("id");
			System.out.println("name :"+ name + "id :"+ id);
			
		}
                                                            
        

		//System.out.println("Name: "+ name + "\nID :" + id);
		
		
		


	  }
	  
	  //public static ImageIcon getImageByID(int id) {
		//  ImageIcon image = null;
		//
		//  String urlString = ""
	  //}

}
