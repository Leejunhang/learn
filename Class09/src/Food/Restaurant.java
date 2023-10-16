package Food;

public class Restaurant extends Food{
	String menu;
	
	Restaurant() { //숨겨진 코드
		super();
		menu = "없음";
	}
	
	Restaurant(String nation, String menu) {
		super(nation);
		this.menu = menu;
	}
	
	@Override
	void printNation() {
		super.printNation();
		System.out.println("저희의 메인 메뉴는 " + menu + "입니다.");
	}
}
