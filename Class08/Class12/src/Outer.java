
public class Outer {
	private int a;
	public Inner inner;
	
	public Outer(int a) {
		this.a = a;
		inner = new Inner();
	}
	
	public class Inner {
		public void printOuter() {
			System.out.println("Outer : " + a);
		}
	}
}
