public class Class02 {
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(5+2);
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5/2);
		System.out.println(5%2);
			
		System.out.println(5 < 6); // ?
		System.out.println(5 > 6); // ?
		System.out.println(5 <= 6); // ?
		System.out.println(6 >= 6); // ?	
		System.out.println(5 == 5); // ?
		System.out.println(6 != 5); // ?
		
		System.out.println(!(5 == 5));
		
		int a = 1;
		int b = 2;
		
		System.out.println(a > b);
		System.out.println(a * b);
		System.out.println(!(a == b));
		
		// b가 1보다 크고 10보다 작은지?
		//System.out.println(1 < b < 10);
		System.out.println(1 < b && b < 10);
		
		int num_123 = 123;
		// a,b 둘 중 하나라도 음수인지?
		System.out.println(a < 0 || b < 0);
		
		num_123 = num_123 + 100;
		num_123 += 100;
		System.out.println(num_123); // 323
		
		System.out.println(num_123++); // 323
		System.out.println(++num_123); // 325
		System.out.println(num_123);   // 325
		System.out.println(--num_123); // 324
		System.out.println(num_123--); // 324
		System.out.println(num_123); // 321 322 323 324 325
	}
}

//연산자
//산술연산자 - +, -, *, /, %
//비교연산자 - <, >, <=, >=, ==, !=
//부정연산자 - !
//논리연산자 - &&(and), ||(or)
//대입연산자 - a = b -> 우항의 '값'을 좌항에 대입한다.
//자료형 변수명 = 값
//식별자 - 숫자가 제일 앞에 올 수 없다. 특수문자 - 언더바(_) 사용
//int, double, out, System, print ...
//변수 - 전부 소문자, 클래스, 함수 - 첫 글자만 대문자
//snake - helloWorld, camel - Print, Print_Out 
//증감연산자 - 값을 증가시키고, 감소시키고
//+=, -=, *=, /=, %=
//++, --
//전위증가 전위감소 -> ++num, --num -> 코드를 실행하기 전에
//후위증가 후위감소 -> num++, num-- -> 코드를 실행한 후에

//주석 -> 컴퓨터는 못읽고 사람만 읽을 수 있는 메모
// -> 오른쪽 전부 ctrl + /
// /*< - > */