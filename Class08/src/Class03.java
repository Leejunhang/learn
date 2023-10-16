
public class Class03 {
	public static void main(String[] args) {
		BankAccount Kim = new BankAccount("110-410-45565", 100000000);
		
		System.out.println("계좌의 잔액은 " + Kim.getBalance() + "입니다.");
		Kim.deposit(100000000);
		Kim.deposit(-100000000);
		
		Kim.withdraw(100000000);
		Kim.withdraw(999999999);
		
		System.out.println("계좌의 잔액은 " + Kim.getBalance() + "입니다.");
	}
}

//캡슐화 - 정보은닉
//은행 계좌 클래스
//계좌번호 -> 변동 불가, 잔액 -> 변동 가능

//1.
//식당 + 좌석 수, 소비자 -> 예약자명, 인원 수
//남은 좌석 수보다 인원 수가 더 많으면 예약 불가
//오버라이딩, 캡슐화

//2.
//RPG 게임
//유닛 - (캐릭터, 몬스터) - (직업)
//유닛 - 공격, 레벨업, 체력
//몬스터 - 타입
//캐릭터 - 경험치
//직업 - 직업이름





