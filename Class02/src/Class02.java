
public class Class02 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.println("i : " + i + ", j : " + j);
				if(j == 5) {
					break;
				}
			}
		}

		for(int i=0; i<=100; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		for(int i=10; i>=0; i--) {
			if(i==0) {
				System.out.println("발사!!");
				break;
			}
			System.out.println(i);
		}
	}
}
//break, continue
//switch -> break를 쓰면 switch문을 빠져나왔다.
//break -> for문, while문, switch문을 빠져나올 수 있게 도와줌.

//continue
//for문, while문 건너뛸 수 있게 -> 내 아래 코드 더 이상 실행하지말고 계속해줘

//10
//9
//8
//7
//,,,
//발사!!

//1.구구단 -> Scanner 1을 입력하면 홀수단, 2를 입력하면 짝수단
//5개 입력받아서 최고점, 점수 학점
//2.숫자를 n개 입력받아서, A, B, C, D, F가 각각 몇 명인지, 최고점, 최하점, 평균










