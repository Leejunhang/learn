//조건문 기초실습, 심화실습

import java.util.Scanner;

public class Class02 {
	public static void main(String[] args) {
		int a = 1;
		if(10 < a) {
			System.out.println("안녕하세요");
		} else if(a > 5) {
			System.out.println("반갑습니다.");
		} else if(a > 6) {
			System.out.println("안녕");
		} else {
			System.out.println("안녕히 가세요.");
		}
		
		//입력 Scanner 둘이서 가위바위보, 누가 이겼는지
		//조건문을 통해서 "?입니다." 1 -> 가위, 2 -> 바위, 3 -> 보
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		int b = scan.nextInt();
			
		if(a == 1) {
			System.out.println("바위");
		}else if(a == 2) {
			System.out.println("가위");
		} else if(a == 3) {
			System.out.println("보");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		switch(a) {
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("가위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
		}
			
		int num = 1;
		switch(num) {
		case 12://if(num==12)
			System.out.println(num);
			break;
		case 1:
			num *= 10;
			break;
		case -5:
			--num;
			break;
		case (int)10.25:
			System.out.println(num<2);
			break;
		case 'a':
			System.out.println("안녕하세요.");
			break;
		default:
			System.out.println("종착역입니다.");
		}
	}
}
