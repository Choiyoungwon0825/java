package sec01_basicsyntax.Ex02_JavaBasicStructure;

import org.w3c.dom.views.AbstractView;

// 클래스 내부에서 필드,메서드에 앞에 자동으로 붙는 this 키워드
class AB {
	int m;
	int n;

	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;
		this.n = b;
	}

	void work() {
		this.init(2, 3);
	}
}

public class this키워드예시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 객체 생성
		AB ab = new AB();
		// 메소드 호출 / 필드값 활용
		ab.work();
		System.out.println(ab.m);
		System.out.println(ab.n);
	}

}
