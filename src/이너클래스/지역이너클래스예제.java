package 이너클래스;

/*지역이너클래스 내부에서 외부 멤버 및 메서드 지역변수 활용*/

class A4 {
	int a = 3; // 필드

	void abc() {
		int b = 5; // 지역변수
		// 지역이너클래스
		class B4 {
			void bcd() {
				System.out.println(a); // 필드
				System.out.println(b); // 지역변수
				a = 5;
				// b=7; //지역이너클래스에서 사용하는 지역변수는 자동으로 final로 선언
			}
		}
		B4 bb = new B4();
		bb.bcd();
	}
}

public class 지역이너클래스예제 {
	public static void main(String[] args) {
		// #1. 객체 생성 및 메서드 호출
		A4 a = new A4();
		a.abc();
	}
}