package Movie;

public class ComedyMovie extends Movie{//행동: 장르 소개
	private static final String genre = "코미디";
	ComedyMovie(String title, int duration) {
		super(title, duration);
	}
	
	static final void displayGenre() {
		System.out.println("장르 : " + genre);
	}
}
