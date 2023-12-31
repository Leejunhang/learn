package Exception;

public class Class01 {

	public static void main(String[] args) {
		try {
			//예외가 발생할 가능성이 있는 코드
		} catch(예외클래스1 e1) {
			//예외클래스1 처리 코드
		} catch(예외클래스2 e2) {
			//예외클래스2 처리 코드
		} catch(Exception e) {
			//예외가 발생했을 때 처리 코드
		} finally {
			//블록을 빠져나가기 전에 실행 코드
		}
	}
}

//예외 처리
//예외란 프로그램 실행 중 발생할 수 있는 문제 혹은 오류
//이러한 예외가 발생하면 프로그램이 보통 강제 종료 되거나 혹은 원하는 식으로 프로그램 진행되지 않는다.
//이러한 예외를 처리하는 과정을 예외 처리(Exception Handling)라고 한다.

//try-catch 문을 사용하여 예외처리를 한다.
//try 블록 내에서 예외가 발생하는 코드를 작성하고, catch 블록에서 해당 예외를 처리하는 코드를 작성한다.
//try-catch 문이 작성되면 try 블록 내에서 예외가 발생하면, 바로 빠져나가서 catch 블록을 실행한다.

//우리가 현재 자바에서는 try-catch문을 작성하기 이전에 if문으로 예외가 발생하지 않게 미리 방지해두는 것이 중요하다.






