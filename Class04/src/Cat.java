
public class Cat extends Animal{
	String name;
	int age;
	
	Cat(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println("야옹~");
	}
	
	void sleep() {
		System.out.println("고양이가 잠을 잡니다.");
	}
}

//Cat cat = new Cat();

//식당 -> 어느 나라음식?, 식당 이름, 평점 (부모클래스)

//가게 -> 메뉴, 가격 (자식클래스)






