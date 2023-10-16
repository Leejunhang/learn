package Food;

public class Korean extends Restaurant{
	String soju;
	
	Korean() {
		//super();
		super("한국", "김치");
	}
	
	Korean(String menu) {
		super("한국", menu);
	}
	
	Korean(String menu, String soju) {
		super("한국", menu);
		this.soju = soju;
	}
	
	Korean(String nation, String menu, String soju) {
		super(nation, menu);
		this.soju = soju;
	}
	
	void printSoju() {
		super.printMenu();
		System.out.println("음식과 어울리는 술은 " + soju + "를 추천드립니다.");
	}
}
