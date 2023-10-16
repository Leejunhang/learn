package Thread;

public class Counter {
	private int count;
	
	public synchronized void increment() {
		count++;
	}
	
	public synchronized void decrement() {
		count--;
	}
	
	public void printCount() {
		System.out.println(count);
		synchronized (this) {
			count*=2;
		}
	}
	
	public synchronized int getCount() {
		return count;
	}
}
