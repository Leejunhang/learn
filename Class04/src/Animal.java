//부모클래스
public class Animal {
	String name;
	int age;
	
	Animal() {
		name = "???";
		age = 0;
	}
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println("The animal is eating.");
	}
	
	void sleep() {
		System.out.println("The animal is sleeping.");
	}
}

//자식 클래스 name, age, eat(), sleep()