package Food;

public class Consumer {
	private String name;
	private int member;
	
	Consumer(String name, int member) {
		this.name = name;
		this.member = member;
	}
	
	String getName() {
		return name;
	}
	
	int getMember() {
		return member;
	}
	
	void setMember(int member) {
		this.member = member;
	}
	
	int reservation(int seat) {
		if(seat >= this.member) {
			System.out.println("예약이 가능합니다.");
			System.out.println("예약자 : " + name + " 인원 수 : " + member);
			seat -= member;
		}
		else {
			System.out.println("예약이 불가능합니다. 좌석이 부족합니다. 현재 남은 좌석 : " + seat);
		}
		return seat;
	}
}
