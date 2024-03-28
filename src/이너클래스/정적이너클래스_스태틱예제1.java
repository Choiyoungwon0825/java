package 이너클래스;

/*정적이너클래스에서의 외부멤버 사용 및 객체 생성*/

class A3 {
	int a = 3;
	static int b = 4;

	void method1() {
		System.out.println("instance method");
	}

	static void method2() {
		System.out.println("static method");
	}

	// static inner class
	static class B3 {
		void bcd() {
			// #1.필드 사용
			// System.out.println(a); //static은 static만 포함 가능
			System.out.println(b);
			// #2.메서드 호출
			// method1();//static은 static만 포함 가능
			method2();
		}
	}
}

public class 정적이너클래스_스태틱예제1 {
	public static void main(String[] args) {
		// #1. static inner class의 객체 생성
		A3.B3 b = new A3.B3();
		// #2. 메서드 호출
		b.bcd();
	}
}