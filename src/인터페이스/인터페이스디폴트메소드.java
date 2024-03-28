package 인터페이스;

/*인터페이스 구현 및 디폴트메서드의 오버라이딩*/

interface A6 {
	void abc(); // 2020년 생성

	default void bcd() {
		System.out.println("A 인터페이스의 bcd()");
	} // 2030년 생성
}

//인터페이스 메소드를 오버라이딩할때는 퍼블릭을 붙혀줘야한다
class B6 implements A6 { // 2020년 생성
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}

class C6 implements A6 {
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}

	public void bcd() {
		System.out.println("C 클래스의 bcd()");
	}
}

public class 인터페이스디폴트메소드 {
	public static void main(String[] args) {
		// #1. 객체 생성
		A6 a1 = new B6();
		A6 a2 = new C6();

		// #2. 메서드 호출
		a1.abc(); // B 클래스의 abc()
		a1.bcd(); // A 인터페이스의 bcd()

		a2.abc(); // C 클래스의 abc()
		a2.bcd(); // C 클래스의 bcd()
	}
}