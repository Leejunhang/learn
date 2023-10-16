
public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

abstract class Animal1 {
	abstract void speak();
}

class Dog1 extends Animal1 {
	@Override
	void speak() {
		System.out.println("멍멍");
	}
}

class Cat1 extends Animal1 {
	@Override
	public void speak() {
		System.out.println("야옹");
	}
}

abstract class Tiger1 extends Cat1 {
	abstract void bite();
}

//부모는 한명밖에 없다. extends는 하나 밖에 받을 수 없다.
//추상클래스 vs 일반클래스

