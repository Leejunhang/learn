package Food;

public class Korean extends Restaurant{
	private String soju;
	private int seat;
	private int maxSeat;
	
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
	
	Korean(String menu, String soju, int seat) {
		super("한국", menu);
		this.soju = soju;
		this.maxSeat = seat;
		this.seat = seat;
	}
	
	Korean(String nation, String menu, String soju) {
		super(nation, menu);
		this.soju = soju;
	}
	
	Korean(String nation, String menu, String soju, int seat) {
		super(nation, menu);
		this.soju = soju;
		this.seat = seat;
	}
	
	int getSeat() {
		return seat;
	}
	
	void setSeat(int seat) {
		this.seat = seat;
	}
	
	void reservation(Consumer consumer) {
		if(this.seat >= consumer.getMember()) {
			System.out.println("예약이 가능합니다.");
			System.out.println("예약자 : " + consumer.getName() + " 인원 수 : " + consumer.getMember());
			seat -= consumer.getMember();
		}
		else {
			System.out.println("예약이 불가능합니다. 좌석이 부족합니다. 현재 남은 좌석 : " + seat);
		}
	}
	
	@Override
	void printNation() {
		super.printNation();
		System.out.println("음식과 어울리는 술은 " + soju + "를 추천드립니다.");
	}
}
