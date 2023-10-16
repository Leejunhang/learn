import java.util.Scanner;

public class Class04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=100; i++) {
			//코드
			if(i%2 == 1) {
				continue;
			}
			System.out.print(i);
		}	
		//사용자가 숫자를 계속 입력 -> 입력된 값을 합해서 출력해주면 된다.
		//사용자가 음수를 입력하면 종료, 사용자가 두 자리수 이상을 입력하면 더해지지 않아야한다.
		
	}
}

//break, continue

//break 멈춰
//switch, 반복문 -> switch, 반복문 더 이상 실행하지말고 멈춰줘.

//continue 계속해줘
//반복문 -> 내 아래의 코드를 무시하고 반복문 계속 실행해줘.