//4.int a = 10, int b = 20, int c = 30, if문을 가지고 -> C가 가장 크다.라고 출력하기
//(단, 3가지 방법)

public class Test05 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a<c && b<c) { //논리연산자
			System.out.println("C가 가장 크다.");
		}
		
		if(a<c) { //중첩
			if(b<c) {
				System.out.println("C가 가장 크다.");
			}
		}
		
		if(a >= c) {
			System.out.println("a가 c보다 크다.");
		} else if(b >= c) {
			System.out.println("b가 C보다 크다.");
		} else {
			System.out.println("C가 가장 크다.");
		}
	}
}
