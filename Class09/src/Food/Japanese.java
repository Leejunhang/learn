package Food;

public class Japanese extends Restaurant{
	String sake;
	
	Japanese() {
		super("일본", "스시");
	}
	
	Japanese(String menu) {
		super("일본", menu);
	}
	
	Japanese(String menu, String sake) {
		super("일본", menu);
		this.sake = sake;
	}
	
	Japanese(String nation, String menu, String sake) {
		super(nation, menu);
		this.sake = sake;
	}
	
	void printSake() {
		System.out.println("음식과 어울리는 술은 " + sake + "를 추천드립니다.");
	}
}
