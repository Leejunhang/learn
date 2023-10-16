package Shape;

public class Shape {
	private double area;
	
	Shape() {
		area = 0;
	}
	
	Shape(double area) {
		this.area = area;
	}
	
	double getArea() {
		return area;
	}
	
	void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "넓이는 " + area + "입니다.";
	}
}

//객체 - 추상클래스, 인터페이스
//자기만의 프로그램 -> 상속, 오버라이딩, 오버로딩...

//추상클래스 (Abstract Class)
//인스턴스를 생성할 수 없는 클래스 (혼자있으면 아무것도 할 수 없다.)
//다른 클래스에 상속을 해주기 위한 용도로 사용

//메서드의 시그니처(이름, 매개변수, 반환타입)만 선언을 하고 나머지는 자식 클래스에서 작성해라고 넘겨준다. <- 추상메서드

//객체 생성 불가능
//일반적인 메서드와 변수를 가질 수 있다.
//하나 이상의 추상 메서드를 가질 수 있다.

//추상 클래스는 자식 클래스에서 추상 메서드를 반드시 구현하도록 강제한다.
//클래스 선언 abstract class
//메서드 선언 abstract 자료형

//자식 클래스에서 추상 메서드를 재구성할 때, 반드시 @Override 붙여줘야 한다.













