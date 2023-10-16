package Student;

public class Student20 extends Student{
	private static int gradeNumber = 20;
	private static int number = 1;
	private int student;
	private String zero = "000";
	
	Student20() {
		super(gradeNumber + "0" + number, 4);
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

//학번(2) + 학과(4) + 학생(4)