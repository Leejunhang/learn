package Animal;

public class Cat extends Animal{
	String play2;
	String name;
	int age;
	
	Cat(String name, int age, String play2) {
		super(name,age);
		this.play2 = play2;
	}

	void sleep() {
		super.sleep();
		System.out.println("고양이는 박스에서 자는걸 좋아해");
	}
	
	void eat() {
		super.eat();
		System.out.println(name + "이(가) 먹지 않는다.");
	}
		
	void play2() {
		System.out.println("취미는 " + play2);
	}

}
