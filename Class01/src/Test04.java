//3.점수 5개를 입력받는다. 최고점을 출력.
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		System.out.print("점수를 입력하세요 : ");
		int n1 = sc.nextInt();
		if(max < n1) {
			max = n1;
		}
		
		System.out.print("점수를 입력하세요 : ");
		n1 = sc.nextInt();
		if(max < n1) {
			max = n1;
		}
		
		System.out.print("점수를 입력하세요 : ");
		n1 = sc.nextInt();
		if(max < n1) {
			max = n1;
		}
		
		System.out.print("점수를 입력하세요 : ");
		n1 = sc.nextInt();
		if(max < n1) {
			max = n1;
		}
		
		System.out.print("점수를 입력하세요 : ");
		n1 = sc.nextInt();
		if(max < n1) {
			max = n1;
		}
		
		System.out.println("최대값은 " + max + "입니다.");
	}
}
