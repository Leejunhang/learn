
public class Class08 {

	public static void main(String[] args) {
		int[][] student = new int[6][4];
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<4; j++) {
				student[i][j] = 20; 
			}
		}
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}
		
		//10X10 배열 1~100 다 넣어주고 사각형으로 출력.
		int[][] arr = new int[10][10];
		
		System.out.println("------------------------------------");
		for(int i=0, k=0; i<10; i++, k+=10) {
			for(int j=0; j<10; j++) {
				arr[i][j] = k+j+1;
			}
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				arr[i][j] = 10*i+j+1;
			}
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

//1차원 배열


//다차원 배열
//자료형[][] 배열명 = new 자료형[크기][크기];

//별만들기 -> 반복문
//숫자모양 -> 배열
//왕거지게임
//{"노예" < "시민" < "귀족" < "왕"}
//노예가 왕을 만나면 왕을 죽이고 게임을 승리

