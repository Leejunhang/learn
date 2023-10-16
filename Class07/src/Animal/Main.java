package Animal;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("푸들", 3, "산책");
		
		dog.sleep();
		dog.walk();
		dog.eat();
		
		Bird bird = new Bird("짹짹이", 2, true, "랄랄라라");
		
		bird.eat();
		bird.fly();
		bird.song();
		
		Bird bird2 = new Bird("삐약이", 1, false, "삐약삐약삐약!");
		bird.songTo(bird2.sings);
		bird.songToge(bird2.name, bird2.sings);
		bird.songTogether(bird2.name, bird2.age, bird2.wings, bird2.sings);
		bird.songWith(bird2);
	}
}
