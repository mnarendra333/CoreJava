package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GetMoviesActedByAHero {

	public static void main(String[] args) {
		//io - operations
		try {
			//read file data
			BufferedReader br = new BufferedReader
					(new FileReader("D:\\tutorials\\listof movies.txt"));
			String line = null;
			List<Movie> listOfMovies = new ArrayList<Movie>();
			while ((line = br.readLine())!=null) {
				String[] data = line.split(" ");
				int year  =Integer.parseInt(data[2]);
				Movie movie = new Movie(data[0],data[1],year);
				listOfMovies.add(movie);
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter actor name");
			String actorName = sc.next();
			Map<String,List<Movie>> map = getListOfMoviesInMap(listOfMovies);
			List<Movie> movies = map.get(actorName);
			System.out.println("movies acted by "+actorName+" are");
			for (Movie movie : movies) {
				System.out.println(movie);
			}
			
			
			Map<Integer,List<Movie>> mapForYr  = getListOfMoviesInTheYear(listOfMovies);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static Map<String, List<Movie>> getListOfMoviesInMap(
			List<Movie> listOfMovies) {
		
		Map<String,List<Movie>> mapWithData = new HashMap<String, List<Movie>>();
		for (Movie movie : listOfMovies) {
			
			String actName = movie.getActorName();
			if(mapWithData.get(actName) == null){
				List<Movie> movies = new ArrayList<Movie>();
				movies.add(movie);
				mapWithData.put(actName, movies);
			}else{
				List<Movie> exisMovies = mapWithData.get(actName);
				exisMovies.add(movie);
				mapWithData.put(actName, exisMovies);
			}	
		}
		return mapWithData;
	}
	
	
	public static Map<Integer,List<Movie>> getListOfMoviesInTheYear(List<Movie> listOfMovies){
		
		
		return null;
	}

}
