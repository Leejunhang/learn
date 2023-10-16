//2차원 배열
public class Class07 {
	public static void main(String[] args) {
		int[][] arr = new int[8][8];
		
		//arr[0]
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		//...
		arr[0][7] = 8;
		for(int i=0; i<8; i++) {
			arr[0][i] = i+1;
		}
		for(int i=0; i<8; i++) {
			arr[1][i] = i+1;
		}
		for(int i=0; i<8; i++) {
			arr[2][i] = i+1;
		}
		//...
		for(int i=0; i<8; i++) {
			arr[7][i] = i+1;
		}
		
		for(int j=0; j<8; j++) {
			for(int i=0; i<8; i++) {
				arr[j][i] = i+1;
			}
		}
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				arr[i][j] = j+1;
			}
		}
		
//		for(int i=0; i<8; i++) {
//			System.out.print(arr[0][i] + " ");
//		}
//		System.out.println();
//		for(int i=0; i<8; i++) {
//			System.out.print(arr[1][i] + " ");
//		}
//		System.out.println();
//		for(int i=0; i<8; i++) {
//			System.out.print(arr[2][i] + " ");
//		}
		
		for(int j=0; j<8; j++) {
			for(int i=0; i<8; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
}

//한 줄짜리 1차원 배열을 여러개 사용.
//반복문 안에 반복문

//String[][] arr = new String[7][8]
//8개짜리 배열이 7개 있다.