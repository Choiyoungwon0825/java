package 이너클래스;

/*클래스 미정의 및 참조변수명을 사용/미사용의 경우 매개변수 객체 전달*/

interface A9 {
	public abstract void abc();
}

class C9 {
	void cde(A9 a) {
		a.abc();
	}
}

public class 어나니머스클래스예제4 {
	public static void main(String[] args) {
		C9 c = new C9();
		// #3. 방법#3 클래스명 X + 참조변수명 O
		A9 a = new A9() {
			public void abc() {
				System.out.println("1매개변수 전달");
			}
		};
		c.cde(a); // 매개변수 전달
		// #4. 방법#4 클래스명 X + 참조변수명 X
		c.cde(new A9() {
			public void abc() {
				System.out.println("2매개변수 전달");
			}
		}); // 매개변수 전달
	}
}