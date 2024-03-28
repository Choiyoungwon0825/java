package 파이널;

/*final 메서드와 final 클래스의 특징 */

class A0 {
	void abc() {
	}

	final void bcd() {
	}
}

class B0 extends A0 {
	void abc() {
	}
	// void bcd() {} //final 메서드는 오버라이딩 불가
}

final class C0 {
}

//class D extends C {} //final 클래스는 상속자체가 불가

public class 파이널예제2 {
	public static void main(String[] args) {

	}
}
