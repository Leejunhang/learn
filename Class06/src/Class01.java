
public class Class01 {
	public static void main(String[] args) {
		int arr[][] = new int[8][8];
		
		for (int i = 0; i < 8; i++) {
            //코드
			func1(arr, i);
        }
	}
	
	static void func1(int[][] arr, int i) {
		for (int j = 0; j < 8; j++) {
			arr[i][j]  = (i*8)+j+1;
			printArr(arr, i, j);
        }
		newLine();
	}
	
	static void printArr(int[][] arr, int i, int j) {
		System.out.print(arr[i][j] + " ");
	}
	
	static void newLine() {
		System.out.println();
	}
}

//함수
//for(){
//	코드 -> 함수
//}

