// 1. String world = "Hello World." 모든 문장은 마침표로 마무리된다라는 가정하에 length 사용하지 않고
// 총 길이를 출력해보자.

public class Test04 {
	public static void main(String[] args) {
		String world = "Hello World.";
		
		System.out.println(world.lastIndexOf('.') + 1);
		int index = 0;
		int cnt = 0;
		
		while(true) {
			//cnt++; 마침표 포함해서 세주는 위치
			if(world.charAt(index) == '.') {
				break;
			}
			cnt++;
			index++;
		}
		System.out.println(cnt);
	}
}
