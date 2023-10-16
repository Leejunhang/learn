package Food;

public class Cafe extends Food{
	String drink;
	
	Cafe() {
		super();
		drink = "없음";
	}
	
	Cafe(String nation, String drink) {
		super(nation);
		this.drink = drink;
	}
}
