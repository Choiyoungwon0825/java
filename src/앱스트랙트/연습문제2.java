package 앱스트랙트;

abstract class A {
	abstract void abc();
}

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A() {
			@Override
			void abc() {
				System.out.println("반갑습니다");
			}
		};

		a.abc();

	}

}
