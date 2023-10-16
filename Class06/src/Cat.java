
public class Cat extends Animal {

	String catTower;
	
	Cat(String type) {
		super(type);
	}

	Cat(String type, String name, int age) {
		super(type, name, age);
	}
	
	Cat(String type, String name, int age, String catTower) {
		super(type, name, age);
		this.catTower = catTower;
	}

	void speak() {
		super.speak();
	}

	void wlk() {
		System.out.println(name + " 이(가) 산책이 나가기 싫어서 높은 곳으로 도망갑니다.");
	}

	void slp() {
		System.out.println(name + " 이(가) " + catTower + " 위로 올라가 웅크리고 잠을 잡니다.");
	}

	void trt() {
		System.out.println(name + " 이(가) 츄르를 먹습니다.");
	}

}