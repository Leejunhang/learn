package Generic;

public class Class02 {
	public static void main(String[] args) {
		int num = 123456;
		String str = "123456";
		
		//Integer.MAX_VALUE; int로 나타낼 수 있는 가장 큰 값
		//Integer.MIN_VALUE; int로 나타낼 수 있는 가장 작은 값
		
		System.out.println(Integer.parseInt(str)); //문자열을 int로 변환해준다.
		//1. 문자열 -> int (형변환)
		int number = 0;
		for(int i=0; i<str.length(); i++) {
			number *= 10;
			number += str.charAt(i) - 48;
		}

		System.out.println("number : " + number);
		
		System.out.println(Integer.toString(num)); //int를 문자열로 변환해준다.
		//2. int -> 문자열
		String s = "";
		s += num;
		System.out.println("number : " + s);
	}
	
	public static void func1(Object obj) {
		
	}
}

//객체끼리 전달하면 프로그램이 실행되거나, 그와 비슷한 메소드, 자료구조 등이 있을 때 변수는 같이 사용할 수가 없다.
//그러면 변수도 객체화할 수 있으면 어떨까??

//래퍼 클래스(Wrapper Class)
//Integer -> int를 객체화시켜줄 수 있는 클래스