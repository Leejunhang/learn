package Food;

public class American extends Restaurant{
	String drink;
	
	American() {
		super("미국", "햄버거");
	}
	
	American(String menu) {
		super("미국", menu);
	}
	
	American(String menu, String drink) {
		super("미국", menu);
		this.drink = drink;
	}
	
	American(String nation, String menu, String drink) {
		super(nation, menu);
		this.drink = drink;
	}
	
	American(Restaurant res, String drink) {
		super(res.nation, res.menu);
		this.drink = drink;
	}
	
	void printDrink() {
		System.out.println("음식과 어울리는 술은 " + drink + "를 추천드립니다.");
	}
	
	int Ame(String str) {
		return 0;
	}
}
