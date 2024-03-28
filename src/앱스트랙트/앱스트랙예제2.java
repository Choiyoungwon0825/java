package 앱스트랙트;

/*추상클래스를 상속하여 오버라이딩 수행*/

abstract class Animal2 {
	abstract void cry();
}

class Cat2 extends Animal2 {
	void cry() {
		System.out.println("야옹야옹야옹야옹야옹야옹");
	}
}

class Dog2 extends Animal2 {
	void cry() {
		System.out.println("멍멍멍멍멍멍멍멍멍멍멍멍");
	}
}

public class 앱스트랙예제2 {
	public static void main(String[] args) {
		// #1. 객체생성
		Animal2 animal1 = new Cat2();
		Animal2 animal2 = new Dog2();

		// #2. 메서드 호출
		animal1.cry(); // 야옹
		animal2.cry(); // 멍멍
	}
}