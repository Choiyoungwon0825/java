package sec01_basicsyntax.Ex02_JavaBasicStructure;

public class 메소드오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		print(3);
		print(5.5);
		print(5, 5);

	}

	// 컴파일러는 메서드 시그너처(Method Signature)가 다르면
	// 메서드 이름이 동일하여도 다른 메서드로 인식

	public static void print() {
		System.out.println("데이터가 없습니다.");
	}

	public static void print(int a) {
		System.out.println(a);
	}

	public static void print(double a) {
		System.out.println(a);
	}

	public static void print(int a, int b) {
		System.out.println("a : " + a + " b : " + b);

	}
}
