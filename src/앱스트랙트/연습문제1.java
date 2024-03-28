package 앱스트랙트;

abstract class Q1 {
	abstract void abc();
}

class Q extends Q1 {
	@Override
	void abc() {
		System.out.println("안녕하세요");
	}
}

public class 연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 q1 = new Q();
		q1.abc();

	}

}
