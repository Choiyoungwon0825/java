package pkgEX;

import sec01_basicsyntax.Ex02_JavaBasicStructure.ABCD호출;

class B {
	void abc() { // 인스턴스 메서드
		System.out.println("instance 메서드");
	}

	static void bcd() { // 정적 메서드
		System.out.println("static 메서드");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스 메서드 활용(객체를 생성한 후 사용 가능)
		B b1 = new B();
		b1.abc();

		// 정적 메서드 활용
		// 1. 클래스명으로 바로 접근해 사용
		B.bcd();

	}

}
