package 이너클래스;

/*클래스 정의 및 참조변수명을 사용/미사용의 경우 매개변수 객체 전달*/

interface A8 {
	public abstract void abc();
}

//#1. 자식클래스를 직접 생성
class B8 implements A8 {
	public void abc() {
		System.out.println("1매개변수 전달");
	}
}

class C8 {
	void cde(A8 a) {
		a.abc();
	}

}

public class 어나니머스클래스예제3 {
	public static void main(String[] args) {
		C8 c = new C8();
		// #1. 방법#1 클래스명 O + 참조변수명 O
		A8 a = new B8();
		c.cde(a); // 매개변수 전달
		// #2. 방법#2 클래스명 O + 참조변수명 X
		c.cde(new B8()); // 매개변수 전달
	}
}
