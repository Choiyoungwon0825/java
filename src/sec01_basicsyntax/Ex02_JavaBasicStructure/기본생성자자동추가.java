package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 기본생성자자동추가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA aaa = new AAA(); // 컴파일러가 자동으로 추가한 기본 생성자를 호출해 객체 생성
		BBB bbb = new BBB(); // 직접 정의한 기본생성자를 호출해 객체 생성
		// C c = new C(); 기본 생성자 호출 불가능
		CCC ccc = new CCC(3); // 직접 정의한 생성자를 호출해 객체 생성

		aaa.work();
		bbb.work();
		ccc.work();

	}

}

class AAA {
	int m;

	void work() {
		System.out.println(m);
	}

}

class BBB {
	int m;

	void work() {
		System.out.println(m);
	}

	BBB() {
		// 기본 생성자를 직접 정의
	}
}

class CCC {
	int m;

	void work() {
		System.out.println(m);
	}

	CCC(int a) {
		m = a; // 입력매개변수를 포함하고 있는 생성자 정의
		// 입력매개변수로 전달된 값으로 필드를 초기화한다.
	}
}
