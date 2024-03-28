package 이너클래스;

/*익명이너클래스를 활용하여 인터페이스 객체 생성*/

class A7 {
	C7 c = new C7() {
		public void bcd() {
			System.out.println("익명이너클래스");
		}
	};

	void abc() {
		c.bcd();
	}
}

interface C7 {
	public abstract void bcd();
}

public class 어나니머스클래스예제2 {
	public static void main(String[] args) {
		// #1. 객체 생성 및 메서드 호출
		A7 a = new A7();
		a.abc(); // 익명이너클래스
	}
}