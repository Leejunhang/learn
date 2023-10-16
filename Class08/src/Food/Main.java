package Food;

public class Main {

	public static void main(String[] args) {
		Food food = new Food("한국");
		Food food2 = new Food("북한");
		Restaurant res = new Restaurant("프랑스", "푸아그라");
		Korean korea = new Korean("한우","처음처럼");
		Japanese jap = new Japanese("타코야끼","사케");
		American america = new American(res, "와인");
		
		korea.printSoju();
	}
}
