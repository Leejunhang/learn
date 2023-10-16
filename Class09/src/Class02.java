
public class Class02 {
	public static void main(String[] args) {
		Constants cons = new Constants();
		System.out.println(cons.num);
		//cons.num = 10;
		System.out.println(cons.PI * 5 * 5);
		System.out.println("우리 어플리케이션 이름 : " + cons.appName);
		cons.PI = 3.1415926535897;
		cons.appName = "카카오톡2";
	}
}

//상수(Constants)
//변하지 않는 수
//한 번 할당되면 더 이상 바꿀 수 없다.
//final 키워드 사용

//공장 -> 기계설비 -> 장난감 size

//정적 + 상수
//static final

//한식당 -> nation = "한국" -> static final nation = "한국"

//1. 학생 - 23학번, 22학번, 21학번, 20학번 <- 학번
//23000001, 23000002, 23000003
//23123401, 23123402, ...
//2. Movie -> SFMovie 장르 : SF static final 함께 적용해보기



