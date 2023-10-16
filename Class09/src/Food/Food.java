package Food;

public class Food {
	String nation;
	
	Food() {
		nation = "알 수 없음";
	}
	
	Food(String nation) {
		this.nation = nation;
	}
	
	void printNation() {
		System.out.println(nation + "본토의 맛을 느낄 수 있습니다.");
		return;
	}
}
