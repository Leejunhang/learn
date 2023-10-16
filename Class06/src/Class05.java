//클래스와 객체
public class Class05 {
	public static void main(String[] args) {
		Person kim = new Person("KIM", 23); //kim.name = "KIM"; kim.age = 23;
		Person choi = new Person("CHOI", 12); //choi.name = "CHOI"; choi.age = 12;
		Person park = new Person("PARK", 34); //park.name = "PARK"; park.age = 34;
		Person lee = new Person();
		
		//System.out.println("이름 : " + kim.name + ", 나이 : " + kim.age);
		kim.speak();
		kim.run();
		kim.eat();
		//System.out.println("이름 : " + choi.name + ", 나이 : " + choi.age);
		choi.speak();
		choi.run();
		choi.eat();
		//System.out.println("이름 : " + park.name + ", 나이 : " + park.age);
		park.speak();
		park.run();
		park.eat();
	}
}

//클래스 -> 파일 
//클래스 -> 설계도
//객체 -> 설계도를 사용하여 만든 것.

//생성자
//생성할 때, 객체한테 값을 전달해주는 것. (객체한테 만들어질때, 첨부파일 전달)
