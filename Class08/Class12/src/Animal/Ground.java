package Animal;

public abstract class Ground extends Animal {
	private int foot;
	
	void sleep() {
		System.out.println(super.name + "이(가) 잠을 잡니다.");
	}
	
	abstract void eat();
	abstract void walk();
}
