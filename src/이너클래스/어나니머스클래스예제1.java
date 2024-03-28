package 이너클래스;

/*인터페이스를 상속한 이너클래스를 생성하여 인터페이스 객체 생성*/

class A6 {
	C6 c = new B6();

	void abc() {
		c.bcd();
	}

	class B6 implements C6 {
		public void bcd() {
			System.out.println("인스턴스 이너클래스");
		}
	}
}

interface C6 {
	public abstract void bcd();
}

public class 어나니머스클래스예제1 {
	public static void main(String[] args) {
		// #1. 객체 생성 및 메서드 호출
		A6 a = new A6();
		a.abc(); // 인스턴스 이너클래스
	}
}