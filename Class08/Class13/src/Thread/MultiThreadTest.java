package Thread;

public class MultiThreadTest {
	public static void main(String[] args) {
		MultiThread multi1 = new MultiThread(1);
		MultiThread multi2 = new MultiThread(2);
		MultiThread multi3 = new MultiThread(3);
		
		multi1.start();
		multi2.start();
		multi3.start();
	}
}
