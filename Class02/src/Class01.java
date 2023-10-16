
public class Class01 {
	public static void main(String[] args) {
//		for(int i = 0; i<10; i++) {
//			System.out.println(i);
//		}
//		
//		int i = 0; // 초기식
//		while(i<10) {
//			System.out.println(i++);
//			//i++;//증감식
//		}

		//(0 2 4 6 8 10 ... 100)
//		for(int i=0; i<=100; i+=2) {
//			System.out.println(i);
//		}
//		
//		int i = 0;
//		while(i<=100) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		//구구단
		//----------2단----------
		//2 X 1 = 2
		//2 X 2 = 4
		
		for(int j = 2; j<10; j++) {
			System.out.println("---------" + j +"단---------");
			for(int i = 1; i<10; i++) {
				System.out.println(j + " X " + i + " = " + i*j);
			}
		}
		
		int i=2;
		while(i<10) {
			int j=1;
			System.out.println("---------" + i +"단---------");
			while(j<10) {
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
		
		i=2;
		int j=1;
		while(i<10) {
			if(j==1) {
				System.out.println("---------" + i +"단---------");
			}
			System.out.println(i + " X " + j + " = " + i*j);
			j++;
			if(j>=10) {
				j = 1;
				i++;
			}
		}
	}
}

//반복문
//for문
//for(1.초기식 ;2.조건식 ;3. 증감식) {
//	코드
//}
//1.초기식 -> 처음 시작 정해준다. -> 어디부터 시작할래? 시작
//2.조건식 -> 특정 조건을 만족할때 반복 -> 언제까지 할래? 끝
//3.증감식 -> 시작부터 끝까지 도달하는 방식 -> 어떻게 진행할래? 중간

//while문
//while(조건식) {
//  코드
//}
//언제까지 할래? -> 끝

//for(1.초기식, 초기식, 초기식, 초기식; 2.; 3. 증감식, 증감식, 증감식,)
//for(int i=0,j=1,k=10; i<10&&j<20||k<100; i++, j+=2, k*=2)
//for(; 2. 조건식;)

//break, continue
//switch -> break를 쓰면 switch문을 빠져나왔다.
//break -> for문, while문, switch문을 빠져나올 수 있게 도와줌.

