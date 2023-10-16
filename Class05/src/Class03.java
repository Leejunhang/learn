import java.util.Scanner;

public class Class03 {

	public static void main(String[] args) {
		//입력 Scanner 둘이서 가위바위보, 누가 이겼는지
		//조건문을 통해서 "?입니다." 1 -> 가위, 2 -> 바위, 3 -> 보
		Scanner scan = new Scanner(System.in);
		
		int win = 0;
		int tie = 0;
		int lose = 0;
		
		for(int i=0; i<5; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			while(true) { //a != 1 && a != 2 && a != 3
				if(a == 1 || a == 2 || a == 3) {
					break;
				}
				System.out.println("잘못입력했습니다.");
				a = scan.nextInt();
			}
			
			if(a == b) {//a.equals(b)
				System.out.println("무승부");
				tie++;
			} else if(a==1 && b == 2) {
				System.out.println("패배");
				lose++;
			} else if(a == 1 && b == 3) {
				System.out.println("승리");
				win++;
			}
			else if(a == 2) {
				if(b==1) {
					System.out.println("승리");
					win++;
				} else if(b==3) {
					System.out.println("패배");
					lose++;
				}
			} else if(a == 3) {
				if(b==1) {
					System.out.println("패배");
					lose++;
				} else if(b==2) {
					System.out.println("승리");
					win++;
				} 
			}
		}
		//전에 코드를 반복문 감싸고, 변수 3개 만들어서 최종적으로 출력한다.
		System.out.println(win + "승 " + tie + " 무" + lose + " 패");
//			//switch 활용
//			if(a == b) {//a.equals(b)
//				System.out.println("무승부");
//			} else {
//				switch(a) {
//				case 1:
//					if(b==2) {
//						System.out.println("패배");
//					} else if(b==3) {
//						System.out.println("승리");
//					}
//					break;
//				case 2:
//					switch(b) {
//					case 1:
//						System.out.println("승리");
//					case 3:
//						System.out.println("패배");
//					}
//					break;
//				case 3:
//					if(b==1) {
//						System.out.println("패배");
//					} else if(b==2) {
//						System.out.println("승리");
//					} 
//					break;
//				}
//			}
		
	}
}

//반복문 -> 두명이서 5번 게임했을 때, 누가 이겼는지 혹은 1번째 사람이 (몇승 몇무 몇패) 
