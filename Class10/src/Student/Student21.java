package Student;

public class Student21 extends Student{
	private static int gradeNumber = 21;
	private static int number = 1;
	private int student;
	private String zero = "000";
	
	Student21() {
		super(gradeNumber + "0" + number, 3);
		student = number;
		number++;
	}
	
	String zeroSet() {
		int num = student;
		while(num/10 > 0) {
			zero = zero.substring(0, zero.length()-1);
			num /= 10;
		}
		return zero;
	}
	
	@Override
	public String toString() {
		return "이름 : " + getName() + ", 학년 : " + getGrade() + 
				", 학번 : " + gradeNumber + zeroSet() + student;
	}
}
