package 타입캐스팅;

/*선언타입에 따른 사용가능한 멤버*/
class A2 {
	int m = 3;

	void abc() {
		System.out.println("A 클래스");
	}
}

class B2 extends A2 {
	int n = 4;

	void bcd() {
		System.out.println("B 클래스");
	}
}

public class 타입캐스팅_2 {
	public static void main(String[] args) {
		// #1. A 타입 / A 생성자
		A2 aa = new A2();
		System.out.println(aa.m);
		aa.abc();

		// #2. B 타입 / B 생성자
		B2 bb = new B2();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();

		// #3. A 타입 / B 생성자 : 다형적 표현
		A2 ab = new B2();
		System.out.println(ab.m);
		ab.abc();
	}
}
