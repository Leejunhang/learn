import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int money;
		String menu;
		Scanner scan = new Scanner(System.in);

		System.out.println("1. 콜라 : 1000원, 2. 사이다 : 1200원, 3. 제로 : 1500원");
		System.out.print("금액을 입력하세요 : ");
		money = scan.nextInt();

		System.out.print("메뉴를 선택하세요 : ");
		menu = scan.next();
		
		switch(menu) {
		case "콜라":
			if(money >= 1000) {
				System.out.println("콜라가 나왔습니다. 거스름돈은 " + (money-1000) + "입니다.");
			}
			else {
				System.out.println("돈이 부족합니다.");
			}
			break;
		case "사이다":
			if(money >= 1200) {
				System.out.println("사이다가 나왔습니다. 거스름돈은 " + (money-1200) + "입니다.");
			}
			else {
				System.out.println("돈이 부족합니다.");
			}
			break;
		case "제로" :
			if(money >= 1500) {
				System.out.println("제로가 나왔습니다. 거스름돈은 " + (money-1500) + "입니다.");
			}
			else {
				System.out.println("돈이 부족합니다.");
			}
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}

}
//1.자판기 만들기
//금액을 넣어주세요: (입력)
//메뉴를 선택해주세요 : (메뉴1 -> 가격), (메뉴2 -> 가격) ... (입력) 메뉴 선택
//잔액이 부족합니다. or (메뉴)가 나왔습니다. 거스르돈 ??원이 나왔습니다.