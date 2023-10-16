package Shape;

public class Rectangle extends Shape{
	private double side;
	
	Rectangle() {
		
	}
	
	Rectangle(double side) {
		super(side*side);
	}
	
	Rectangle(double side1, double side2) {
		super(side1*side2);
	}
	
	Rectangle(double side1, double side2, double side3, double side4) {
		if(side1 == side2) {
			super.setArea(side1*side3);
		}
		else {
			super.setArea(side1*side2);
		}
	}
	
	Rectangle(String side) { //15cm -> 225 8미터
		for(int i=0; i<side.length(); i++) {
			if(side.charAt(i) < 65) {
				side = side.substring(0,i); //"15"
			}
		}
		int num = 0;
		for(int i=0; i < side.length(); i++) {
			num += (int) side.charAt(i) - 48;
			num *= 10;
		}
		num /= 10;
		
		super.setArea(num*num);
	}
	
	@Override
	public String toString() {
		return "넓이는 " + super.getArea() + "입니다.";
	}
}
