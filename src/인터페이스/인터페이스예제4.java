package 인터페이스;

/*자식클래스의 직접 정의를 통한 인터페이스타입의 객체 생성 (방법#1)*/

interface A4 {
	int a = 3;

	void abc();
}

class B4 implements A4 {
	public void abc() {
		System.out.println("방법#1. 자식클래스 생성자로 객체 생성");
	}
}

public class 인터페이스예제4 {
	public static void main(String[] args) {
		// #1. 객체 생성
		A4 b1 = new B4();
		A4 b2 = new B4();

		// #2. 메서드 호출
		b1.abc();
		b2.abc();
	}
}
