package sec01_basicsyntax.Ex02_JavaBasicStructure;

class 답 {
	void print() {
		System.out.println("입력값이 없습니다.");
	}

	void print(int a) {
		System.out.println("정수 입력값 : " + a);
	}

	void print(double b) {
		System.out.println("실수 입력 값 : " + b);
	}

	void print(String c) {
		System.out.println("문자열 입력값 : " + c);
	}

}

public class 메소드오버로딩문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		답 답 = new 답();
		답.print();
		답.print(3);
		답.print(5.8);
		답.print("안녕");

	}

}
