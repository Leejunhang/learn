//변수 심화실습 //연산자 이론, 기초실습, 심화실습
public class Class01 {
	public static void main(String[] args) {
		int a = 10;
		long a2 = 11;
		float b = (float) 10.0; //자바 내에서 기본적인 실수형태가 double
		float c = (float) 20.25;
		String str; //char 변수들의 집합, 속에 메소드도 들어있다.
		char ch;
		
		System.out.println(a+1);
		System.out.println(a+b); // 변수 혹은 값이 연산할 때, 더 높은 자료형으로 변환되서
		System.out.println(a/b); // 10 / 10.0
		System.out.println(b/c); // 10.0 / 20.25
		System.out.println(a/3); // 둘 다 자료형이 int여서 int로 출력됨.
		System.out.println(a%b); // 0.0
		System.out.println(b%c); // 10.0
		System.out.println(a%3); // 1
		
		double d1 = 10.0;
		double d2 = 20.25;
		System.out.println(d1 < d2); //T
		
		boolean b2 = d1 >= d2;
		System.out.println(b2); // F
		System.out.println(!b2); // T
		System.out.println(d1 == 10.0); // 10.0000 // T
		System.out.println(d2 != 20.25); // 20.2500 // F
		System.out.println((int) d2*10000 == (int) 20.25 * 10000); //T
		
		System.out.println("->" + (d1 < d2 && b2)); //T && F -> F
		System.out.println(d1 == 10.0 || d2 != 20.25); //T || F -> T
		//d1이 10.0이랑 같아? 또는 d2가 20.25 같지 않아?
		System.out.println(d1 < d2 && b2 || d1 == 10.0); // T && F || T -> F||T

		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		System.out.println(n1 >= --n2 || n3 != 3 && n3 > n2 && n3-- > n2++);
		//T || F && T && T -> T && T && T -> T
		
		d1 += 11;
		System.out.println(d1); //21.0
		d2 /= 4; // d2 = d2 / 4;
		System.out.println(d2); //5.0625
		
		d1 %= d2; //d1 = d1 % d2; 나머지는 정수? //5.0625 * 4 -> 20.25
		System.out.println(d1); //21.0 - 20.25
		
		System.out.println(d2++);
		System.out.println(d2);
		System.out.println(--d2);
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println((num1++) + (num2++)); // 10 + 20
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}
}

//변수 종류 많다.

//연산자
//산술연산자 - +,-,*,/,%
//비교연산자 - <,>,<=,>=,==,!= boolean값이 반환된다.
//대입연산자 - a = b -> 'a는 b다'가 아닌 b의 '값'을 a에 대입한다.
//부정연산자 - ! 뒤집개 true -> false, false -> true
//증감연산자 - 자기자신에게 값을 더한다, 뺀다, ...
//a = a + 10; -> a += 10
//+=, -=, *=, /=, %= -> 12 %= 5, 12 = 12%5
//++, --
//++a,--a : 전위 - 해당 코드를 시작하기 전에 값을 1 증가or감소시킨다.
//a++,a-- : 후위 - 해당 코드를 시작하고 나서 값을 1 증가or감소시킨다.
//논리연산자 - &&(and), ||(or) -> boolean 을 대상으로한 연산자
//and -> 양 쪽 둘다 true때만 true
//T && T = T
//T && F = F
//F && T = F
//F && F = F
//or -> 양 쪽 둘다 false때만 false, 둘 중 하나라도 true면 true
//T && T = T
//T && F = T
//F && T = T
//F && F = F

