package Food;

public class Main {
	public static void main(String[] args) {
		Food food = new Food("한국");
		Food food2 = new Food("북한");
		Restaurant res = new Restaurant("프랑스", "푸아그라");
		Korean korea = new Korean("한우","처음처럼", 12);
		Japanese jap = new Japanese("타코야끼","사케");
		American america = new American(res, "와인");
		
		korea.printNation();
		
		Consumer con1 = new Consumer("Kim", 5);
		Consumer con2 = new Consumer("Kim", 5);
		Consumer con3 = new Consumer("Kim", 5);
		Consumer con4 = new Consumer("Kim", 2);
		
		korea.reservation(con1);
		korea.reservation(con2);
		korea.reservation(con3);
		
		System.out.println("남은 좌석 수 : " + korea.getSeat());
		
		con4.reservation(korea.getSeat());
	}
}

//만약 손님들이 먹고 나갔다면?
//오프라인 손님이 있다면?
//시간을 적용하면?

