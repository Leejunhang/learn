import java.util.Scanner;

public class Class03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int a; // 변수 선언
//		double d = 123.123; // 변수 선언과 초기화
//		//a = 12; // 변수 초기화
//		//a = a + 100; // 초기화이전엔 쓰레기 값이 들어가있다.
//		
//		a = scan.nextInt();
//		System.out.println("a : " + a);
//		
//		d = scan.nextDouble();
//		System.out.println("d : " + d);
//		
//		String str;
//		str = scan.next();
//		System.out.println("str : " + str);
//		
//		scan.nextLine();
//		str = scan.nextLine();
//		System.out.println("str : " + str);
		
		double d1, d2;
		System.out.print("실수 2개를 입력하세요 : ");
		d1 = scan.nextDouble();
		d2 = scan.nextDouble();
		
		System.out.println("두 수의 합 : " + d1 + d2);
		System.out.println(d1 + d2 + "두 수의 합 : ");
		
		System.out.print("점수를 2개를 입력하세요 : ");
		int i1 = scan.nextInt();
		int i2 = scan.nextInt();
		boolean b = i1==100&&i2==100;
		
		System.out.println("철수 : " + i1 + "점, 영희 : "
				+ i2 + "점, 성공 : " + (i1>=100&&i2>=100));
	}
}

//출력 - System.out
//입력 - System.in

//실수 2개를 입력받고, 2개의 합을 출력
//철수, 영희가 엄마가 둘 다 시험에서 100점을 맞으면 -> 사용자 2개 입력
//철수 : ?점, 영희 : ?점, 성공:true or false











