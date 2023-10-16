
public class OuterClass {
	private int a;
	
	public void outerMethod() {
		InnerInterface inner = new InnerInterface() {
			@Override
			public void innerMethod() {
				System.out.println("내부 이너메소드");
			}
		};
	}
	
	private interface InnerInterface {
		void innerMethod();
	}
}
