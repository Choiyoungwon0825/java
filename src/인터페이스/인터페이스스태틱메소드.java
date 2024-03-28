package 인터페이스;

/*인터페이스내의 정적(staic) 메서드*/

interface A8 {
	// 앞에 static 붙히면댐
	static void abc() {
		System.out.println("A 인터페이스의 정적 메서드 abc()");
	}
}

public class 인터페이스스태틱메소드 {
	public static void main(String[] args) {
		// #1.정적메서드 호출
		A8.abc();
	}
}
