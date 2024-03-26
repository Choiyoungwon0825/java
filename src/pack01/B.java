package pack01;

public class B {
	public void print() {
		// 객체 생성
		A a = new A();

		// 멤버활용
		System.out.print(a.a + " "); // public 접근가능
		System.out.print(a.b + " "); // protected 접근가능
		System.out.print(a.c + " "); // default 접근 가능
//		System.out.println(a.d + " "); 는 private이라 접근 불가능

		System.out.println();

	}

}
