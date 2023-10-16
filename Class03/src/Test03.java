//왕과 거지게임
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cardGame = {"거지", "시민", "귀족", "왕"};
		int score1 = 0;
		int score2 = 0;
		int hr1 = 0;
		
		for(int i=0; i<4; i++) {
			System.out.println("카드 : {1.거지, 2.시민, 3.귀족, 4.왕}");
			System.out.println("플레이어 1 차례 : ");
			int player1 = sc.nextInt();
			System.out.println("플레이어 2 차례 : ");
			int player2 = sc.nextInt();
			
			if((player1 == 1 && player2 == 4) || (player1 == 4 && player2 == 1)) {
				System.out.println("노예와 왕이 만났습니다!");
				if(player1 == 1) {
					score1 += 4;
					hr1 = 1;
				} else {
					score2 += 4;
				}
				break;
			}
			else if(player1 > player2) {
				score1++;
			} else if(player2 > player1) {
				score2++;
			}
		}
		
		if(hr1 == 1) {
			System.out.println("Player 1이 히든 룰로 승리하였습니다.");
		}
		else if(score1 > score2) {
			System.out.println("Player 1이 승리하였습니다.");
		} else if(score1 < score2) {
			System.out.println("Player 2가 승리하였습니다.");
		} else {
			System.out.println("무승부입니다.");
		}
	}
}

//{"거지", "시민", "귀족", "왕"}
//{"거지", "시민", "귀족", "왕"}

// 계급 순으로 승패가 갈린다.
// 거지와 왕이 만나면 거지를 낸 플레이어가 게임에서 승리한다.
