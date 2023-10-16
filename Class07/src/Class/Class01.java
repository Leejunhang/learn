package Class;

public class Class01 {

	public static void main(String[] args) {
		int[][] arr = new int[8][8];
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if((i >= 8/2 && i%2 == 1) || (j >= 8/2 && j%2 == 1)) {
					arr[i][j] = i*8+j+1;
				}
				else if((i < 8/2 && i%2 == 0) || (j < 8/2 && j%2 == 0)) {	
					arr[i][j] = i*8+j+1;
				}
				else {
					arr[i][j] = 0;
				}
			}
		}
		
		//i:0, j:3,4
		//i:1, j:2,5
		//i:2, j:1,6
		//i:3, j:0,7
		for(int i=0, j = arr.length/2-1; i<arr.length/2; i++, j--) {
			if(i==0 || j ==0 || i==arr.length-1 || j == arr.length-1) {
				continue;
			}
			arr[i][j] = 0;
			arr[i][arr.length-1-j] = 0;
		}
		
		//i:4, j:0,7
		//i:5, j:1,6
		//i:6, j:2,5
		//i:7, j:3,4
		for(int i=arr.length/2, j=0; i<arr.length; i++,j++) {
			if(i==0 || j ==0 || i==arr.length-1 || j == arr.length-1) {
				continue;
			}
			arr[i][j] = 0;
			arr[i][arr.length-1-j] = 0;
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[i][j] < 10) {
					System.out.print(" " + arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
