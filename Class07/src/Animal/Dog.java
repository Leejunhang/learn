package Animal;

public class Dog extends Animal{ //상속받았을 경우, 부모의 것들을 자식클래스가 마음대로 사용가능.
	String play;
//	String name = "멍멍"; //자식 클래스를 먼저 찾아보고, 자식클래스에 없으면 부모클래스를 찾아본다.
//	int age;
	
	Dog(String name, int age, String play) {
		super(name,age);
		this.play = play; //this.play = 전역변수
	}
	
	void sleep() {
		super.sleep();
		System.out.println("강아지는 잠을 자는걸 좋아해");
	}
	
	void eat() {
		super.eat();
		System.out.println(name + "이(가) 먹는다.");
	}
		
	void play() {
		System.out.println("취미는 "+ play);
	}
}
