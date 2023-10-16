
public class Class01 {

	public static void main(String[] args) {
		Person p = new Person();
//		p.age = 1;
//		p.name = "park";
		System.out.println(p.age + " " + p.name);
		
		Person p2 = new Person();
		System.out.println(p2.age + " " + p2.name);
		
		Person p3 = new Person("Park", 22);
		System.out.println(p3.age + " " + p3.name);
		
		Person p4 = new Person("Kim");
		System.out.println(p4.age + " " + p4.name);
		
		Person p5 = new Person(50);
		System.out.println(p5.age + " " + p5.name);
		
		int studentNumber = 1;
		Student s1 = new Student("A", 12, "010-456-789", studentNumber++);
		Student s2 = new Student("B", 12, "010-556-783", studentNumber++);
		Student s3 = new Student("C", 12, "010-486-769", studentNumber++);
		
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		
		Student s4 = new Student("010-123-456");
		Student s5 = new Student("Jack");
		Student s6 = new Student("A", 12, "010-456-789");
		//System.out.println((int)'9');
		s6.printStudent();
	}
}

//생성자
//객체를 생성할 때, 객체를 초기화하는 특별한 메소드
//객체가 생성될 때, 자동으로 호출된다.
//생성자를 사용하기 위해서는 반드시 클래스와 같은 이름으로 사용을 해야한다.

//기본 생성자(Default Constructor)
//매개변수가 없이 호출되는 생성자
//객체를 생성할 때, 바로 호출됨. <- 따로 선언하지 않아도 된다.

//클래스명(){
//	코드
//}

//생성자는 객체를 생성할 때만 실행된다.

//Student -> 이름, 나이, 연락처, 학번 -> 몇번째

