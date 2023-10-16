
public class Class02 {
	public static int a = 10;
	public static int b = 20; //전역변수
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2; //전역변수 X
		
		System.out.println(function());
		System.out.println(a+b);
		function(a, b);
	}
	
	public static int function() {
		return a + b;
	}
	
	public static void function(int a, int b) {
		System.out.println(a+b);
	}
}

//지역변수 & 전역변수
//지역변수 -> 반복문 안에서 사용했었던, for(int i=0) {}
//매개변수 -> 지역변수