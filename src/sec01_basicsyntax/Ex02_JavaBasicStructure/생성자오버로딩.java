package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 생성자오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1();
		A1 a2 = new A1(3);
		A1 a3 = new A1(3, 5);
		A1 a4 = new A1(3, 5, 3);

	}

}

class A1 {
	A1() {
		System.out.println("하나");
	}

	A1(int a) {
		System.out.println("둘");
	}

	A1(int a, int b) {
		System.out.println("셋");
	}

	A1(int a, int b, int c) {
		System.out.println("넷!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}