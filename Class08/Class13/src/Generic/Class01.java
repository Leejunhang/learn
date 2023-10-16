package Generic;

public class Class01 {
	public static void main(String[] args) {
		Item<String> str = new Item<>();
		str.setItem("아이템");
		
		Item<Integer> itg = new Item<>();
		itg.setItem(123);
		
		Pair<String, String> str2 = new Pair<>("첫째", "둘째");
		str2.getI1();
		str2.getI2();
	}
}

//제네릭 (Generic)
//클래스, 메소드, 인터페이스에서 매개변수 전달 받을 때, 타입에 관계없이 사용할 수 있도록 해주는 기능이다.
//타입을 <> 안에 적는다.
//ArrayList<Object>