package Exception;

public class Class03 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		try {
			for(int i=0; i<10; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과했습니다.");
		}
	}
}
