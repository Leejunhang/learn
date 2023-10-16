
public class Class01 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.speak();
		Dog dog = new Dog();
		dog.speak();
		
		//Cat cat = new Animal(); 불가능
		Animal cat = new Cat();
		cat.speak();
		
//		Tiger tiger = new Dog(); 불가능
//		Tiger tiger = new Cat(); 불가능
		
		Animal tiger = new Animal();
		tiger.speak();
		Animal tigertiger = new Tiger();
		tigertiger.speak();
		Tiger tiger2 = new Tiger();
		
		Animal ani1 = tigertiger; //animal, dog, cat, tiger, tigertiger
		ani1.speak();
		Tiger ti1 = (Tiger) animal; //animal, dog, cat, tiger, tigertiger
		ti1 = (Tiger) tigertiger;
	}
}

class Animal {
	public void speak() {
		System.out.println("동물이 소리를 낸다.");
	}
}

class Dog extends Animal {
	@Override
	public void speak() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("야옹");
	}
}

class Tiger extends Animal {
	@Override
	public void speak() {
		System.out.println("어흥");
	}
}

//다형성
//1. 메서드 오버라이딩, 메서드 오버로딩
//2. 참조변수 - 객체 캐스팅

//캐스팅 (int) Math.random
//객체 캐스팅 (Character) moster

//다형성에서 부모-자식 관계에서 캐스팅을 사용할 수 있다.
//이 때, 참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버의 변수보다 작아야 한다.
//부모 <= 자식

//class Parent{}
//class Child extends Parent{}
//class Person{}
//
//Parent p1 = new Parent();
//Child c1 = new Child();
//Parent p2 = new Child(); // 가능
//Child c2 = new Parent(); // 불가능
//Person pp = new Person();

//참조 변수의 타입변환 (캐스팅)
//p1(new Parent), p2(new Child)
//c1 = (Child) p1
//c1 = (Child) p2
//c1 = (Child) pp //불가능

//p1 = (Child) c1; // 캐스팅을 생략 가능
//Parent parent = new Child(); //가능





