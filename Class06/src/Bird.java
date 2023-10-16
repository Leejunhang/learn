
public class Bird extends Animal {

	String favorSeed;
	
	Bird(String type) {
		super(type);
	}

	Bird(String type, String name, int age) {
		super(type, name, age);
	}
	
	Bird(String type, String name, int age, String favorSeed) {
		super(type, name, age);
		this.favorSeed = favorSeed;
	}

	void speak() {
		super.speak();
	}

	void wlk() {
		System.out.println(name + " 이(가) 종이를 뜯어 몸을 치장하며 딴청을 부립니다.");
	}

	void slp() {
		System.out.println(name + " 이(가) 횟대에서 잠을 잡니다.");
	}

	void trt() {
		System.out.println(name + " 이(가) " + this.favorSeed + " 를 먹습니다.");
	}

}