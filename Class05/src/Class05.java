//사용자가 숫자를 계속 입력 -> 입력된 값을 합해서 출력해주면 된다.
//사용자가 음수를 입력하면 종료, 사용자가 두 자리수 이상을 입력하면 더해지지 않아야한다.

import java.util.Scanner;

public class Class05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
	
		while(true) {
			int n = scan.nextInt();
			if(n<0) {
				break;
			}
			else if(n > 9) {
				continue;
			}
			
			sum += n;
		}
		System.out.println(sum);
	}
}

//배열
//김포공항* - 공항시장 - 마곡나루* - 양천향교 - 가양* -증미 - 당산* - 국회의사당 - 여의도*
//9호선 급행*

//어떤 열차를 탈래? -> 급행인지 급행이 아닌지
//어디역에서 내릴래? -> 위에 있는 역 중에 입력(단, 급행열차는 일반역에 멈추지 않음.)
//내가 탄 열차가 지나온 역들이 쭉 출력.

//힌트 - 급행역과 일반역이 번갈아가면서 존재한다.




