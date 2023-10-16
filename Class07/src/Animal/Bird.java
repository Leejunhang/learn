package Animal;

public class Bird extends Animal{
	boolean wings;
	String sings;
	
	Bird() {
		//super();
		this.wings = false;
		this.sings = "---";
	}
	
	Bird(String name, int age) {
		super(name, age);
		this.wings = false;
		this.sings = "---";
	}
	
	Bird(String name, int age, boolean wings, String sings) {
		super(name, age);
		this.wings = wings;
		this.sings = sings;
	}
	
	void fly() {
		System.out.println(name + "이(가) 날아다닌다~");
	}
	
	void song() {
		System.out.println(name + "이(가) 부릅니다 -> " + sings);
	}
	
	void songTo(String sings) {
		System.out.println(name + "이(가) 다른 새와 함께 부릅니다 -> " + sings + this.sings);
	}
	
	void songToge(String name, String sings) {
		System.out.println(this.name + "이(가) " + name + "와 함께 부릅니다 -> " + sings + this.sings);
	}
	
	void songTogether(String name, int age, boolean wings, String sings) {
		birdInfo(name, age, wings, sings);
		birdInfo(this.name, this.age, this.wings, this.sings);
	}
	
	void birdInfo(String name, int age, boolean wings, String sings) {
		System.out.println("이름 : " + name + ", 나이 : " + age);
		if(wings) {
			System.out.println("저는 날 수 있습니다.");
		} else {
			System.out.println("저는 날 수 없습니다.");
		}
		System.out.println("노래 부르겠습니다. " + sings);
	}
	
	void songWith(Bird bird) {
		birdInfo2(bird);
		birdInfo2(this);
	}
	
	void birdInfo2(Bird bird) {
		System.out.println("이름 : " + bird.name + ", 나이 : " + bird.age);
		if(bird.wings) {
			System.out.println("저는 날 수 있습니다.");
		} else {
			System.out.println("저는 날 수 없습니다.");
		}
		System.out.println("노래 부르겠습니다. " + bird.sings);
	}
	
	
}
