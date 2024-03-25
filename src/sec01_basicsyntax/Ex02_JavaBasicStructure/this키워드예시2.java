package sec01_basicsyntax.Ex02_JavaBasicStructure;

class A0 {
	int m;
	int n;

	void init(int m, int n) {
		m = m;
		n = n;
	}

}

class B0 {
	int m;
	int n;

	void init(int m, int n) {
		this.m = m;
		this.n = n;

	}

	void work() {
		this.init(2, 3);
	}
}

public class this키워드예시2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수명과 필드명이 동일하기 때문에 출력이 제대로 안됨
		A0 a0 = new A0();
		a0.init(2, 3);
		System.out.println(a0.m);
		System.out.println(a0.n);
		// 변수명과 필드명이 동일하지만 this 때문에 출력이 제대로 됨
		B0 b0 = new B0();
		b0.init(4, 5);
		System.out.println(b0.m);
		System.out.println(b0.n);

	}

}
