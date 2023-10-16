
public class Outer2 {
	static int a;
	
	
	public static class Inner {
		public void printOuter() {
			System.out.println("Outer : " + a);
		}
	}
}
