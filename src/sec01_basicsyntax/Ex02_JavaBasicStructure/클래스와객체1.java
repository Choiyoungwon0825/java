package sec01_basicsyntax.Ex02_JavaBasicStructure;


public class 클래스와객체1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 참조변수 a 를 선언하고 클래스 A객체 생성하기
		A a = new A();

		// 객체 내부 필드 m의 값에 5를 대입
		a.m = 5;

		System.out.println(a.m);
		a.print();

	}
}

class A { // 클래스
	int m = 3; // 정의된건 필드 

	void print() { // 메소드
		System.out.println("객체 생성 및 활용");
	}
}
