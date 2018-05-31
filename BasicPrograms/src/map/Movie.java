package map;

public class Movie {

	@Override
	public String toString() {
		return "Movie [actorName=" + actorName + ", movieName=" + movieName
				+ ", year=" + year + "]";
	}

	private String actorName;
	private String movieName;
	private int year;

	public Movie(String actorName, String movieName, int year) {
		super();
		this.actorName = actorName;
		this.movieName = movieName;
		this.year = year;
	}

	public String getActorName() {
		return actorName;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getYear() {
		return year;
	}

}
