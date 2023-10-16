
public class Dog extends Animal{
	String leash;
	
	Dog(String type) {
		super(type);
	}

	Dog(String species, String name, int age) {
		super(species, name, age);
	}
	
	Dog(String species, String name, int age, String leash) {
		super(species, name, age);
		this.leash = leash;
	}

	void speak() {
		super.speak();
	}

	void wlk() {
		System.out.println(name + " 이(가) 꼬리를 흔들면 산책나갈 준비를 합니다.");
		System.out.println(leash + " 를 준비해주세요.");
	}

	void slp() {
		System.out.println(name + " 이(가) 배를 보이며 잠을 잡니다.");
	}

	void trt() {
		System.out.println(name + " 이(가) 개껌을 먹습니다.");
	}
}
