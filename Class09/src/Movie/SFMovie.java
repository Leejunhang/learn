package Movie;

public class SFMovie extends Movie{//행동: 장르 소개
	SFMovie(String title, int duration) {
		super(title, duration);
	}
	
	@Override
	void displayGenre() {
		System.out.println("장르 : SF");
	}
}
