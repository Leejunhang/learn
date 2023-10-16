import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num >= 90) {
			System.out.println("A학점");
		}
		else if(num>=80) {
			System.out.println("B학점");
		}
		else if(num >= 70) {
			System.out.println("C학점");
		}
		else if(num >= 60 ) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");
		}
	}

}
//2.점수 하나 입력 -> 학점을 A,B,C,D,F  (90 80 70 60 50)