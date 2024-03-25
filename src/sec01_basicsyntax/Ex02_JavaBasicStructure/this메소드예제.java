package sec01_basicsyntax.Ex02_JavaBasicStructure;

class Aㄱ {
	int m1, m2, m3, m4;

	Aㄱ() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	Aㄱ(int a) {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	Aㄱ(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;

	}

	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}

}

class Bㄱ {
	int m1, m2, m3, m4;

	Bㄱ() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;

	}

	Bㄱ(int a) {
		this(); // B() 생성자 호출
		m1 = a;
	}

	Bㄱ(int a, int b) {
		this(a);
		m2 = b;
	}

	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}

}

public class this메소드예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aㄱ aㄱ1 = new Aㄱ();
		Aㄱ aㄱ2 = new Aㄱ(40);
		Aㄱ aㄱ3 = new Aㄱ(50, 60);

		Bㄱ bㄱ1 = new Bㄱ();
		Bㄱ bㄱ2 = new Bㄱ(70);
		Bㄱ bㄱ3 = new Bㄱ(80, 90);

		aㄱ1.print();
		aㄱ2.print();
		aㄱ3.print();
		System.out.println();
		bㄱ1.print();
		bㄱ2.print();
		bㄱ3.print();

	}

}
