import java.util.Scanner;

public class Class07 {

	public static void main(String[] args) {
		String[] str = new String[5];
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			str[i] = scan.next();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(str[i]);
		}
		
		//String 배열 5개짜리 -> 사용자 입력 받은 값이 배열에 들어있는지 없는지 찾아보는 프로그램.
		//str[0].equals(menu) -> true of false
		String menu = scan.next();

		for(int i=0; i<5; i++) {
			if(menu.equals(str[i])) {
				System.out.println("있습니다.");
				break;
			}
			if(i == 4) {
				System.out.println("없습니다.");
			}
		}
	}
}
