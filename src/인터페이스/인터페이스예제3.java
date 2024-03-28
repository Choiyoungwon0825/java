package 인터페이스;

/*인터페이스 상속 자식클래스의 접근지정자*/

interface A3 {
	public abstract void abc();
}

interface B3 {
	void bcd(); // 생략시 public abstract 앞에 붙어있는거임
}

class C3 implements A3 {
	public void abc() {
		// ...
	}
}

/*
 * public -> default 불가능 class D implements B { void bcd() {
 * 
 * } }
 */
public class 인터페이스예제3 {
	public static void main(String[] args) {

	}
}