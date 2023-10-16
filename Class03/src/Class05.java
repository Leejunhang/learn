
public class Class05 {

	public static void main(String[] args) {
		String greeting = "Hello";
		String sentence = greeting + "Professor";
		
		System.out.println(sentence);
		System.out.println(sentence.length());
		System.out.println(sentence.toLowerCase());//Hello
		System.out.println(sentence.toUpperCase());//hello
		System.out.println(greeting.replace('l', 'z'));
		System.out.println(greeting.substring(2)); //substring(a) -> a부터 끝까지
		System.out.println(sentence.substring(2,9)); //substring(a,b) -> a부터 b전까지
		
		System.out.println(sentence.charAt(4));
		System.out.println(sentence.indexOf("l")); //문자열에서 가장 앞에 있는 친구를 찾아서 반환
		System.out.println(sentence.indexOf("p"));
		System.out.println(sentence.indexOf("l", 4)); //(a,b) b부터 가장 앞에 있는 a를 찾아줘
		System.out.println(sentence.lastIndexOf('l')); //가장 뒤에 있는 친구 반환
		
		System.out.println(greeting.concat(sentence));
		System.out.println(greeting.equals("hello"));
		System.out.println(greeting.equalsIgnoreCase("hello"));
		System.out.println(greeting.compareTo("Aello"));
		System.out.println(greeting.compareTo("Hello"));
		System.out.println(greeting.compareTo("Hezzo"));
	}
}

//String -> 변수가 아니다.
//클래스 -> 객체구나

//public class String {
//	char[] c;
//	
//	boolean equals(char c2) {}

// 1. String world = "Hello World." 모든 문장은 마침표로 마무리된다라는 가정하에 length 사용하지 않고
// 총 길이를 출력해보자.
// 2. equalsIgnoreCase를 사용하지 않고, 2개의 문자열을 서로 비교해보자.
// 3. indexOf는 문자열의 처음, 마지막 특정 위치를 알 수 있었다. 그러면 해당 문자열 원하는 문자가 몇 개 들어있는지


