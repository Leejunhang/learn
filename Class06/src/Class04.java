import java.util.Scanner;

public class Class04 {
	public static void main(String[] args) {
		String[] cardGame = {"거지", "시민", "귀족", "왕"};
		int score = 0;
		
		for(int i=0; i<4; i++) {
			int player1 = setting(1);
			int player2 = setting(2);
			
			score += play(player1, player2);
			if(score > 10 || score < -10) {
				break;
			}
		}
		
		printRes(score);
	}
	
	static int setting(int player) {
		Scanner sc = new Scanner(System.in);
		System.out.println("카드 : {1.거지, 2.시민, 3.귀족, 4.왕}");
		System.out.println("플레이어 " + player + " 차례 : ");
		player = sc.nextInt();
		return player;
	}
	
	static int play(int player1, int player2) {
		if((player1 == 1 && player2 == 4) || (player1 == 4 && player2 == 1)) {
			System.out.println("노예와 왕이 만났습니다!");
			if(player1 == 1) {
				return 100;
			} else {
				return -100;
			}
			//break; -> switch, 반복문을 멈춰줌.
		}
		else if(player1 > player2) {
			return 1;
		} else if(player2 > player1) {
			return -1;
		}
		return 0;
	}
	
	static void printRes(int score) {
		if(score > 10) {
			System.out.println("Player 1이 히든 룰로 승리하였습니다.");
		} 
		else if(score < -10) {
			System.out.println("Player 2가 히든 룰로 승리하였습니다.");
		}
		else if(score > 0) {
			System.out.println("Player 1이 승리하였습니다.");
		} else if(score < 0) {
			System.out.println("Player 2가 승리하였습니다.");
		} else {
			System.out.println("무승부입니다.");
		}
	}
}
