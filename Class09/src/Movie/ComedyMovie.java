package Movie;

public class ComedyMovie extends Movie{//행동: 장르 소개
	ComedyMovie(String title, int duration) {
		super(title, duration);
	}
	
	@Override
	void displayGenre() {
		System.out.println("장르 : 코미디");
	}
}
