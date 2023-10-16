package Student;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		Student20 student1 = new Student20();
//		Student20 student2 = new Student20();
//		Student20 student3 = new Student20();
//		Student20 student4 = new Student20();
//		Student20 student5 = new Student20();
//		Student20 student6 = new Student20();
//		Student20 student7 = new Student20();
//		Student20 student8 = new Student20();
//		Student20 student9 = new Student20();
//		Student20 student10 = new Student20();
		ArrayList<Student20> student20 = new ArrayList<>(); 
		for(int i = 0; i<10; i++) {
			student20.add(new Student20());
		}

//		Student21 student11 = new Student21();
//		Student21 student21 = new Student21();
//		Student21 student31 = new Student21();
//		Student21 student41 = new Student21();
//		Student21 student51 = new Student21();
//		Student21 student61 = new Student21();
//		Student21 student71 = new Student21();
//		Student21 student81 = new Student21();
//		Student21 student91 = new Student21();
//		Student21 student110 = new Student21();
		ArrayList<Student21> student21 = new ArrayList<>(); 
		for(int i = 0; i<10; i++) {
			student21.add(new Student21());
		}
		
//		student1.printInfo();
//		student2.printInfo();
//		student3.printInfo();
//		student4.printInfo();
//		student5.printInfo();
//		student6.printInfo();
//		student7.printInfo();
//		student8.printInfo();
//		student9.printInfo();
//		student10.printInfo();
		for(int i=0; i<student20.size(); i++) {
			System.out.println(student20.get(i));
		}
		
//		student11.printInfo();
//		student21.printInfo();
//		student31.printInfo();
//		student41.printInfo();
//		student51.printInfo();
//		student61.printInfo();
//		student71.printInfo();
//		student81.printInfo();
//		student91.printInfo();
//		student110.printInfo();
		for(int i=0; i<student21.size(); i++) {
			System.out.println(student21.get(i));
		}
	}
}
