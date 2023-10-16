
public class Student {
	String name;
	int age;
	String phoneNumber = "010-1234-5678";
	int studentNumber = 0;
	
	Student() {
		name = "Unknown";
		age = 0;
		phoneNumber = "Unknown";
		studentNumber = 0;
		System.out.println("객체가 생성되었습니다.");
	}
	
	Student(String str1) {//String 하나를 매개변수로 받는 생성자
		this();
		age = 0;
		studentNumber = 0;
		
		if(str1.charAt(0) < 58) {
			phoneNumber = str1;
			name = "Unknown";
		} else {
			name = str1;
			phoneNumber = "Unknown";
		}
	}
	
	Student(int num1) {
		this();
		name = "Unknown";
		age = num1;
		phoneNumber = "Unknown";
		studentNumber = 0;
	}
	
//	Student(String str2) {//String 하나를 매개변수로 받는 생성자
//		name = "Unknown";
//		age = 0;
//		phoneNumber = str2;
//		studentNumber = 0;
//	}
	
	Student(String str1, int num1, String str2) {
		//this();//클래스 내부(생성자 내부)에서 기본 생성자를 호출
		this(str1, num1, str2, 1);
	}
	
	Student(String name, int age, String phoneNumber, int studentNumber) {
		this();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.studentNumber = studentNumber;
	}
	
	void printStudent() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age + ", 연락처 : " 
					+ this.phoneNumber + ", " + "학번 : " + this.studentNumber);
	}
}

//this -> 클래스 내부를 가르킨다. (this.인스턴스변수) 
//Student.printStudent(); 단, this -> 해당 객체 
//this() -> 메소드, 생성자 -> s1(); 
//생성자 부분에서 다른 생성자를 불러오는 것.
//생성자 가장 첫번째 줄에 나와야한다.
