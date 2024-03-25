package sec01_basicsyntax.Ex02_JavaBasicStructure;

class B {
	int m = 3; // 필드
	int n = 4; // 필드

	void work1() {
		int k = 5; // 지역변수
		System.out.println(k);
		work2(3); // work2 안에 정의된 지역변수를 스택 메모리에 추가
	}

	void work2(int i) { // 인수를 변수 i 에 대입해 입력매개변수로 활용
		int j = 4;
		System.out.println(i + j);

	}

}

public class 필드와지역변수구분 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B();
		// 필드값 출력
		System.out.println(a.m);
		a.work1();
		a.work2(2);

	}

}
