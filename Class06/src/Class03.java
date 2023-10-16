
public class Class03 {
	static int a;
	static int b;

	public static void main(String[] args) {
		int xasd;
		System.out.println(a);
		
		for(int i=0; i<10; i++) {
			
		}
	}
	
	static void fu(int a) {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void fu1(int b) {
		int a = 2;
		System.out.println(a + " " + b);
	}
	
	static void fu2(int a, int b) {
		
	}
}

//지역변수 -> 특정 지역에서만 사용가능
//전역변수 -> 전지역에서 사용가능

//전역변수로 작성하게 되면, 장점 : 모든 곳에서 접근이 가능하다. 단점 : 모든 곳에서 접근이 가능하다. (보안성)

//지역변수 할 때, 함수 안,밖 구분이 어려워요.
//변수가 선언된 위치 <- 어디의 지역변수
//지역의 구분은 항상 {} 사이
//변수 선언 -> 1. {} 사이, 2. () 사이 -> () 옆에 보면 {}